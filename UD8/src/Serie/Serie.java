package Serie;

public class Serie {
	String titulo;
	int numeroTemporadas;
	boolean entregado;
	String genero;
	String creador;
	
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	

}
