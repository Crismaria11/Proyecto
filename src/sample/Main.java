dpackage sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import people.Person;

import javafx.event.ActionEvent;

import javafx.stage.Stage;
import sample.dao.baseDeDatos;


public class Main extends Application {

}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Sign Up");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
                baseDeDatos dbAdapter = new baseDeDatos();
                dbAdapter.connect();
                dbAdapter.disconne();

            }



// inicio del programa.
public static void main(String[] args) {launch(args); }




public Signup() {

            initComponents();
        }


        private void initComponents() {

            String nombre = nombretexto.getText().toString();
            String apellido = apellidotexto.getText().toString();
            String conraseña= contraseñatexto.getText().toString();
            String confirmar = confirmartexto.getText().toString();
            String email = emailtexto.getText().toString();

            if(nombre.equals("")||apellido.equals("")||contraseña.equals("")||confirmar.equals("")||email.equals(""))
            {
                Toast.makeText(getApplicationContext(), "Porfavor llene los espacios", Toast.LENGTH_LONG).show();
                return;

}
        




