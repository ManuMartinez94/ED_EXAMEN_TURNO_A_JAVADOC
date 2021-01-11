
/**
 * 
 * @author Manuel Mart�nez Parre�o DNI 44892160R
 * @author <a href="manumony1@gmail.com> manumony1@gmail.com </a>
 * @version 2.5.8
 *
 */
public class EmpleadoED_44892160R {
	 static final double FACTOR_HORA_EXTRA = 1.2;
	 private String nombreCompleto, dni;
	 private double salarioBasePorHora = 10.56;
	 /**
	  * Constructor con tres par�metros
	  * 
	  * @param nombreCompleto nombre completo en may�sculas
	  * @param dni documento nacional de identidad con letra y sin espacio
	  */
	 public EmpleadoED_44892160R(String nombreCompleto, String dni) {
	 this.nombreCompleto = nombreCompleto;
	 this.dni = dni;
	 }
	 /**
	  * Calcula el salario bruto mensual en funci�n del salario base por hora y las horas extras
	  * El precio por hora de la hora exacta se determina con la constante FACTOR_HORA_EXTRA
	  * @param horasExtra n�mero de horas extra dedicadas redondeado a la baja (entero)
	  * @return devuelve el salario bruto mensual en euros con dos decimales
	  */
	 public double getSalarioEsteMes(int horasExtra) {
	 double cantidadExtra, salarioFinal;
	 cantidadExtra = horasExtra * this.salarioBasePorHora *
	FACTOR_HORA_EXTRA;
	 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
	 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
	 return salarioFinal;
	 }
	
	 // Este m�todo no lo comentaremos con JavaDoc
	 public static void main(String[] args) {
	 // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE L�NEA
	 EmpleadoED_44892160R emp = new EmpleadoED_44892160R("MANUEL MART�NEZ",
	"44892160R");
	 int horasExtra = 2;
	 System.out.println("El salario de " + emp.nombreCompleto + "este mes ser� de " + emp.getSalarioEsteMes(horasExtra)
	 + " euros, al hacer " + horasExtra + " horas extra.");
	 }
	}
