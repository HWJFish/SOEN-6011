import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Standard Derivation Calculation");

        StackPane root=new StackPane();
        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
