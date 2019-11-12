import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.stage.Stage;

public class HelloJavaFx extends Application
{
   
    @Override
    public void start(Stage stage)
    {
        Text hello = new Text(110,50, "Hello, World!");
        Text question = new Text(105,80, "How's it going?");
        
        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 300,120, Color.LIGHTBLUE);
        
        stage.setTitle("A JavaFx Program");
        stage.setScene(scene);
        stage.show();
        
    }

}
