package ex_1_personas;

import java.util.*;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Main {
    private static ArrayList<Persona> mayores = new ArrayList<>();
    private static ArrayList<Persona> menores = new ArrayList<>();
    private static ArrayList<Persona> mayores_sorted = new ArrayList<>();

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int id = 1;

        boolean finished = false;
        System.out.println("Bienvenido");
        while (!finished) {
            System.out.println("| Menu |");
            System.out.println("[1]. Añadir persona");
            System.out.println("[2]. Ver mayores de edad ordenados alfabeticamente");
            System.out.println("[3]. Ver menores de edad");
            if (id != 1) {
                System.out.println("[4]. Comparacion con hashtable");
            }
            System.out.println("[5]. Salir");
            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    creationPersona(id);
                    id++;
                    break;
                case 2:
                    sortMayores();
                    break;
                case 3:
                    for (Persona p:menores) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    if (id != 1) {
                        String temp_us, temp_pw;
                        System.out.println("Introduce un usuario:");
                        temp_us = keyboard.next();
                        System.out.println("Introduce una contraseña:");
                        temp_pw = keyboard.next();
                        hashTabling(temp_us, temp_pw);
                    }
                    break;
                case 5:
                    finished=true;
                    break;
                default:
                    System.err.println("Opcion Invalida");
                    break;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println();
            }
            for (Persona p:mayores) {
                System.out.println(p.toString());
            }
        }
    }

    /**
     * creationPersona se encarga de la creacion de personas y en asignarlas al arraylist correcto
     * @param id id que se usa para crear personas
     */
    private static void creationPersona(int id) {
        Scanner keyboard = new Scanner(System.in);
        int edad = 0;
        String nombre;
        String usuario;
        String password;
        System.out.println("Introduce el nombre:");
        nombre = keyboard.next();
        System.out.println("Introduce la edad:");
        edad = keyboard.nextInt();
        System.out.println("Introduce un usuario:");
        usuario = keyboard.next();
        System.out.println("Introduce una contraseña:");
        password = keyboard.next();
        if (edad < 18) {
            menores.add(new Persona(id, nombre, edad, usuario, password));
        } else {
            mayores.add(new Persona(id, nombre, edad, usuario, password));
        }
    }

    /**
     * sortMayores se encarga de ordenar una copia de mayores alfabeticamente
     */
    private static void sortMayores() {
        mayores_sorted.addAll(mayores);
        mayores_sorted.sort((o1, o2) -> o1.getNombre().compareToIgnoreCase(o2.getNombre()));
        for (Persona p:mayores_sorted) {
            System.out.println(p.toString());
        }
        mayores_sorted.clear();
    }

    /**
     * hashTabling se encarga de hacer las operaciones con hashtables
     */
    private static void hashTabling(String in_user, String in_pass) {
        System.out.println("WORK IN PROGRESS");
        Hashtable<String, String> ht_user = new Hashtable<>();
        for (Persona p: mayores) {
            ht_user.put(p.getUsuario(), p.getPassword());
        }
        Set set = ht_user.entrySet();
        for (Object aSet : set) {
            Map.Entry entry = (Map.Entry) aSet;
            String ent_us = (String) entry.getKey();
            String ent_pw = (String) entry.getValue();
            if (ent_us.equals(in_user)) {
                if (ent_pw.equals(in_pass)) {
                    System.out.println("Contraseña correcta");
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } else {
                System.out.println("Usuario no encontrado");
            }
        }
    }
}
