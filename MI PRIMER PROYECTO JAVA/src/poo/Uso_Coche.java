package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Coche micoche=new Coche();
	
	micoche.establece_color(JOptionPane.showInputDialog("introduce color"));
	
	System.out.println(micoche.dime_datos_generales());
	
	System.out.println(micoche.dime_color());
	
	micoche.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));
	
	System.out.println(micoche.dime_asientos());
		
	micoche.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
	
	System.out.println(micoche.dime_climatizador());
	
	System.out.println(micoche.dime_peso_coche());
	
	System.out.println("el precio final del coche es: "+ micoche.precio_coche());
			
	
	}

}
