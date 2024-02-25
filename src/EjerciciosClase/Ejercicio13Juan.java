package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio13Juan {
    public static void main(String[] args) {
        
        String numeroString = JOptionPane.showInputDialog("Ingrese un número:");
        
        try {
        
            int numero = Integer.parseInt(numeroString);
            
           
            int cantidadDigitos = contarDigitos(numero);
            
  
            JOptionPane.showMessageDialog(null, "El número de dígitos en " + numero + " es: " + cantidadDigitos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

 
    public static int contarDigitos(int numero) {
       
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
       
        numero = Math.abs(numero);

       
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}

