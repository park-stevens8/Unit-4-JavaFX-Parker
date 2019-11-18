import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BankAccountGUI extends GridPane{

    private TextField acctName;
    private Label nameOutput;
    private TextField acctNumber;
    private Label numOutput;
    private TextField pin;
    private Label pinOutput;
    private TextField deposit;
    private Label depositOutput;
    private TextField withdrawel;
    private Label withdrawOut;
    private Button depositB;
    private Button withdrawB;
    private Label balance;



    public BankAccountGUI() {
        Button depositb = new Button("Deposit");
        //add .setOnAction

        Button withdrawB = new Button("Withdraw");
        //add .setOnAction

    }
    public void start(Stage primaryStage) {
    }

}
