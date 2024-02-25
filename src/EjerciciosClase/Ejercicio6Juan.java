package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio6Juan {

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Introduzca una palabra:");
        contarVocalesConsonantes(palabra);
    }

    public static void contarVocalesConsonantes(String palabra) {
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            // Verificar si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocales++;
            } else if (Character.isLetter(caracter)) {
                // Si el caracter es una letra pero no es una vocal, se considera consonante
                consonantes++;
            }
        }

        // Mostrar los resultados en un cuadro de diálogo
        String mensaje = "Palabra: " + palabra + "\nVocales: " + vocales + "\nConsonantes: " + consonantes;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
