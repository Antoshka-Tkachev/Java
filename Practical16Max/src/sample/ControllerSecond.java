package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSecond implements Initializable {
    int sumPrice;

    @FXML
    private Label labelTitle;

    @FXML
    private TextArea textOrder;

    @FXML
    private Button buttonBuy;

    @FXML
    private Label labelOrder;

    @FXML
    void ckickedBuy(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Оплата произведена");
        alert.setHeaderText("Оплачено " + sumPrice);
        alert.showAndWait();
        System.exit(02);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        StringBuilder buffer = new StringBuilder();
        sumPrice = 0;
        buffer.append("Номер заказа: " + Logic.getName()).append(" ").append("\n");
        if (Logic.isFlag()) {
            buffer.append("\nУпаковать с собой\n\n");
        } else {
            buffer.append("\nПодать на подносе\n\n");
        }
        for (int i = 0; i < Logic.size(); i++) {
            buffer.append(Logic.getOrderElement(i).getName()).append(" x").append(Logic.getOrderElement(i).getCount()).append("\n");
            sumPrice += Logic.getOrderElement(i).getPrice() * Logic.getOrderElement(i).getCount();
        }
        buffer.append("Сумма заказа: ").append(sumPrice);

        textOrder.setText(String.valueOf(buffer));
    }


}
