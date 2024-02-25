package EjerciciosClase;
import javax.swing.JOptionPane;

public class Ejercicio9Juan {

    public static void main(String[] args) {
    	
        int cantidadAsignaturas = 5;
        
        double sumaCalificaciones = 0;

        for (int i = 1; i <= cantidadAsignaturas; i++) {
        	
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de la asignatura " + i + ":"));
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / cantidadAsignaturas;

        System.out.println("La media es de " + promedio);
    }
}
