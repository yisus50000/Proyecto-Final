package proyecto.finall.programacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		String codigo;
		String nombre;
		String autor;
		String anio;
		String editorial;
		String paginas;
		String cedula;
		String buscar;
		String destino;
		int precio;
		LocalDate diaActual = LocalDate.now();
		LocalDate diaEntregar = diaActual.plusDays(5);
		List<Libro> listLibros = new ArrayList<Libro>();

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
					System.out.println("Digite el nombre o autor del libro: ");
					buscar = teclado.nextLine();
					for (int i = 0; i < listLibros.size(); i++) {

						if (listLibros.get(i).getNombre().contains(buscar)
								|| listLibros.get(i).getAutor().contains(buscar)) {

							System.out.println(listLibros.get(i).toString());

						}

						else {
							System.out.println("No se encontro el libro");
						}
					}

					break;

				case "b":
					System.out.println("Digite el codigo del libro: ");
					codigo = teclado.nextLine();
					System.out.println("Digite su numero de cedula: ");
					cedula = teclado.nextLine();

					for (int k = 0; k < listLibros.size(); k++) {
						if (codigo.equals(listLibros.get(k).getCodigo())) {
							listLibros.get(k).setCedula(cedula);

							if (listLibros.get(k).getEstado().equals("Disponible")) {

								listLibros.get(k).setEstado("Reservado");
								listLibros.get(k).setDiaEntrega(diaEntregar);
								System.out.println("El Libro a sido perfectamente reservado ");
								System.out.println("Pase a retirarlo a la biblioteca");
								System.out.println("Fecha de entrega = "
										+ diaEntregar.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
								System.out.println("****Tenga un excelente dia*****");
								System.out.println(" ,;;;, ,;;;,");
								System.out.println(";;;' ';' ';;;");
								System.out.println(";;;       ;;;");
								System.out.println(" ';;,   ,;;'");
								System.out.println("   ';;,;;'");
								System.out.println("     ';'  ");
							} else {
								System.out.println("El libro no se encuentra disponible");
							}
						}
					}

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

					Libro libros = new Libro();
					do {

						System.out.println("Digite el codigo del libro: ");
						codigo = teclado.nextLine();
						libros.setCodigo(codigo);
						System.out.println("Digite nombre del libro: ");
						nombre = teclado.nextLine();
						libros.setNombre(nombre);
						System.out.println("Digite autor del libro: ");
						autor = teclado.nextLine();
						libros.setAutor(autor);
						System.out.println("Digite año de publicacion del libro: ");
						anio = teclado.nextLine();
						libros.setAñoPublicacion(anio);
						System.out.println("Digite editorial del libro: ");
						editorial = teclado.nextLine();
						libros.setEditorial(editorial);
						System.out.println("Digite cantidad de paginas del libro: ");
						paginas = teclado.nextLine();
						libros.setCantidadPaginas(paginas);
						System.out.println("Digite precio del libro: ");
						precio = tecladoint.nextInt();
						libros.setPrecio(precio);
					    System.out.println("Digite el destino");
						destino = teclado.nextLine();
						libros.setDestino(destino);
						libros.setEstado("Disponible");
						libros.setDiaEntrega(diaActual);
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
							break;
						}
						System.out.println("Presione enter para continuar");
						opcion = teclado.nextLine();
						break;
					} while (!opcion.equals(""));

					break;

				case "b":

					System.out.println("Digite el codigo del libro: ");
					codigo = teclado.nextLine();
					for (int m = 0; m < listLibros.size(); m++) {
						if (codigo.equals(listLibros.get(m).getCodigo())) {
							if (listLibros.get(m).getEstado().equals("Reservado")) {
								System.out.println(listLibros.get(m).toString1());
								System.out.println("Elija una opcion: ");
								System.out.println("1. Prestar");
								System.out.println("2. No prestar");
								datos = teclado.nextLine();
								switch (datos) {
								case "1":
									listLibros.get(m).setEstado("Prestado");
									System.out.println(listLibros.get(m).toString1());
									break;
								case "2":
									System.out.println("El libro no ha sido prestado");
									break;
								default:
									System.out.println("Digite una opcion valida");
									break;
								}
							} else {
								System.out.println("No hay libros bajo reserva");
							}
						}

					}
					break;
				case "c":
					System.out.println("Digite el codigo del libro: ");
					codigo = teclado.nextLine();
					System.out.println("Digite la cedula del estudiante: ");
					cedula = teclado.nextLine();

					for (int n = 0; n < listLibros.size(); n++) {
						buscar = listLibros.get(n).getEstado();
						if (codigo.equals(listLibros.get(n).getCodigo()) && cedula.equals(listLibros.get(n).getCedula())
								&& buscar.equals(listLibros.get(n).getEstado())) {
							System.out.println(listLibros.get(n).toString1());

							System.out.println("Elija una opcion: ");
							System.out.println("1. Aplazar");
							System.out.println("2. No Aplazar");
							datos = teclado.nextLine();
							switch (datos) {
							case "1":
								LocalDate diaAplazado = diaEntregar.plusDays(5);
								System.out.println("La fecha ha sido aplazada");
								System.out.println("Nueva fecha de entrega: \n"
										+ diaAplazado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
								break;
							case "2":
								System.out.println("No se se aplazara la fecha de entrega");
								break;
							default:
								System.out.println("Elija una opcion valida");
								break;

							}

						} else {
							System.out.println("No se ha encontrado el libro");
						}
					}

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
		System.out.println(" ,;;;, ,;;;,");
		System.out.println(";;;' ';' ';;;");
		System.out.println(";;;       ;;;");
		System.out.println(" ';;,   ,;;'");
		System.out.println("   ';;,;;'");
		System.out.println("     ';'  ");
	}

}
