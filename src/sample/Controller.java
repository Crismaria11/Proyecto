package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    TableView<> peopleTable;

    @FXML
    TableColumn firstNameCol;

    @FXML
    TableColumn lastNameCol;

    @FXML
    public void initialize() {

        public void openNewWindow(ActionEvent event) {
            Parent root;
            try {


                FXMLLoader loader = new FXMLLoader(getClass().getResource("Asientos.fxml"));
                root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Seleccion");
                stage.setScene(new Scene(root, 450, 450));


                TestScetestSceneController = loader.getController();
                Person selectedPerson = peopleTable.getSelectionModel().getSelectedItem();
                if (selectedPerson != null) {
                    testSceneController.setN("" + selectedPerson);
                } else {
                    testSceneController.setName("no has seleccionado una pelicula!");
                }


                stage.show();
                // Hide this current window (if this is what you want)
                // ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

