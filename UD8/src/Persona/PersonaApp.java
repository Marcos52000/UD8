package Persona;
public class PersonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("49902372P");
		Persona p2 = new Persona("Marcos", 21, "12345678P", "H");
		Persona p3 = new Persona("Marcos", 21, "12345678P", "H", 68.5, 1.73);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}
