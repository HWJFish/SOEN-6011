package com.example.gui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StandardDeviationGuiMain extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(
        StandardDeviationGuiMain.class.getResource("mainView.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 600, 600);
    stage.setTitle("Standard Deviation");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}