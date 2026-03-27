package hcs.r2a219.fxlearnapp.util;

import javafx.scene.image.Image;

/**
 * JavaFX用画像ファイル設定支援クラス.
 */
public class Imager {

    /**
     * 画像ファイルの格納パス
     */
    private static final String IMAGE_PATH = "src/main/resources/image/";

    /**
     * 指定した画像ファイルをImage形式で返却する.
     *
     * @param fileName 画像ファイル名
     * @return Image
     */
    public static Image get(String fileName) {
        String imagePath = "file:" + IMAGE_PATH + fileName;
        return new Image(imagePath);
    }

}
