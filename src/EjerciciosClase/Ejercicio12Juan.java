package EjerciciosClase;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio12Juan {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String numeroString = JOptionPane.showInputDialog("Igrsesar cantidad de numeros");
	        int n = Integer.parseInt(numeroString);

	        int[] numeros = new int[n];

	        for (int i = 0; i < n; i++) {
	            String numeroSuelto = JOptionPane.showInputDialog("Ingrese el número en la posición " + (i + 1) + ": ");
	            numeros[i] = Integer.parseInt(numeroSuelto);
	        }

	        ordenarNumeros(numeros);

	        StringBuilder mensaje = new StringBuilder("Números ordenados:\n");
	        for (int num : numeros) {
	            mensaje.append(num).append(" ");
	        }

	        JOptionPane.showMessageDialog(null, mensaje.toString());
	    }

	    public static void ordenarNumeros(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	        	
	            for (int j = 0; j < n - 1 - i; j++) {
	            	
	                if (array[j] > array[j + 1]) {
	                  
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }


	}

}