package proyecto.finall.programacion;

public class Libro {

	public String codigo;
	public String nombre;
	public String autor;
	public String añoPublicacion;
	public String editorial;
	public String cantidadPaginas;
	public int precio;

	//Metodos SET y GET
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

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", autor=" + autor + ", añoPublicacion="
				+ añoPublicacion + ", editorial=" + editorial + ", cantidadPaginas=" + cantidadPaginas + ", precio="
				+ precio + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getAutor()="
				+ getAutor() + ", getAñoPublicacion()=" + getAñoPublicacion() + ", getEditorial()=" + getEditorial()
				+ ", getCantidadPaginas()=" + getCantidadPaginas() + ", getPrecio()=" + getPrecio() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

