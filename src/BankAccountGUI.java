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


import static javafx.application.Application.launch;

public class BankAccountGUI extends GridPane {
private TextField acctName;
private TextField acctNumber;
private TextField pin;
private TextField deposit;
private TextField withdraw;
private TextField interest;
private BankAccount acct;

public BankAccountGUI(){
    acct = new BankAccount("Bank Account", 100,0, .0006);

    Button depositButton = new Button("Deposit: ");
    depositButton.setOnAction(this::depositProcess);
    Button withdrawButton = new Button("Withdraw: ");
    withdrawButton.setOnAction(this::withdrawalProcess);
    Button interestButton = new Button("Add Interest: ");
    interestButton.setOnAction(this::interestProcess);
    Button createAcct = new Button("Create Account");
    createAcct.setOnAction(this::createAccount);

    Font font = new Font(18);
    Label nameOutput = new Label("Account Name: ");
    nameOutput.setFont(font);
    GridPane.setHalignment(nameOutput, HPos.RIGHT);

    acctName = new TextField();
    acctName.setFont(font);
    acctName.setPrefWidth(70);
    acctName.setAlignment(Pos.CENTER);

    Label numberOutput = new Label("Account Number: ");
    numberOutput.setFont(font);
    GridPane.setHalignment(numberOutput, HPos.RIGHT);

    acctNumber = new TextField();
    acctNumber.setFont(font);
    acctNumber.setPrefWidth(70);
    acctNumber.setAlignment(Pos.CENTER);

    Label pinOutput = new Label("PIN: ");
    pinOutput.setFont(font);
    GridPane.setHalignment(pinOutput, HPos.RIGHT);

    pin = new TextField();
    pin.setFont(font);
    pin.setPrefWidth(70);
    pin.setAlignment(Pos.CENTER);

    Label depositOutput = new Label("Deposit: ");
    depositOutput.setFont(font);
    GridPane.setHalignment(depositOutput, HPos.RIGHT);

    deposit = new TextField();
    deposit.setFont(font);
    deposit.setPrefWidth(70);
    deposit.setAlignment(Pos.CENTER);


    Label withdrawOutput = new Label("Withdraw: ");
    withdrawOutput.setFont(font);
    GridPane.setHalignment(withdrawOutput, HPos.RIGHT);

    withdraw = new TextField();
    withdraw.setFont(font);
    withdraw.setPrefWidth(70);
    withdraw.setAlignment(Pos.CENTER);


    Label interestOutput = new Label("Interest: ");
    interestOutput.setFont(font);
    GridPane.setHalignment(withdrawOutput, HPos.RIGHT);

    interest = new TextField();
    interest.setFont(font);
    interest.setPrefWidth(70);
    interest.setAlignment(Pos.CENTER);


    Label balance = new Label("Balance: ");
    balance.setFont(font);
    GridPane.setHalignment(balance, HPos.RIGHT);

    setAlignment(Pos.CENTER);
    setHgap(20);
    setVgap(10);
    setStyle("-fx-background-color: grey");

    add(nameOutput, 0,0);
    add(acctName, 1,0);
    add(numberOutput, 3,0);
    add(acctNumber, 4,0);
    add(pinOutput, 0,1);
    add(pin, 1,1);
    add(depositOutput, 2,4);
    add(deposit, 2,5);
    add(withdrawOutput, 3,4);
    add(withdraw, 3,5);
    add(depositButton, 3,6);
    add(withdrawButton, 3,7);
    add(interestOutput,4,4);
    add(interest,4,5);
    add(balance,4,6);
    add(createAcct,1,3);
}

    public void withdrawalProcess(ActionEvent event){
        acct.withdrawal(Double.parseDouble(withdraw.getText()));
}
    public void depositProcess(ActionEvent event){
        acct.deposit(Double.parseDouble(deposit.getText()));
    }
    public void interestProcess(ActionEvent event){
        acct.addInterest(Double.parseDouble(interest.getText()));
    }
    public void createAccount(ActionEvent event){
        acct = new BankAccount(acctName.getText(), 0, 0,(Double.parseDouble(interest.getText())));
    }
}
