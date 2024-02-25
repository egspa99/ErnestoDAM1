package EjerciciosClase;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LudopatiaMain {

    public static void main(String[] args) {
        EjercicioLudopatiaClase juego = new EjercicioLudopatiaClase();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad a apostar: ");
            double cantidadApostar = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Menú:");
            System.out.println("1. Determinar color");
            System.out.println("2. Determinar paridad");
            System.out.println("3. Determinar pasa/falta");
            System.out.println("4. Determinar docena");
            System.out.println("5. Elegir números");

            System.out.print("Ingrese el número de la opción deseada (...): ");
            int opcion = scanner.nextInt();

            int numeroAleatorio = juego.lanzarBolilla();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese 'rojo' (1) o 'negro' (2): ");
                    int colorChoice = scanner.nextInt();
                    int resultadoColor = juego.color(colorChoice, numeroAleatorio);
                    mostrarResultado(juego, resultadoColor, numeroAleatorio, cantidadApostar, colorChoice, 0, 0, 0);
                    break;
                case 2:
                    System.out.print("Ingrese 'par' (1) o 'impar' (2): ");
                    int paridadChoice = scanner.nextInt();
                    int resultadoParidad = juego.paridad(paridadChoice, numeroAleatorio);
                    mostrarResultado(juego, resultadoParidad, numeroAleatorio, cantidadApostar, 0, paridadChoice, 0, 0);
                    break;
                case 3:
                    System.out.print("Ingrese 'pasa' (1) o 'falta' (2): ");
                    int pasaFaltaChoice = scanner.nextInt();
                    int resultadoPasaFalta = juego.pasaFalta(pasaFaltaChoice, numeroAleatorio);
                    mostrarResultado(juego, resultadoPasaFalta, numeroAleatorio, cantidadApostar, 0, 0, pasaFaltaChoice, 0);
                    break;
                case 4:
                    System.out.print("Ingrese 'primera' (1), 'segunda' (2) o 'tercera' (3): ");
                    int docenaChoice = scanner.nextInt();
                    int resultadoDocena = juego.docena(docenaChoice, numeroAleatorio);
                    mostrarResultado(juego, resultadoDocena, numeroAleatorio, cantidadApostar, 0, 0, 0, docenaChoice);
                    break;
                case 5:
                    juego.elegirNumeros(scanner);
                    juego.verificarPremio(numeroAleatorio);
                   
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor válido.");
        } finally {
            scanner.close();
        }
    }

    private static void mostrarResultado(EjercicioLudopatiaClase juego, int premio, int numeroAleatorio, double cantidadApostar, int colorChoice, int paridadChoice, int pasaFaltaChoice, int docenaChoice) {
        int resultadoColor = juego.color(colorChoice, numeroAleatorio);
        int resultadoParidad = juego.paridad(paridadChoice, numeroAleatorio);
        int resultadoPasaFalta = juego.pasaFalta(pasaFaltaChoice, numeroAleatorio);
        int resultadoDocena = juego.docena(docenaChoice, numeroAleatorio);

        if (resultadoColor == 1 || resultadoParidad == 1 || resultadoPasaFalta == 1) {
            System.out.println("¡Felicidades! Has ganado. Premio: " + cantidadApostar * 2 + " bolivianos");
        } else if (resultadoDocena == 1) {
            System.out.println("¡Felicidades! Has ganado. Premio: " + cantidadApostar * 3 + " bolivianos");    
      
    
        }else {
            System.out.println("Lo siento, has palmao to la pasta");
        }
    }
}


