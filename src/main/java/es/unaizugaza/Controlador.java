package es.unaizugaza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Button btcancel;

    @FXML
    private Button btok;

    @FXML
    private TextField txtdescription;

    @FXML
    private TextArea txtnombre;

    @FXML
    void aniadeFila(ActionEvent event) {
        if (!(txtnombre.getText().equals(""))) {
            txtdescription.appendText("\n" + txtnombre.getText());
        }
    }

    @FXML
    void borrartTxt(ActionEvent event) {
        txtdescription.clear();
    }

}
