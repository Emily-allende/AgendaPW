import java.util.Scanner;
public class tarea {
    public static void main(final String[] args) {
        String usu;
        final Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        usu=sca.nextLine();
        String nombre;
        String telefono;
        String gmail;

        Agenda agendita=new Agenda();
        Contacto c;
        int opi;

        do{
            System.out.println("Agenda de "+ usu);
            System.out.println("1- Ingresar un nuevo contacto");
            System.out.println("2- Consultar un contacto existente");
            System.out.println("3- Salir");
            
            System.out.println("Ingrese una opcion");
            opi=sca.nextInt();
            switch(opi){
                case 1:
                    System.out.print("Ingrese el nombre:");
                    nombre= sca.nextLine();
                    System.out.print("Ingrese el telefono:");
                    telefono= sca.nextLine();
                    System.out.print("Ingrese el gmail:");
                    gmail= sca.nextLine();
                    c= new Contacto(nombre, telefono, gmail);
                    agendita.añadirContacto(c);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la persona");
                    nombre=sca.nextLine();
                    agendita.bucarContacto(nombre);
                    break;
                case 3:
                    System.out.println("¡ADIOS :)!");
                    break;
                default: System.out.println("La opción ingresada no existe, intente de nuevo");
            }
        }while(opi!=3);
    }
}