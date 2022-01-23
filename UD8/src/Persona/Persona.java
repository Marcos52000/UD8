package Persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	public Persona(String dNI) {
		super();
		this.nombre = " ";
		this.edad = 0;
		DNI = dNI;
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String dNI, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dNI, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	

}
