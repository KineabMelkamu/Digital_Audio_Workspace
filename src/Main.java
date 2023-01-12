import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("Deaw.fxml")));
        Parent root = loader.load();
        primaryStage.setTitle("EightOhEight");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        Controller controller = loader.getController();
        primaryStage.show();
    }

}
