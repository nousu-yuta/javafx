package hcs.r2a219.fxlearnapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    /**
     * アプリ名
     */
    public static String APP_NAME = "r2a219野生須優太";

    /**
     * 指定されたアプリ番号に対応した画面を読み込む.
     * @param appNo アプリ番号
     */
    private static FXMLLoader getFXMLLoader(int appNo) {

        String sceneFxml = null;
        switch(appNo) {
            case 1:
                sceneFxml = "app1.fxml";
                break;
            case 2:
                sceneFxml = "app2.fxml";
                break;
            case 3:
                sceneFxml = "app3.fxml";
                break;
            case 4:
                sceneFxml = "app4.fxml";
                break;
            case 5:
                sceneFxml = "app5.fxml";
                break;
            case 6:
                sceneFxml = "app6.fxml";
                break;
            default:
                sceneFxml = "main.fxml";
                break;
        }

        return new FXMLLoader(MainApplication.class.getResource(sceneFxml));
    }

    private static Stage _stage = null;

    /**
     * アプリを切り替える（画面遷移する）.
     * @param appNo アプリ番号
     */
    public static void showApp(int appNo){
        FXMLLoader fxmlLoader = getFXMLLoader(appNo);

        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 576);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MainApplication._stage.setScene(scene);

        MainApplication._stage.show();
    }

    @Override
    public void start(Stage stage) {
        // ウィンドウ設定
        stage.setTitle(APP_NAME);
        stage.setX(0);
        stage.setY(0);
        MainApplication._stage = stage;

        // 初期画面表示
        MainApplication.showApp(0);
    }

    public static void main(String[] args) {
        launch();
    }

}