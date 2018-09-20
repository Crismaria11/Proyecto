public class compra {
    String firstName;
    String lastName;
    String correo;
    String contrasena;


    //Constructor
    public void set(String firstName, String lastName, String correo, String contrasena) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.correo = correo;
        this.contrasena = contrasena;
    }


    public compra(String firstName, String lastName, String correo, String contrasena) {
        this.set(firstName, lastName, correo, contrasena);
    }

}
