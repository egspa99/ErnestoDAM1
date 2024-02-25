package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio5Juan {
    
	public static void main(String[] args) {
        
		String numero = JOptionPane.showInputDialog("Introduzca el numero");
		int N = Integer.parseInt(numero);
		
		generarFibonacci(N);
    }

    public static void generarFibonacci(int N) {
        int primero = 0;
        int segundo = 1;

        System.out.println("Primeros " + N + " números de la secuencia Fibonacci:");

        for (int i = 0; i < N; i++) {
            System.out.print(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
