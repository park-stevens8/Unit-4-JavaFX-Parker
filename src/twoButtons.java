import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class twoButtons extends Application {
    private int count;
    private Text countText;

    public void start(Stage stage) {

        count = 50;
        countText = new Text("Pushes: 50");
        Button increment = new Button("Push Me!");
        increment.setOnAction(this::processButtonPress);

        Button decremant = new Button("Push Me!");
        decremant.setOnAction(this::process2ButtonPress);

        FlowPane pane = new FlowPane(increment, decremant , countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: grey");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Push Counter");
        stage.setScene(scene);
        stage.show();

        if(count <= 0){
            pane.setStyle("-fx-background-color: red");
        }
    }
    private void processButtonPress(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count++;
        countText.setText("Pushes: " + count);
    }
    private void process2ButtonPress(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count--;
        countText.setText("Pushes: " + count);
    }

}
