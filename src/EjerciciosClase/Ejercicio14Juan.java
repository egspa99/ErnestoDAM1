package EjerciciosClase;

import javax.swing.JOptionPane;

public class Ejercicio14Juan {
    public static void main(String[] args) {
      
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto:");

   
        int cantidadVocales = contarVocales(cadena);

    
        JOptionPane.showMessageDialog(null, "La cantidad de vocales en la cadena es: " + cantidadVocales);
    }

   
    public static int contarVocales(String cadena) {
       
        cadena = cadena.toLowerCase();

        int contador = 0;

        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

       
            if (esVocal(caracter)) {
                contador++;
            }
        }

        return contador;
    }

 
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}

