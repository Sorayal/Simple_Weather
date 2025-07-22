module fiena.simple_weather {
  requires javafx.controls;
  requires javafx.fxml;

  exports simple_weather.client;
  opens simple_weather.client to javafx.fxml;
  exports simple_weather.core;
  opens simple_weather.core to javafx.fxml;
}