package simple_weather.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoreApp extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(
        CoreApp.class.getResource("/simple_weather/client/hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}