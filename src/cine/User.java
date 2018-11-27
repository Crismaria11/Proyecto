package cine;

public class User {
    String username;
    String password;
    String email;
    Boolean admin;
    Ticket ticket;


    public User(String username, String password, String email, Boolean admin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.admin = admin;
    }

    public void buyTicket(TheaterRoom theaterRoom, Seats seats) {
        Ticket ticket = new Ticket(theaterRoom, seats);
        this.ticket = ticket;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getAdmin() {
        return admin;
    }


    @Override
    public String toString() {
        return "(Usuario: " + username + ", Contrasena: " + password + ", Correo: " + email + ", Admin: " +admin+ ")";
    }
}
