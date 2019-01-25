package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static MainController mainController = new MainController();

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainUI.fxml"));
        loader.setController(mainController);
        Parent root = loader.load();
        primaryStage.setTitle("Caesar's Cipher");
        primaryStage.setScene(new Scene(root));



        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
