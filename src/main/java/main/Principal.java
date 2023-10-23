package main;

import java.util.Scanner;

import ec.edu.ups.PracticaUno.clases.Asignatura;
import ec.edu.ups.PracticaUno.clases.Estudiante;
import ec.edu.ups.PracticaUno.clases.Profesor;

public class Principal {
		    public static void main(String[] args) {
		    	//Manejo de la clase Scanner
		    	Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("Menú:");
		            System.out.println("1. Estudiantes: ");
		            System.out.println("2. Profesor: ");
		            System.out.println("3. Asignatura: ");
		            System.out.println("4. Salir");
		            System.out.print("Selecciona una opción: ");

		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Seleccionaste la Opción 1");
		                    // Llamamos al metodo de la clase estudiantes y llenamos por teclado
		                    //Instanciamos un objeto de clase Estudiante
		                    Estudiante estudianteUno = new Estudiante();
		                    System.out.println("Ingrese su nombre: ");
		                    String ingresarNombreEs = scanner.next();
		                    estudianteUno.setNombre(ingresarNombreEs);
		                    System.out.println("Ingrese su edad: ");
		                    int ingresarEdadEs = scanner.nextInt();
		                    estudianteUno.setEdad(ingresarEdadEs);
		                    System.out.println("Ingrese el id magico: ");
		                    String ingreseIdMagicoEs  = scanner.next();
		                    estudianteUno.setIdMagico(ingreseIdMagicoEs);
		                    System.out.println(estudianteUno.toString());
		                    System.out.println("Estudiante agregado con exito!!!!");
		                    break;
		                case 2:
		                    System.out.println("Seleccionaste la Opción 2");
		                    // Llamamos a los metodo de la clase estudiantes y llenamos por teclado
		                    //Instanciamos un objeto de clase Profesor
		                    Profesor profesorUno = new Profesor();
		                    System.out.println("Ingrese su Nombre Mago!! ");
		                    String ingresarNombrePr = scanner.next();
		                    profesorUno.setNombre(ingresarNombrePr);
		                    System.out.println("Ingrese su especialidad Magica!!: ");
		                    String ingresarEspecialidad = scanner.next();
		                    profesorUno.setEspecialidadesMagicas(ingresarEspecialidad);
		                    System.out.println("Ingrese sus conocimientos Magicos!!: ");
		                    String ingreseConociminetos  = scanner.nextLine();
		                    profesorUno.setConociminetos(ingreseConociminetos);
		                    System.out.println(profesorUno.toString());
		                    break;
		                case 3:
		                    System.out.println("Seleccionaste la Opción 3");
		                    // Llamamos a los metodo de la clase Asignatura y llenamos por teclado
		                  //Instanciamos un objeto de clase Asignatura
		                    Asignatura asignaturaUno = new Asignatura();
		                    System.out.println("Ingrese el nombre de la Asignatura Magica: ");
		                    String ingreseNombreAsignatura = scanner.next();
		                    asignaturaUno.setNombreAsignatura(ingreseNombreAsignatura);
		                    System.out.println("Ingrese el Id de la Asignatura Magica: ");
		                    String ingreseIdAsignatura = scanner.next();
		                    asignaturaUno.setIdEspecial(ingreseIdAsignatura);
		                    System.out.println(asignaturaUno.toString());
		                    //
		                    
		                    //asignaturaUno.agregarEstudiantes(ingresarNombreEs);
		                    break;
		                case 4:
		                    System.out.println("Saliendo del programa.");
		                    break;
		                default:
		                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
		            }
		        } while (choice != 4);

		        scanner.close();
		    }
		

	}

