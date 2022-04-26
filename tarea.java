import java.util.Scanner;
public class tarea {
    public static void main(final String[] args) {
        String usu;
        final Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        usu=sca.nextLine();
        // las variables no van definidas arriba, tienen que ir lo mas cerca de deonde se usa.

        Agenda agendita=new Agenda();
        int opi;

        do{
            System.out.println("Agenda de "+ usu);
            System.out.println("1- Ingresar un nuevo contacto");
            System.out.println("2- Consultar un contacto existente");
            System.out.println("3- Salir");
            
            System.out.println("Ingrese una opcion");
            opi=sca.nextInt();
            switch(opi){
                case 1: {
                  String nombre, telefono, email;
                  // para forzar que ingrese un nombre
                  System.out.print("Ingrese el nombre:");
                  do {
                    nombre=sca.nextLine();
                  } while (nombre.isEmpty());
                  
                  // lo mismo para el telefono
                  System.out.print("Ingrese el telefono:");
                  telefono= sca.nextLine();
                  System.out.print("Ingrese el email:");
                  email= sca.nextLine();
                  agendita.añadirContacto(new Contacto(nombre, telefono, email));
                  break;
                }
                // 
                case 2: {
                  String nombre;
                  System.out.print("Ingrese el nombre de la persona");
                  nombre=sca.nextLine();
                  agendita.bucarContacto(nombre);
                  break;

                }
                case 3:
                    System.out.println("¡ADIOS :)!");
                    break;
                default: System.out.println("La opción ingresada no existe, intente de nuevo");
            }
        }while(opi!=3);
    }
}