package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button buttonStart;

    @FXML
    private Label labelName;

    @FXML
    private Label labelSurname;

    @FXML
    private TextField textName;

    @FXML
    private TextField textSurname;

    @FXML
    private Label labelMenu;

    @FXML
    private Label labelPirozhok;

    @FXML
    private TextField textCountPirozhok;

    @FXML
    private Label labelKruassan;

    @FXML
    private TextField textCountKruassan;

    @FXML
    private Label labelPastila;

    @FXML
    private TextField textCountPastila;

    @FXML
    private Label labelBlin;

    @FXML
    private TextField textCountBlin;

    @FXML
    private Label labelVatrushka;

    @FXML
    private TextField textCountVatrushka;

    @FXML
    private Button buttonBuy;

    @FXML
    private Label labelComment;

    @FXML
    private TextArea textComment;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setVisible(false);
    }

    @FXML
    void clickedStart(ActionEvent event) {
        setVisible(true);
    }

    @FXML
    void clickedBuy(ActionEvent event) {
        if (!textCountPirozhok.getText().equals("")) {
            Logic.addOrderElement(new Pirozhok(Integer.parseInt(textCountPirozhok.getText())));
        }
        if (!textCountVatrushka.getText().equals("")) {
            Logic.addOrderElement(new Vatrushka(Integer.parseInt(textCountVatrushka.getText())));

        }
        if (!textCountPastila.getText().equals("")) {
            Logic.addOrderElement(new Pastila(Integer.parseInt(textCountPastila.getText())));
        }
        if (!textCountBlin.getText().equals("")) {
            Logic.addOrderElement(new Blin(Integer.parseInt(textCountBlin.getText())));
        }
        if (!textCountKruassan.getText().equals("")) {
            Logic.addOrderElement(new Kruassan(Integer.parseInt(textCountKruassan.getText())));
        }

        Logic.setName(textName.getText());
        Logic.setSurname(textSurname.getText());

        Logic.setComment(textComment.getText());

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

    private void setVisible(boolean flag) {
        buttonBuy.setVisible(flag);

        labelName.setVisible(flag);
        labelSurname.setVisible(flag);
        labelBlin.setVisible(flag);
        labelComment.setVisible(flag);
        labelKruassan.setVisible(flag);
        labelPastila.setVisible(flag);
        labelPirozhok.setVisible(flag);
        labelVatrushka.setVisible(flag);
        labelMenu.setVisible(flag);

        textComment.setVisible(flag);
        textCountKruassan.setVisible(flag);
        textCountBlin.setVisible(flag);
        textCountPastila.setVisible(flag);
        textCountVatrushka.setVisible(flag);
        textCountPirozhok.setVisible(flag);
        textName.setVisible(flag);
        textSurname.setVisible(flag);

        buttonStart.setVisible(!flag);
    }

}