package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private Label labelBuyFinish;

    @FXML
    private Label labelOrder;

    @FXML
    void ckickedBuy(ActionEvent event) {
        buttonBuy.setVisible(false);
        textOrder.setVisible(false);
        labelOrder.setVisible(false);

        labelBuyFinish.setText("Оплачено " + sumPrice);
        labelBuyFinish.setVisible(true);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelBuyFinish.setVisible(false);
        StringBuilder buffer = new StringBuilder();
        sumPrice = 0;
        buffer.append(Logic.getName()).append(" ").append(Logic.getSurname()).append("\n");
        for (int i = 0; i < Logic.size(); i++) {
            buffer.append(Logic.getOrderElement(i).getName()).append(" x").append(Logic.getOrderElement(i).getCount()).append("\n");
            sumPrice += Logic.getOrderElement(i).getPrice() * Logic.getOrderElement(i).getCount();
        }
        buffer.append("\nКоментарий к заказу:\n").append(Logic.getComment()).append("\n");
        buffer.append("Сумма заказа: ").append(sumPrice);

        textOrder.setText(String.valueOf(buffer));
    }


}
