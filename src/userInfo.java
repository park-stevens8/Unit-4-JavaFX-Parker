import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class userInfo extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new userInfoPane(), 400, 200);
        stage.setTitle("User Info");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[]args) {
        launch(args);
    }
}
