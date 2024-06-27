package poo;

public class Furgoneta extends Coche {

	private int capacidad_carga;
	
	private int plaza_extra;
	
	public Furgoneta(int plaza_extra, int capacidad_carga ) {
		
		super(); //llamar al constructor de la clase padre
		
		this.capacidad_carga=capacidad_carga;
		
		this.plaza_extra=plaza_extra;
		
		
	}
	
}
