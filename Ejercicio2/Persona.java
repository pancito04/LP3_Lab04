package Ejercicio2;

public class Persona {
	private char sexo;
	private boolean chamba;
	private int sueldo;
	public Persona(char sexo_, boolean chamba_, int sueldo_) {
		sexo = sexo_;
		chamba = chamba_;
		sueldo = sueldo_;
	}
	public Persona() {
		sexo = ' ';
		chamba = false;
		sueldo = 0;
	}
	public Persona(char sexo_) {
		sexo = sexo_;
		chamba = false;
		sueldo = 0;
	}
	public char getSexo() {
		return sexo;
	}
	public boolean isChamba() {
		return chamba;
	}
	public void setChamba(boolean chamba) {
		this.chamba = chamba;
		if (chamba == false) {
			sueldo = 0;
		}
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
		if (sueldo == 0) {
			chamba = false;
		}
	}
}
