package Password;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña ="";
	}

	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña= random(longitud);
		
		
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
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
}
