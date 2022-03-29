public class Contacto {

	private String nombre;
	private String telefono;
	private String gmail;

	public Contacto(String nombre, String telefono, String gmail) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.gmail = gmail;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	public boolean equals(Contacto c) {
		if(this.nombre.equalsIgnoreCase(c.getNombre())) {
			return true;
		}
		return false;
	}
	@Override
	public String toString(){
		return "nombre"+nombre+ ", telefono"+ telefono +", gmail";
	}
}