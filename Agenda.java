public class Agenda{
    private Contacto contactos[];
	public Agenda() {
		this.contactos= new Contacto[256];
	}
	
	public void añadirContacto(Contacto c) {
		boolean encontrado= false;
		for(int i=0;i<contactos.length && !encontrado;i++) {
			if(contactos[i]==null) {
				contactos[i]=c;
				encontrado=true;
			}
		}
		if(encontrado) {
			System.out.println("Se ha añadido");
		}else {
			System.out.println("No se ha podido añadir");
		}
	}
	
	public boolean existeContacto(Contacto c) {
		for(int i=0;i<contactos.length;i++) {
			if(contactos[i]!=null && c.equals(contactos[i])) {
				return true;
			}
		}
		return false;
	}
	public void bucarContacto(String nombre) {
        boolean encontrado=false;
        for(int i=0;i<contactos.length && !encontrado;i++) {
			if(contactos[i]!=null && contactos[1].getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Su telefono es: "+ contactos[i].getTelefono() + " y su gmail es: "+ contactos[i].getGmail());
                encontrado=true;
			}
        }
        if(!encontrado){
            System.out.print("No se ha encontrado");
        }
    }
    public boolean agendaLlena(){
        for(int i=0;i<contactos.length;i++) {
			if(contactos[i]!=null) {
                return false;
            }
        }
        return true;
    }
    }