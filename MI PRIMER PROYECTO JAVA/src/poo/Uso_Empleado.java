package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
	
		Jefatura jefe_RRHH=new Jefatura("juan", 55000, 2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2750);
		
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2]=new Empleado("Maria Marin", 105000, 2002, 03, 15);
		
		misEmpleados[3]=new Empleado("Antonio",47500, 2009,11,9);
		
		misEmpleados[4]=jefe_RRHH; //poliformismo en accion, principio de sustitucion
		
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999,5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
	System.out.println(jefa_Finanzas.tomar_decisiones("dar mas dias de vacaciones a los empleados"));
	
	
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " +e.dameNombre()
			+" sueldo: " + e.dameSueldo() +
			" Fecha de Alta: " + e.dameFechaContrato());
			
		}
		
		
		
	}

}


@SuppressWarnings("rawtypes")
class Empleado implements Comparable{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre=nom;
		
		sueldo=sue;
		 
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		}
	
		public Empleado(String nom) {
			
			this(nom, 30000 ,  2000,01,01);
		}
	
	
	
	
	public String dameNombre() {//GETTER
		
		return nombre; 
		
	}
	public double dameSueldo() {//GETTER
		
		return sueldo;
	
	}
	
	public Date dameFechaContrato() {//GETTER 
		
		return altaContrato;
		
	}
	
	public void  subeSueldo(double porcentaje) { //SETTER
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	
			
		}
		
	 public int compareTo(Empleado otroEmpleado) {
	        if (this.Id > otroEmpleado.Id) {
	            return -1;
	        } else if (this.Id < otroEmpleado.Id) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

	class Jefatura extends Empleado implements Jefes{
		
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public String tomar_decisciones(String decision) {
		
		return "un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	private double incentivo;
	@Override
	public String tomar_decisiones(String decision) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}

