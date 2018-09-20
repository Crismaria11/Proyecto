public class asiento {
    public Object firstname;
    String row;
    int num;
    String firstName;
    String lastName;
    String correo;
    String contrasena;

    //Constructor
    public void set(String row, int num, String firstName, String lastName, String correo, String contrasena) {
        this.row = row;
        this.num = num;
        this.firstName = firstName;
        this.lastName = lastName;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public asiento(String row, int num, String firstName, String lastName, String correo, String contrasena) {

        this.set(row, num, firstName, lastName, correo, contrasena);
    }

}
