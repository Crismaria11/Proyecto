import cine.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> User = new ArrayList<cine.User>();
        ArrayList<Movie> Movie = new ArrayList<cine.Movie>();
        Boolean continuar = true;
        do {
            System.out.println("Bienvenido al cine");
            int menuSelection = 0;
            System.out.println("Menu: ");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");


            switch (menuSelection) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1, agregar nuevo usuario:");
                    Scanner newish = new Scanner(System.in);
                    System.out.println("Es Administrador?");
                    Boolean admin1 = true;
                    String admin = newish.nextLine();
                    if (admin.equals("si")) {
                        admin1 = true;
                    } else admin1 = false;
                    System.out.println("Escriba un nombre de usuario");
                    String username = newish.nextLine();
                    System.out.println("Escribe tu contrasena");
                    String password = newish.nextLine();
                    System.out.println("Escribe un correo");
                    String email = newish.nextLine();

                    User.add(new User(username, password, email, admin1));
                    System.out.println(User);
                    break;

                case 2:
                    System.out.println("Has seleccionado la opcion 2, iniciar sesion");
                    Scanner newsisher = new Scanner(System.in);
                    System.out.println("Ingrese nombre de usuario");
                    String username1 = newsisher.nextLine();
                    System.out.println("Ingrese contrasena");
                    String password1 = newsisher.nextLine();
                    User userLoggedIn = login(username1,password1, User);
                    Boolean isAdmin = null;
                    Boolean isLoggedIn = null;
                    if (userLoggedIn.getAdmin()) {
                        isAdmin = true;
                        isLoggedIn = false;
                    }
                    do {
                        System.out.println("Menu Admintrador: ");
                        System.out.println("1. Crear pelicula");
                        System.out.println("2. Agregar salas");
                        System.out.println("3. Cerrar Sesion");
                        int menuSelecAdmin = 0;

                        do {
                            switch (menuSelecAdmin) {
                                case 1:
                                    System.out.println("Has seleccionado la opcion 1, Agregar Pelicula");
                                    Scanner newAdmin = new Scanner(System.in);
                                    System.out.println("Escriba el nombre de la pelicula");
                                    String name = newAdmin.nextLine();
                                    System.out.println("Escriba la hora de la pelicula");
                                    int time = newAdmin.nextInt();
                                    Movie.add(new Movie(name, time));
                                    System.out.println(Movie);
                                    break;
                                case 2:
                                    System.out.println("Has seleccionado la opcion 2, Agregar Salas");
                                    Scanner newAdminSalas = new Scanner(System.in);
                                    System.out.println("Escriba el numero de la sala");
                                    int numRoom = newAdminSalas.nextInt();
                                    System.out.println(Movie);
                                    Scanner newAdminPeliculas = new Scanner(System.in);
                                    System.out.println("Seleccione una pelicula para estar en la sala");
                                    String selectedMovie = newAdminPeliculas.nextLine();
                                    TheaterRoom selectedMovie1 = find(numRoom, Movie);
                                    selectedMovie1.add(TheaterRoom);
                                    break;
                                case 3:
                                    System.out.println("Has seleccionado la opcion 3, Cerrar Sesion");
                                    Scanner out = new Scanner(System.in);
                                    isAdmin = null;
                                    isLoggedIn = false;
                                    break;

                            } while (continuar);



                        } while (continuar);
                    } else if (!User.isLoggedin.getAdmin()) {
                    isAdmin = false;
                    do{
                        int UserMenu = 0
                        System.out.println("Menu Usuario");
                        System.out.println("1. Comprar ticket");
                        System.out.println("2. Cerrar Sesion");
                        System.out.println("Escoga una opcion");
                        switch (UserMenu) {
                            case 1:
                                System.out.println("Has seleccionado la opcion 1, Comprar tocket");
                                Scanner salasUsuario = new Scanner(System.in);
                                System.out.println(TheaterRoom);
                                System.out.println("Que sala desea?");
                                int TheaterRoom = salasUsuario.nextInt();
                                System.out.println("Que asiento desea?");
                                System.out.println(seats);
                                int seats = salasUsuario.nextInt();
                                Ticket.add(new Ticket(TheaterRoom, ArrayList<seats>));
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opcion 2, Cerrar Sesion");
                                isAdmin = null;
                                break
                        } while (isAdmin);
                    } while (isLoggedIn);
                }
                case 3:
                    System.out.println("Has elegido la opcion 3, Salir");
                    continuar = false;
                    break;
            }

        } while (continuar);
    }

    private static TheaterRoom find(int numRoom, ArrayList<Movie> movie) {
        for (int name1 = 0; name1 < movie.size(); ++name1) {
            Movie movieAdmin = movie.get(name1);

            if (movieAdmin.getName().equals(name1)) {
                if (movieAdmin.getTime().equals(time)) {
                    return movieAdmin;
                }
            }
        }
        return null;
    }


    private static User login(String username, String password, ArrayList<User> Usuarios) {
        for (int username12 = 0; username12 < Usuarios.size(); ++username12) {
            User UserAdmin = Usuarios.get(username12);

            if (UserAdmin.getUsername().equals(username12)) {
                if (UserAdmin.getPassword().equals(password)) {
                    return UserAdmin;
                }
            }
        }
        return null;
    }
    private static Movie find(String name, int time, ArrayList<Movie> Peliculas) {
        for (int name1 = 0; name1 < Peliculas.size(); ++name1) {
            Movie movieAdmin = Peliculas.get(name1);

            if (movieAdmin.getName().equals(name1)) {
                if (movieAdmin.getTime().equals(time)) {
                    return movieAdmin;
                }
            }
        }
        return null;
    }
}
