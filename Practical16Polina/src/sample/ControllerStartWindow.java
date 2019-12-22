package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerStartWindow {

    @FXML
    private Label labelName;

    @FXML
    private TextField textName;

    @FXML
    private Label labelMenu;

    @FXML
    private Label labelChizburger;

    @FXML
    private TextField textCountChizburger;

    @FXML
    private Label labelCofe;

    @FXML
    private TextField textCountCofe;

    @FXML
    private Label labelBigMac;

    @FXML
    private TextField textCountBigMac;

    @FXML
    private Label labelNagets;

    @FXML
    private TextField textCountNagets;

    @FXML
    private Label labelFree;

    @FXML
    private TextField textCountFree;

    @FXML
    private Button buttonBuy;


    @FXML
    void clickedBuy(ActionEvent event) {
        if (!textCountChizburger.getText().equals("")) {
            Logic.addOrderElement(new Chizburger(Integer.parseInt(textCountChizburger.getText())));
        }
        if (!textCountCofe.getText().equals("")) {
            Logic.addOrderElement(new Cofe(Integer.parseInt(textCountCofe.getText())));

        }
        if (!textCountBigMac.getText().equals("")) {
            Logic.addOrderElement(new BigMac(Integer.parseInt(textCountBigMac.getText())));
        }
        if (!textCountFree.getText().equals("")) {
            Logic.addOrderElement(new Free(Integer.parseInt(textCountFree.getText())));
        }
        if (!textCountNagets.getText().equals("")) {
            Logic.addOrderElement(new Nagets(Integer.parseInt(textCountNagets.getText())));
        }

        Logic.setName(textName.getText());

        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("finishWindow.fxml"));
        } catch (Exception e) {
            e.getMessage();
        }
        assert root != null;
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }


}