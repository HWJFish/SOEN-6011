package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainController {

  @FXML
  private TextArea inputText;
  @FXML
  private TextArea outputText;

  @FXML
  protected void onCalculateButtonClick() {
    try {
      double output = Calculation.getStandardDeviationWithString(inputText.getText());
      outputText.setText(output + "");
    } catch (NumberFormatException e) {
      showErrorMessage(
          "You have non-numeric or empty input entered please double check!\n" + e.getMessage());
    } catch (Exception e) {
      showErrorMessage("Unknown exception with message: " + e.getMessage());
    }

  }

  private void showErrorMessage(String errorMessage) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error Alert");
    alert.setHeaderText(null);
    alert.setContentText(errorMessage);
    alert.showAndWait();
  }
}