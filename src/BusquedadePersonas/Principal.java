package BusquedadePersonas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

	static Datos[] p = new Datos[50];
	
	public static void main (String[] args) {
			Scanner reader1= new Scanner(System.in);
			int DPI;
			String nombre;
			int edad;
			int option = 0;
			int close = 0;
			int contador = 0;
			
			do {
				System.out.println("Menu");
				System.out.println("1. Ingresar datos");
				System.out.println("2. Mostrar todos los datos");
				System.out.println("3. Ordenar datos");
				System.out.println("4. Buscar datos");
				System.out.println("5. Salir");
				System.out.println("Elija una de las opciones:");
				option = reader1.nextInt();
				
				switch (option) {
				case 1: {
					do {
						System.out.println("Ingrese DPI");
						DPI=reader1.nextInt();
						System.out.println("Ingrese nombre");
						nombre=reader1.next();
						System.out.println("Ingrese edad");
						edad=reader1.nextInt();
						p[contador] = new Datos(DPI, nombre, edad);
						System.out.println("Ingrese 1 para salio o 0 para seguir ingresando");
						close = reader1.nextInt();
						System.out.println(close);
						contador++;
					}while(close != 1);
				}
				break;
				case 2: {
					imprimirArrayDatos(p, contador);
				}
				break;
				case 3: {
					ordenamientoSeleccion(p, contador);
				}
				break;
				case 4: {
					
					System.out.println("Ingrese DPI de la persona a buscar");
					DPI=reader1.nextInt();
					for (int i = 0; i < contador; i++) {
						if(p[i].DPI == DPI) {
							System.out.println("DPI: "+ p[i].DPI + " Nombre: " + p[i].nombre +" Edad: " + p[i].edad);
							break;
						}
					}

				}
				break;
				default:
					System.out.println("Opción no valida");
				}
			}while (option != 5);
		}
	
	static void imprimirArrayDatos (Datos[] p,int contador) {
		for (int i = 0; i < contador; i++) {
			System.out.println("DPI: "+ p[i].DPI + " Nombre: " + p[i].nombre +" Edad: " + p[i].edad);											
		}
	}

	
		 static void ordenamientoSeleccion(Datos[] p, int contador) {
			int indiceMenor;
		
			for (int i = 0; i < contador; i++) {
				indiceMenor = i;
				
				for (int j = i+1; j<contador; j++) {
					if (p[j].DPI < p[indiceMenor].DPI) {
						indiceMenor = j;
					}			
				}
				
				if (i != indiceMenor) {
					intercambiar(p, i, indiceMenor);
				}
			}
		}

		
		private static void intercambiar(Datos[] lista, int i, int j) {
			System.out.println("intercambiar "+lista[i].DPI+" y "+lista[j].DPI);
			int aux = lista[i].DPI;
			lista[i].setDPI(lista[j].DPI);
			lista[j].setDPI(aux);
		
		}
		
	}

