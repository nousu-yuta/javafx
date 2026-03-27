module hcs.xxaxxx.fxlearnapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
            
    opens hcs.r2a219.fxlearnapp to javafx.fxml;
    opens hcs.r2a219.fxlearnapp.controller to javafx.fxml;
    opens hcs.r2a219.fxlearnapp.util to javafx.fxml;

    exports hcs.r2a219.fxlearnapp;
    exports hcs.r2a219.fxlearnapp.controller;
    exports hcs.r2a219.fxlearnapp.util;
}