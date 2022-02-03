package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




public class BookYourAppointment1 extends Application {
@Override
public void start(Stage stage) {
try {
Parent root = FXMLLoader.load(getClass().getResource("BookYourAppointment1.fxml"));
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