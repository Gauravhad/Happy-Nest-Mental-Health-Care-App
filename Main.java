package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;




public class Main extends Application {
@Override
public void start(Stage stage) {
try {
Parent root = FXMLLoader.load(getClass().getResource("Mental1stPage.fxml"));
Image img = new Image("C:\\Users\\Hp\\eclipse-workspace\\Yo FX\\src\\application\\Happy_Nest_Logo.png");
stage.getIcons().add(img);
stage.setTitle("HAPPY NEST");
Scene scene = new Scene(root);

//stage.setFullScreen(true);
stage.setScene(scene);
stage.show();
} catch(Exception e) {
e.printStackTrace();
}
}

public static void main(String[] args) {
launch(args);
}
}