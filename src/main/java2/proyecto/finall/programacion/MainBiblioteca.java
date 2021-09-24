package proyecto.finall.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoint = new Scanner(System.in);
		String opcion;
		String seleccion;
		String datos;

		List<Libro> listLibros = new ArrayList<Libro>();
		List<Estudiante> listEstudiantes = new ArrayList<Estudiante>();
		Libro libros = new Libro();
		do {
			System.out.println("************Bienvenido a la biblioteca*************");
			System.out.println("Elija el tipo de usuario que es: ");
			System.out.println("1. Estudiantes ");
			System.out.println("2. Bibliotecario ");
			System.out.println("3. SALIR ");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("a. Consultar Libros ");
				System.out.println("b. Reservar Libros ");
				seleccion = teclado.nextLine();
				switch (seleccion) {
				case "a":

					System.out.println("Digite nombre del libro");
					datos = teclado.nextLine();
					System.out.println("Digite el autor del libro");
					datos = teclado.nextLine();
					libros.getNombre();
					libros.getAutor();
					boolean busqueda = datos.contains(libros.getNombre());
					busqueda = datos.contains(libros.getAutor());
					
					if (busqueda == true) {
						for(int i = 0; i<1000 ; i++) {
							
						System.out.println(datos.contains(libros.toString()));
						
						}
					} else if (busqueda == false) {
						System.out.println("El libro no ha sido encontrado");
					}
					break;

				case "b":

					System.out.println("Digite el codigo del libro: ");
					datos = teclado.nextLine();
					System.out.println("Digite su numero de cedula: ");
					datos = teclado.nextLine();
					break;
				default:
					System.out.println("Digite una opcion valida");
					break;
				}

				break;

			case "2":
				System.out.println("a. Ingresar un libro ");
				System.out.println("b. Prestar un libro ");
				System.out.println("c. Aplazar fecha de entrega ");
				seleccion = teclado.nextLine();
				switch (seleccion) {
				
				case "a":

					for (int i = 0; i < 100; i++) {
						System.out.println("Digite el codigo del libro: ");
						String codigo = teclado.nextLine();
						System.out.println("Digite nombre del libro: ");
						String nombre = teclado.nextLine();
						System.out.println("Digite autor del libro: ");
						String autor = teclado.nextLine();
						System.out.println("Digite año de publicacion del libro: ");
						String anio = teclado.nextLine();
						System.out.println("Digite editorial del libro: ");
						String editorial = teclado.nextLine();
						System.out.println("Digite cantidad de paginas del libro: ");
						String paginas = teclado.nextLine();
						System.out.println("Digite precio del libro: ");
						int precio = tecladoint.nextInt();
						libros.setCodigo(codigo);
						libros.setNombre(nombre);
						libros.setAutor(autor);
						libros.setAñoPublicacion(anio);
						libros.setEditorial(editorial);
						libros.setCantidadPaginas(paginas);
						libros.setPrecio(precio);
						listLibros.add(libros);

						System.out.println("Elija el tipo de libro: ");
						System.out.println("1. Libro de trabajo");
						System.out.println("2. Libro de lectura");
						String tipolec = teclado.nextLine();

						switch (tipolec) {
						case "1":
							System.out.println("Digite codigo de autorizacion: ");
							tipolec = teclado.nextLine();
							System.out.println("El libro a sido guardado exitosamente");
							break;
						case "2":
							System.out.println("Digite tiempo aproximado de lectura en minutos: ");
							tipolec = teclado.nextLine();
							System.out.println("El libro a sido guardado exitosamente");
							break;
						default:
							System.out.println("Digite un parametro valido");
							
						}
						break;
					}

					break;

				case "b":

					System.out.println("Digite el codigo del libro: ");
					String codigo = teclado.nextLine();
					switch (codigo) {
					case "1":
						System.out.println("");
						break;
					case "2":
						System.out.println("El libro no ha sido prestado");
						break;
					default:
						System.out.println("Digite un parametro valido");
						break;
					}
					break;
				case "c":

					break;
				default:
					System.out.println("Digite un parametro valido");
					break;
				}
				break;

			case "3":
				System.out.println("Cerrando el sistema");
				break;
			default:
				System.out.println("Digite una opcion valida");
			}

		} while (!opcion.equals("3"));
		System.out.println("Tenga un excelente dia");
	}

}
