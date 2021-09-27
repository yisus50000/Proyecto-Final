package proyecto.finall.programacion;

import java.time.LocalDate;

public class Libro extends MainBiblioteca {

	public String codigo;
	public String nombre;
	public String autor;
	public String añoPublicacion;
	public String editorial;
	public String cantidadPaginas;
	public String estado;
	public LocalDate diaEntrega;
	public String cedula;
	public int precio;

	// Metodos SET y GET

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(String cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getDiaEntrega() {
		return diaEntrega;
	}

	public void setDiaEntrega(LocalDate diaEntrega) {
		this.diaEntrega = diaEntrega;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Libros:\n Código: " + codigo + " - Nombre: " + nombre + " - Autor: " + autor + " - Año: "
				+ añoPublicacion + " - Estado: " + estado + " - Fecha Entrega: " + diaEntrega;
	}
	
	public String toString1() {
		return "Libros:\n Código: " + codigo + " - Nombre: " + nombre + " - Autor: " + autor + " - Año: "
				+ añoPublicacion + " - Estado: " + estado + " - Fecha Entrega: " + diaEntrega + " - Prestado a: " + cedula;
	}

}
