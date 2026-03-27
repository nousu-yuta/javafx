package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import hcs.r2a219.fxlearnapp.util.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class App1Controller {

    @FXML //FXMlファイルにリンクする
    private Label welcomeText;

    @FXML
    private Label text1;

    @FXML
    private Label text2;

    @FXML
    private Button wow;

    @FXML
    void initialize() {
        // 画面表示前の初期設定
    }

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    @FXML
    protected void onHelloButtonClick() {
        // ラベルにテキストを設定する
        welcomeText.setText("ようこそ");

        // 音を鳴らす
        Player.play("maru.wav");
    }

    @FXML
    protected void onHelloButtonClick2() {
        // ラベルにテキストを設定する
        text1.setText("元気やで～!!!!");

        // 音を鳴らす
        Player.play("batsu.wav");
    }

    @FXML
    protected void onHelloButtonClick3() {
        // ラベルにテキストを設定する
        text2.setText("変わった！");
        wow.setText("ここも変わった！");

        // 音を鳴らす
        Player.play("chime.wav");
    }
}

