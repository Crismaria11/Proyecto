
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Movie> movies = new ArrayList<Movie>();
        ArrayList<TheaterRoom> rooms = new ArrayList<TheaterRoom>();

        Boolean continuar = true;
        do {
            System.out.println(menu());
            Scanner input = new Scanner(System.in);
            System.out.println("Que opcion desea?: ");
            String opcion = input.nextLine();

            switch (opcion){
                case "1":
                    System.out.println("Ha elegido agregar usuario");
                    System.out.println("Escriba el nombre de usario: ");
                    String username = input.nextLine();
                    System.out.println("Escriba la contrasena: ");
                    String password = input.nextLine();
                    System.out.println("Escriba el correo: ");
                    String mail = input.nextLine();
                    System.out.println("Es adiministrador? si/no");
                    String respuesta = input.nextLine();
                    Boolean admin = false;
                    if (respuesta.equals("si")){
                        admin = true;
                    }
                    User newUser = new User(username,password,mail,admin);
                    users.add(newUser);
                    break;
                case "2":
                    Boolean isLoggedIn = true;
                    //do {
                    System.out.println("He elegido iniciar sesion");
                    System.out.println("Escriba el nombre de usuario: ");
                    username = input.nextLine();
                    System.out.println("Escriba la contrasena");
                    password = input.nextLine();
                    User userLoggedIn = login(username,password,users);
                    System.out.println("Bienvenido\n" +
                            userLoggedIn);
                    if (userLoggedIn.getAdmin()){
                        Boolean seguir = true;
                        do {
                            System.out.println(menuAdmin(movies));
                            System.out.println("Que opcion desea:");
                            String opcion2 = input.nextLine();
                            switch (opcion2){
                                case "1":
                                    System.out.println("He elegido agregar pelicula:");
                                    System.out.println("Escriba el nombre de la pelicula: ");
                                    String movieName = input.nextLine();
                                    System.out.println("Ha que hora es la pelicula?");
                                    Integer movieTime = input.nextInt();
                                    Movie movie = new Movie(movieName,movieTime);
                                    movies.add(movie);
                                    System.out.println("Ha agregrado la pelicula:\n" +
                                            movie);
                                    break;
                                case "2":
                                    System.out.println("Ha elegido agregar sala:");
                                    System.out.println("Escriba el numero de la sala: ");
                                    int numRoom = input.nextInt();
                                    System.out.println("Eliga la pelicula que estara en la sala:");
                                    System.out.println("Estas son las peliculas:");
                                    System.out.println(movies);
                                    int numMovie = input.nextInt();
                                    Movie movieInRoom = movies.get(numMovie-1);
                                    TheaterRoom newRoom = new TheaterRoom(numRoom,movieInRoom);
                                    rooms.add(newRoom);
                                    System.out.println("Ha agregado la sala:\n" +
                                            newRoom);
                                    break;
                                case "3":
                                    System.out.println("Ha cerrado sesion");
                                    seguir = false;
                                    break;
                            }
                        }while (seguir);
                    } else if (!userLoggedIn.getAdmin()) {
                        Boolean seguir = true;
                        do {
                            System.out.println(menuUsuario());
                            System.out.println("Que opcion desea?: ");
                            String opcion2 = input.nextLine();
                            switch (opcion2){
                                case "1":
                                    System.out.println("Ha elegido comprar ticket");
                                    System.out.println("A que sala quiere entrar?");
                                    System.out.println(rooms);
                                    int numRoom = input.nextInt();
                                    TheaterRoom sala = rooms.get(numRoom-1);
                                    System.out.println(rooms.get(numRoom-1));
                                    System.out.println("Escriba la fila del asiento:");
                                    int row = input.nextInt();
                                    System.out.println("Escriba la columna del asiento");
                                    int column = input.nextInt();
                                    Seats seat = new Seats(row,column);
                                    userLoggedIn.buyTicket(sala,seat);
                                    System.out.println("Este es su ticket:"+userLoggedIn.getTicket());
                            }
                        }while (seguir);
                    }

                    //}while (isLoggedIn);

            }

        }while (continuar);
    }
    public static String menu(){
        String menu ="1. Agregar Usuario\n" +
                "2. Iniciar Sesion\n" +
                "3. Salir";
        return menu;
    }
    private static User login(String username, String password, ArrayList<User> Usuarios) {
        for (int username12 = 0; username12 < Usuarios.size(); ++username12) {
            User UserAdmin = Usuarios.get(username12);

            if (UserAdmin.getUsername().equals(username)) {
                if (UserAdmin.getPassword().equals(password)) {
                    return UserAdmin;
                }
            }
        }
        return null;
    }
    public static String menuAdmin(ArrayList<Movie> movies){
        String menu ="";
        if(movies.isEmpty()){
            menu="Menu administradores\n" +
                    "1. Agregar pelicula";
            return menu;
        }else if (!movies.isEmpty()){
            menu += "Menu administradores\n" +
                    "1. Agregar pelicula\n" +
                    "2. Agregar sala\n" +
                    "3. Cerrrar sesion";
            return menu;
        }
        return null;
    }
    public static String menuUsuario(){
        String menu = "Menu usuario\n" +
                "1. Comprar Ticket\n" +
                "2. Cerrar Sesion";
        return menu;
    }

}

