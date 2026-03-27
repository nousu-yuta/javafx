package hcs.r2a219.fxlearnapp.controller;

import hcs.r2a219.fxlearnapp.MainApplication;
import hcs.r2a219.fxlearnapp.util.Imager;
import hcs.r2a219.fxlearnapp.util.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class App4Controller {

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        // 画面表示前の初期設定
    }

    @FXML
    void pushBackButton(ActionEvent event) {
        MainApplication.showApp(0);
    }

    @FXML
    protected void beforeClick() {
        image.setImage(Imager.get("before.png"));
        Player.play("maru.wav");
    }

    @FXML
    protected void afterClick(){
        image.setImage(Imager.get("after.png"));
        Player.play("batsu.wav");
    }

    @FXML
    protected void up(){
        image.setLayoutY(image.getLayoutY() -3);
    }

    @FXML
    protected void down(){
        image.setLayoutY(image.getLayoutY() +3);

    }

    @FXML
    protected void left(){
        image.setLayoutX(image.getLayoutX() -3);

    }

    @FXML
    protected void right(){
        image.setLayoutX(image.getLayoutX() +3);

    }

    @FXML
    protected void reset(){
        image.setLayoutX(175.0);
        image.setLayoutY(220.0);
        Player.play("chime.wav");
    }
}
