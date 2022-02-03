package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




public class UserProfile3 extends Application {
@Override
public void start(Stage stage) {
try {
Parent root = FXMLLoader.load(getClass().getResource("UserProfile3.fxml"));
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
//C:\Users\Hp\Downloads\openjfx-17.0.1_windows-x64_bin-sdk (1)\javafx-sdk-17.0.1\lib