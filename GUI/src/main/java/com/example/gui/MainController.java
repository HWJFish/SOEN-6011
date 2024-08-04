package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainController {

  @FXML
  private TextArea inputText;
  @FXML
  private TextArea outputText;
  @FXML
  private Label OutputInstructionText;
  @FXML
  Label welcomeMessage;
  @FXML
  Label instruction;
  @FXML
  Button calculateButton;
  @FXML
  public void initialize() {
    welcomeMessage.setAccessibleText("Welcome message");
    welcomeMessage.setAccessibleHelp("A message for welcome");
    instruction.setAccessibleText("Instruction text");
    instruction.setAccessibleHelp("Enter numbers separated by spaces, tabs, or newlines");
    inputText.setAccessibleText("Input box");
    inputText.setAccessibleHelp("Enter your input here");
    calculateButton.setAccessibleText("Calculate Button");
    calculateButton.setAccessibleHelp("Click this button to calculate");

  }

  @FXML
  protected void onCalculateButtonClick() {
    try {
      OutputInstructionText.setText("Calculating...");
      OutputInstructionText.setVisible(true);
      double output = Calculation.getStandardDeviationWithString(inputText.getText());
      OutputInstructionText.setText("Result:");
      OutputInstructionText.setStyle("");
      outputText.setText(output + "");
      outputText.setVisible(true);
    } catch (NumberFormatException e) {
      showErrorMessage(
          "You have non-numeric or empty input entered please double check!\n" + e.getMessage());
    } catch (Exception e) {
      showErrorMessage("Unknown exception with message: " + e.getMessage());
    }

  }

  private void showErrorMessage(String errorMessage) {
    OutputInstructionText.setText("Error: "+errorMessage);
    OutputInstructionText.setVisible(true);
    OutputInstructionText.setStyle("-fx-text-fill: red;");
    outputText.setText("");
    outputText.setVisible(false);
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error Alert");
    alert.setHeaderText(null);
    alert.setContentText(errorMessage);
    alert.showAndWait();
  }
}