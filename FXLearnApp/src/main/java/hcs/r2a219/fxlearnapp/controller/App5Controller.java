package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import hcs.r2a219.fxlearnapp.util.Player;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.util.concurrent.locks.Lock;

public class App5Controller {

    private Timeline _timer = null;

    @FXML
    private TextField count;

    // private boolean flag;


    @FXML
    void initialize() {
        // 画面表示前の初期設定
        // flag = false;;
    }

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    int flag = 0;

    @FXML
    protected void play(){
        count.setEditable(false);
        if(flag == 0) {
            _timer = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
                int timerCount = Integer.parseInt(count.getText()) - 1;
                count.setText(String.valueOf(timerCount));

                if (timerCount <= 0) {
                    _timer.stop();
                    Player.play("chime.wav");
                }
            }));


            _timer.setCycleCount(Timeline.INDEFINITE);
            _timer.play();
            flag = 1;
        }
    }

    @FXML
    protected void stop(){
        if(flag == 1){
            _timer.stop();
            flag = 0;
            count.setEditable(true);
        }
    }

    @FXML
    protected void reset() {
        count.setText("180");
        if (flag == 1) {
            _timer.stop();
            flag = 0;
            count.setEditable(true);
        }
    }
}