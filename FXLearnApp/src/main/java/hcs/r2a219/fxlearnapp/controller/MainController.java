package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void initialize() {
        // 画面表示前の初期設定
    }

    @FXML
    void pushButtonApp1(ActionEvent event) {
        MainApplication.showApp(1);
    }

    @FXML
    void pushButtonApp2(ActionEvent event) {
        MainApplication.showApp(2);
    }

    @FXML
    void pushButtonApp3(ActionEvent event) {
        MainApplication.showApp(3);
    }

    @FXML
    void pushButtonApp4(ActionEvent event) {
        MainApplication.showApp(4);
    }

    @FXML
    void pushButtonApp5(ActionEvent event) {
        MainApplication.showApp(5);
    }

    @FXML
    void pushButtonApp6(ActionEvent event) {
        MainApplication.showApp(6);
    }

}