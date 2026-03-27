package hcs.r2a219.fxlearnapp.util;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * JavaFX用音声再生支援クラス.
 */
public class Player {

    /**
     * 音声ファイルの格納パス
     */
    private static final String SOUND_PATH = "src\\main\\resources\\sound\\";

    /**
     * 指定した音声ファイルを1回再生する.
     * @param fileName 音声ファイル名
     */
    public static void play(String fileName) {
        // デフォルトで1回再生
        play(fileName, 1);
    }

    /**
     * 指定した音声ファイルを指定回数再生する.
     * @param fileName 音声ファイル名
     * @param cycleCount 繰り返し回数
     */
    public static void play(String fileName, int cycleCount) {
        String filePath = SOUND_PATH + fileName;
        Media m = new Media(new File(filePath).toURI().toString());

        MediaPlayer mp = new MediaPlayer(m);
        mp.setCycleCount(cycleCount);

        mp.play();
    }
}
