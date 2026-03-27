package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class App2Controller {

    @FXML
    private TextField input;

    @FXML
    private Label output;

    @FXML
    private TextField input2;

    @FXML
    private Label output2;

    @FXML
    void initialize() {
        // 画面表示前の初期設定


    }

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    @FXML
    protected void click(){
        String name = input.getText();
        String outText = name + "さん、こんにちは";
        output.setText(outText);
    }

    String text="";

    @FXML
    protected void click2(){
        text += input2.getText();
        String outText = ("追加文字→" + text);
        output2.setText(outText);
    }
}