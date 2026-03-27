package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class App6Controller {

    @FXML
    private Label timeLabel;    // タイマー表示

    @FXML
    private Button startStopButton;  // スタート、ストップボタン


    private double seconds = 0.0;  // 秒数
    private Timeline timeline;  // タイマー
    private boolean running = false;  // タイマーの状態

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    public void initialize() {
        timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            seconds += 0.01;
            timeLabel.setText(formatTime(seconds));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    // スタート、ストップボタン
    @FXML
    protected void StartStop() {
        if (running) {
            timeline.stop();
            startStopButton.setText("Start");
        } else {
            startTimer();
            startStopButton.setText("Stop");
        }
        running = !running;
    }

    // リセットボタン
    @FXML
    protected void reset() {
        if (running) {
            timeline.stop();
            startStopButton.setText("Start");
            running = false;
        }
        seconds = 0.0;  // 秒数リセット
        timeLabel.setText(formatTime(seconds));  // リセット後の表示
    }

    // 秒数を表示
    protected String formatTime(double seconds) {
        int minutes = (int) seconds / 60;
        double remainingSeconds = seconds % 60;  // 小数部分の残りの秒数
        return String.format("%02d:%05.2f", minutes, remainingSeconds);
    }

    // タイマーを開始
    protected void startTimer() {
        if (!running) {
            timeline.play();
        }
    }
}