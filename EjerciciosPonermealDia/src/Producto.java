package Relacion7;

public class Producto {
	private int codigo;
	private static int codigosiguiente;
	private String descripcion;
	private double precio;
	private static final int iva = 20;

	public Producto() {
		super();
	}

	public Producto(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo += codigosiguiente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static int getCodigosiguiente() {
		return codigosiguiente;
	}

	public static void setCodigosiguiente(int codigosiguiente) {
		Producto.codigosiguiente = codigosiguiente;
	}

	public static int getIva() {
		return iva;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double precioVenta(int cant) {
		double resultado = 0;
		double precioVenta;
		if (cant > 0) {
			precioVenta = (this.precio * iva) / 100;
			resultado = cant * (this.precio + precioVenta);
		}
		return resultado;

	}

}
