package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Label labelName;

    @FXML
    private TextField textName;

    @FXML
    private Label labelMenu;

    @FXML
    private Label labelSteik;

    @FXML
    private TextField textCountSteik;

    @FXML
    private Label labelShashlik;

    @FXML
    private TextField textCountShashlik;

    @FXML
    private Label labelChickenGril;

    @FXML
    private TextField textCountChickenGril;

    @FXML
    private Label labelShaurma;

    @FXML
    private TextField textCountShaurma;

    @FXML
    private Label labelSok;

    @FXML
    private TextField textCountSok;

    @FXML
    private Button buttonBuy;

    @FXML
    private CheckBox Upakovka;

    @FXML
    void clickedBuy(ActionEvent event) {
        if (!textCountSteik.getText().equals("")) {
            Logic.addOrderElement(new Steik(Integer.parseInt(textCountSteik.getText())));
        }
        if (!textCountShashlik.getText().equals("")) {
            Logic.addOrderElement(new Shashlik(Integer.parseInt(textCountShashlik.getText())));

        }
        if (!textCountChickenGril.getText().equals("")) {
            Logic.addOrderElement(new ChickenGril(Integer.parseInt(textCountChickenGril.getText())));
        }
        if (!textCountShaurma.getText().equals("")) {
            Logic.addOrderElement(new Shaurma(Integer.parseInt(textCountShaurma.getText())));
        }
        if (!textCountSok.getText().equals("")) {
            Logic.addOrderElement(new Sok(Integer.parseInt(textCountSok.getText())));
        }
        if (Upakovka.isSelected()) {
            Logic.setFlag(true);
        }
        Logic.setName(textName.getText());

        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sampleSecond.fxml"));
        } catch (Exception e) {
            e.getMessage();
        }
        assert root != null;
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random random = new Random();
        textName.setText(String.valueOf(random.nextInt(10)));
    }
}