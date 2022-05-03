package Relacion7;

public class Producto {
	private static int codigo;
	private String descripcion;
	private double precio;
	private int iva;

	public Producto() {
		super();
	}

	public Producto(int codigo, String descripcion, double precio, int iva) {
		Producto.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.iva = iva;

	}

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Producto.codigo = codigo;
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

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double precioVenta(int cant) {
		double resultado = 0;
		double precioVenta;
		if (cant > 0) {
			precioVenta = (this.precio * iva) / 100;
			resultado = cant * (this.precio + precioVenta);
		} else {
			System.out.println("La cantidad debe ser mayor que 0 vuelva a intentarlo");
		}
		return resultado;

	}

}
