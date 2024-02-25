package EjerciciosClase;

import javax.swing.JOptionPane;

public class EjercicioJuan15 {
    public static void main(String[] args) {
        jugarPiedraPapelTijera();
    }

    public static void jugarPiedraPapelTijera() {
       
        String[] opciones = {"piedra", "papel", "tijera"};

        
        String eleccionUsuario = JOptionPane.showInputDialog("Elige: piedra, papel o tijera").toLowerCase();

       
        if (!esValida(eleccionUsuario, opciones)) {
            JOptionPane.showMessageDialog(null, "Elección no válida. Por favor, elige piedra, papel o tijera.");
            return;
        }

     
        String eleccionComputadora = opciones[(int) (Math.random() * opciones.length)];

        
        JOptionPane.showMessageDialog(null, "Tu elección: " + eleccionUsuario + "\nElección de la computadora: " + eleccionComputadora);

       
        determinarResultado(eleccionUsuario, eleccionComputadora);
    }

    public static boolean esValida(String eleccion, String[] opciones) {
        for (String opcion : opciones) {
            if (opcion.equals(eleccion)) {
                return true;
            }
        }
        return false;
    }

    public static void determinarResultado(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equals(eleccionComputadora)) {
            JOptionPane.showMessageDialog(null, "¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                   (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                   (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            JOptionPane.showMessageDialog(null, "¡Ganaste!");
        } else {
            JOptionPane.showMessageDialog(null, "¡La computadora gana!");
        }
    }
}
