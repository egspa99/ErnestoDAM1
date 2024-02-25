package EjerciciosClase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjercicioLudopatiaClase {
	
	
	public int color(int apuesta, int numero) {
		int premio = 0;
		if (numero >= 1 && numero <= 36) {

			if (numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 9 || numero == 12 || numero == 14
					|| numero == 16 || numero == 18 || numero == 19 || numero == 23 || numero == 25 || numero == 27
					|| numero == 30 || numero == 32 || numero == 34 || numero == 36) {

				System.out.println("rojo");
				if (apuesta == 1) {
					premio = 1;
				}
			} else {
				System.out.println("negro");
				if (apuesta == 2) {
					premio = 1;
				}
			}
		} else if (numero == 0) {
			System.out.println("Cero");
		}
		return premio;
	}

	public int paridad(int apuesta, int numero) {
	    int premio = 0;

	    if (numero >= 1 && numero <= 36) {
	        if (numero % 2 == 0) {
	            System.out.println("par");
	            if (apuesta == 1) {
	                premio = 1;
	            }
	        } else {
	            System.out.println("impar");
	            if (apuesta == 2) {
	                premio = 1;
	            }
	        }
	    } else if (numero == 0) {
	        System.out.println("Cero");
	    }
	    return premio;
	}


	public int pasaFalta(int apuesta, int numero) {
	    int premio = 0;

	    if (numero >= 19) {
	        System.out.println("pasa");
	        if (apuesta == 1) {
	            premio = 1;
	        }
	    }

	    if (numero <= 18) {
	        System.out.println("falta");
	        if (apuesta == 2) {
	            premio = 1;
	        }
	    } else if (numero == 0) {
	        System.out.println("Cero");
	    }
	    return premio;
	}


	public int docena(int apuesta, int numero) {
	    int premio = 0;

	    if (numero >= 1 && numero <= 12) {
	        System.out.println("El número está en la primera docena");
	        if (apuesta == 1) {
	            premio = 1;
	        }
	    }

	    if (numero >= 13 && numero <= 24) {
	        System.out.println("El número está en la segunda docena");
	        if (apuesta == 2) {
	            premio = 1;
	        }
	    }

	    if (numero >= 25) {
	        System.out.println("El número está en la tercera docena");
	        if (apuesta == 3) {
	            premio = 1;
	        }
	    }

	    if (numero == 0) {
	        System.out.println("Cero");
	    }
	    return premio;
	}


	public int lanzarBolilla() {

		Random random = new Random();

		int numeroAleatorio = random.nextInt(37);

		return numeroAleatorio;

	}
	 private ArrayList<Integer> elegirNumeros;

	    public EjercicioLudopatiaClase() {
	        this.elegirNumeros = new ArrayList<>();
	    }


	    public void elegirNumeros(Scanner scanner) {
	        System.out.print("Ingrese la cantidad de números que desea apostar: ");
	        int cantidadNumeros = scanner.nextInt();

	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print("Ingrese el número #" + (i + 1) + " que desea elegir (0-36): ");
	            int numeroElegido = scanner.nextInt();

	        
	            if (numeroElegido < 0 || numeroElegido > 36) {
	                System.out.println("Número no válido. Ingrese un número entre 0 y 36.");
	                i--; 
	                continue;
	            }

	            elegirNumeros.add(numeroElegido);
	        }

	        System.out.println("Números elegidos hasta ahora: " + elegirNumeros);
	    }

	    public void verificarPremio(int numeroAleatorio) {
	        System.out.println("Número aleatorio: " + numeroAleatorio);

	        for (Integer numeroElegido : elegirNumeros) {
	            if (numeroElegido == numeroAleatorio) {
	                System.out.println("¡Felicidades! Has acertado el número " + numeroElegido + ". Premio: " + numeroElegido * 36 + " bolivianos");
	            }
	        }
	    }

	    private int verificarPremioIndividual(int apuesta, int numero) {
	        int premio = 0;

	        return premio;
	    }
	}
