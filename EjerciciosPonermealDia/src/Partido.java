package relacion7Liga;

import java.util.Objects;

public class Partido {

	private int golesLocal;
	private int golesVisitante;
	private static final int PARTIDOSJORNADAMAX = 38;
	private int jornada;
	private Equipo local;
	private Equipo visitante;
	private boolean jugado;

	public Partido(int jornada, Equipo local, Equipo visitante) throws PartidoException {
		super();
		if (local.equals(visitante)) {
			throw new PartidoException("Error, un equipo no puede jugar contra él mismo. ");
		}
		if (jornada < 1 || jornada > PARTIDOSJORNADAMAX) {
			throw new PartidoException("Error, jornada no válida");
		}
		this.jornada = jornada;
		this.local = local;
		this.visitante = visitante;
		this.jugado = false;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public boolean isJugado() {
		return jugado;
	}

	public int getJornada() {
		return jornada;
	}

	public Equipo getLocal() {
		Equipo resultado = new Equipo(this.local.getNombre(), this.local.getCiudad(), this.local.getEstadio());
		return resultado;
	}

	public Equipo getVisitante() {
		Equipo resultado = new Equipo(this.visitante.getNombre(), this.visitante.getCiudad(),
				this.visitante.getEstadio());
		return resultado;
	}

	public void ponerResultado(String resultado) throws PartidoException {
		int posicion = resultado.indexOf('-');
		if (posicion == -1) {
			throw new PartidoException("Resultado no válido");
		}
		try {
			int golesLocal = Integer.parseInt(resultado.substring(0, posicion));
			int golesVisitante = Integer.parseInt(resultado.substring(posicion + 1));
			this.golesLocal = golesLocal;
			this.golesVisitante = golesVisitante;
			this.jugado = true;

		} catch (Exception e) {
			throw new PartidoException("Valores no vï¿½lidos para el resultado.(num-num)");
			// TODO: handle exception
		}

	}

	public String getResultado() {
		String resultado;
		if (!this.jugado)
			resultado = "";
		else if (this.golesLocal == this.golesVisitante) {
			resultado = "X";
		} else if (this.golesLocal > this.golesVisitante) {
			resultado = "1";
		} else
			resultado = "2";
		return resultado;
	}

	@Override
	public String toString() {
		String resultado;
		if (!this.jugado) {
			resultado = "Partido entre equipo local " + this.local + " y equipo visitante " + this.visitante
					+ " todavï¿½a no se ha jugado.";
		} else
			resultado = "Partido entre equipo local " + this.local + " y equipo visitante " + this.visitante
					+ " jugado en el estadio " + local.getEstadio() + " de la ciudad " + local.getCiudad()
					+ " ha finalizado con " + this.golesLocal + " goles de equipo local y " + this.golesVisitante
					+ " goles de equipo visitante. Resultado quinieal= " + getResultado();
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jornada, local, visitante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return jornada == other.jornada && Objects.equals(local, other.local)
				&& Objects.equals(visitante, other.visitante);
	}

}
