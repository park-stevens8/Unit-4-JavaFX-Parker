import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class userInfoPane extends GridPane {
    private Label result;
    private TextField name;

    public userInfoPane(){
        Font font = new Font(18);
        Label inputLabel = new Label("Name:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);

        Label outputLabel = new Label("Age:");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel,HPos.RIGHT);

        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(70);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processReturn);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");

        add(inputLabel, 0, 0);
        add(name, 1,0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }
    public void processReturn(ActionEvent event) {
        double fahrenheitTemp = Double.parseDouble(name.getText());
        double celsiusTemp = (fahrenheitTemp - 32) * 5.0/9;
        result.setText(Math.round(celsiusTemp) + "");
    }



}
