public class Agenda{
    private Contacto contactos[];
    private int cantidadContactos;
	public Agenda() {
    cantidadContactos = 0;
		this.contactos= new Contacto[256];
	}
	
  // que te parece este refactor?
	public void añadirContacto(Contacto c) {
		if (cantidadContactos >= contactos.length) {
      System.out.println("No se ha podido añadir porque...");
      return;
    }
    contactos[cantidadContactos] = c;
    cantidadContactos += 1;
    System.out.println("Se ha añadido");
	}
  
	// No lo uso.
	public void bucarContacto(String nombre) {
        boolean encontrado=false;
        for(int i=0;i<contactos.length && !encontrado;i++) {
			if(contactos[i]!=null && contactos[1].getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Su telefono es: "+ contactos[i].getTelefono() + " y su email es: "+ contactos[i].getemail());
                encontrado=true;
			}
        }
        if(!encontrado){
            System.out.print("No se ha encontrado");
        }
    }
    // No lo uso.
}