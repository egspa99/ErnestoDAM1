package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio10Juan {

    public static void main(String[] args) {
    	
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
        
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente:"));
        
        
        Double resultado = Math.pow(base, exponente);

        JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " es: " + resultado);
    }
}
