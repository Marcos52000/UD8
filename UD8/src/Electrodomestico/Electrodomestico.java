package Electrodomestico;

public class Electrodomestico {
	protected  int precioBase;
	protected  String color;
	protected  String consumoEnergetico;
	protected  double peso;
	
	final int PRECIO = 100;
	final String COLOR = "blanco";
	final String CONSUMO="F";
	final double PESO = 5;
	
	public Electrodomestico() {
		super();
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(int precioBase, double peso) {
		super();
		this.color = "blanco";
		this.consumoEnergetico = "F";
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, String consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	

	
	public String getColor() {
		return color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
}
