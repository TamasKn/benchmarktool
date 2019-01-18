package BM;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("bm.fxml"));
        //primaryStage.getIcons().add(new Image(Controller.class.getResourceAsStream("static/chip2.png")));
        primaryStage.getIcons().add(new Image("static/chip2.png"));
        primaryStage.initStyle(StageStyle.UNDECORATED);

        primaryStage.setTitle("Benchmarking tool for PC Building Simulator");
        primaryStage.setScene(new Scene(root, 950, 650));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }






}
