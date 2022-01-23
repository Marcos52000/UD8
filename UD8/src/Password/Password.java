package Password;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseņa;
	
	public Password() {
		this.longitud = 8;
		this.contraseņa ="";
	}

	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseņa= random(longitud);
		
		
	}
	private String random(int num) {
		String cont="";
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			cont = cont +random.nextInt(10) ;
		}
		return cont;
	}


	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseņa=" + contraseņa + "]";
	}
	
	
}
