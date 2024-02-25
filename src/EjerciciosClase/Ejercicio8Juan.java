package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio8Juan {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de números primos que desea generar:"));
        generarPrimos(N);
    }

    public static void generarPrimos(int N) {
        int contador = 0;
        
        String resultado = "Primeros " + N + " números primos:\n";

        for (int numero = 2; contador < N; numero++) {
            
        	if (divisoresPrimos(numero) == 2) {
                
        		resultado += numero + " ";
                
        		contador++;
            }
        }

        System.out.println(resultado);
    }

    public static int divisoresPrimos(int num) {
        int primos = 0;

        for (int i = 1; i <= num; i++) {
            
        	if (num % i == 0) {
                primos++;
            }
        }

        return primos;
    }
}
