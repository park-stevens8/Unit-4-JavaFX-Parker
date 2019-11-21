import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class BankAccountClient extends Application {
  public void start(Stage stage) {
    Scene scene = new Scene(new BankAccountGUI(), 1000, 500);

    stage.setTitle("Bank Account GUI");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[]args) {
    launch(args);
  }
}
