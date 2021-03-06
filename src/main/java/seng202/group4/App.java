package seng202.group4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import seng202.group4.GUI.Controller;
import seng202.group4.data.repository.*;

/**
 * Main, runs the program.
 *
 */
public class App extends Application {
    public static Stage primaryStage;

    // create data list
    ObservableList<String> items = FXCollections.observableArrayList("Default Airlines", "Default Airports", "Default Routes");


    @Override
    public void start(Stage primaryStage) throws Exception{

        this.primaryStage = primaryStage;
        FXMLLoader fxml = new FXMLLoader();
        // set location for fxml file
        fxml.setLocation(getClass().getClassLoader().getResource("GUI.fxml"));
        Parent root = fxml.load();
        Controller controller = fxml.getController();
        primaryStage.setTitle("Aviation Information Reader");
        primaryStage.setScene(new Scene(root, 1280, 799));
        primaryStage.setMinHeight(799);
        primaryStage.setMinWidth(1200);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Repository.initRepository();
        launch(args);
        Repository.serialize();
    }
}
