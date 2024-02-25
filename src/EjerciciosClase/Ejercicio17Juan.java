package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio17Juan {
    private static double saldo = 15000;

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        while (true) {
            String opcionString = JOptionPane.showInputDialog(
                    "Cajero Automático - Saldo actual: " + saldo + " euros\n" +
                    "1. Consultar saldo\n" +
                    "2. Realizar retiro\n" +
                    "3. Realizar depósito\n" +
                    "4. Salir");

            try {
                int opcion = Integer.parseInt(opcionString);

                switch (opcion) {
                    case 1:
                        consultarSaldo();
                        break;
                    case 2:
                        realizarRetiro();
                        break;
                    case 3:
                        realizarDeposito();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Gracias por usar el cajero automático. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese una opción válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }

    private static void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo + " euros");
    }

    private static void realizarRetiro() {
        String cantidadString = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
        try {
            double cantidad = Double.parseDouble(cantidadString);

            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + saldo + " euros");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad inválida.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida.");
        }
    }

    private static void realizarDeposito() {
        String cantidadString = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
        try {
            double cantidad = Double.parseDouble(cantidadString);

            if (cantidad > 0) {
                saldo += cantidad;
                JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: " + saldo + " euros");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida.");
        }
    }
}
