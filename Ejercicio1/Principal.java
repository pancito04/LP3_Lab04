package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Principal agenda = new Principal();
        agenda.ejecutarMenu();
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            System.out.println("Menu de Agenda de Contactos:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Mostrar contactos");
            System.out.println("6) Salir");
            System.out.print("Elija una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    modificarContacto();
                    break;
                case 4:
                    borrarContacto();
                    break;
                case 5:
                    mostrarContactos();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private void agregarContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el teléfono del contacto: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la dirección del contacto: ");
        String direccion = scanner.nextLine();

        Contacto contacto = new Contacto(nombre, telefono, direccion);
        contactos.add(contacto);
        System.out.println("Contacto agregado exitosamente.");
    }

    private void buscarContacto() {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscado = scanner.nextLine();

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto);
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    private void modificarContacto() {
        System.out.print("Ingrese el nombre del contacto a modificar: ");
        String nombreBuscado = scanner.nextLine();

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                System.out.print("Nuevo teléfono: ");
                String nuevoTelefono = scanner.nextLine();
                System.out.print("Nueva dirección: ");
                String nuevaDireccion = scanner.nextLine();

                contacto.setNombre(nuevoNombre);
                contacto.setTelefono(nuevoTelefono);
                contacto.setDireccion(nuevaDireccion);
                System.out.println("Contacto modificado exitosamente.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    private void borrarContacto() {
        System.out.print("Ingrese el nombre del contacto a borrar: ");
        String nombreBuscado = scanner.nextLine();

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                contactos.remove(contacto);
                System.out.println("Contacto borrado exitosamente.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    private void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}