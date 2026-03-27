package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class App3Controller {

    @FXML
    private TextField height;

    @FXML
    private TextField weight;

    @FXML
    private Label output;

    @FXML
    private Label res;

    @FXML
    void initialize() {
        // 画面表示前の初期設定

    }

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    @FXML
    protected void click() {
        //画面から受け取る物はすべてString型
        double heightDouble = Double.parseDouble(height.getText());
        double weightDouble = Double.parseDouble(weight.getText());

        //TODO BMIを計算する
        double heightM = heightDouble / 100;
        double bmi = weightDouble / (heightM * heightM);

        //結果をString型に変換する
        double outText = Math.floor(bmi * 10) / 10;
        output.setText(String.format("%.1f", outText));

        if (bmi < 18.5) {
            res.setText( "低体重(痩せ型)");
            res.setTextFill(Color.BLUE);
        } else if (bmi < 25) {
            res.setText( "標準体重");
            res.setTextFill(Color.GREEN);
        } else if (bmi < 30) {
            res.setText( "肥満(1度)");
            res.setTextFill(Color.YELLOW);
        } else if (bmi < 35) {
            res.setText( "肥満(2度)");
            res.setTextFill(Color.ORANGE);
        } else if (bmi < 40) {
            res.setText( "肥満(3度)");
            res.setTextFill(Color.RED);
        } else {
            res.setText( "肥満(4度)");
            res.setTextFill(Color.PURPLE);
        }

    }
}