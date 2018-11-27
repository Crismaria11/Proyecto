import cine.Movie;
import cine.TheaterRoom;
import cine.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> User = new ArrayList<cine.User>();
        ArrayList<Movie> Movie = new ArrayList<cine.Movie>();
        Boolean continuar = true;
        Scanner Read = new Scanner(System.in);
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
                    assert userLoggedIn != null;
                    if (!userLoggedIn.getAdmin()) {
                    } else {
                        do {
                            System.out.println("Menu Admintrador: ");
                            System.out.println("1. Agregar pelicula");
                            System.out.println("2. Agregar salas");
                            System.out.println("3. Salir");
                            int menuSelecAdmin = 0;

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
                                    System.out.println("Seleccione una pelicula");
                                    String selectedMovie = newAdminPeliculas.nextLine();
                                    TheaterRoom.add(new TheaterRoom(numRoom, Movie));


                            }
                        } while (continuar);
                    }

            }
        } while (continuar);
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
}
