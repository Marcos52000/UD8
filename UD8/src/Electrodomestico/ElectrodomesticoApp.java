package Electrodomestico;

import javax.swing.JOptionPane;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(200, 35);
		int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio"));
		String color = "";
		String consumo;
		do {
			color = JOptionPane.showInputDialog("Introduce el color");
			color = color.toLowerCase();
			
		} while (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris"));
		
		do {
			consumo = JOptionPane.showInputDialog("Introduce el consumo");
			consumo = consumo.toUpperCase();
		} while (consumo.equals("A") && consumo.equals("B") && consumo.equals("C") && consumo.equals("D") && consumo.equals("E")
				&& consumo.equals("F"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso"));
		Electrodomestico e3 = new Electrodomestico(precio, color, consumo , peso);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}

}
