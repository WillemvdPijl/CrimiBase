/**
 * Created by Arie on 18-4-2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Stack;

public class Main extends Application {

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("CrimiBase");

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 1000, 600);
        window.setScene(scene);
        window.show();
    }
}
