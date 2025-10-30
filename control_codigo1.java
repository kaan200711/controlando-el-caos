package control_del_caos;

public class control_codigo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("=== Calculadora Básica ===");
        int a = 10;
        int b = 5;
 
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
          double porcentaje = ((double) a / b) * 100;
        System.out.println("Porcentaje: " + porcentaje + "%");
        System.out.println("Raíz cuadrada de " + a + ": " + Math.sqrt(a));

        int potencia = (int) Math.pow(a, b);
        System.out.println("Potencia: " + a + " ^ " + b + " = " + potencia);
	}

}
