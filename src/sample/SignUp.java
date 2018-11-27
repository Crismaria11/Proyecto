package sample;
import java.util.Scanner;

public class SignUp {
    public void run() {
            Scanner scan = new Scanner (new File(""));
            Scanner keyboard = new Scanner (System.in);
            String usuario = scan.nextLine();
            String contra = scan.nextLine();

            String usuarioimp = keyboard.nextLine();
            String contraseñaimp = keyboard.nextLine();

            if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("Bienvenido");
            } else {
                System.out.print("Usuario o contraseña incorrecta");
            }
        }
    }
}
