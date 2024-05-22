package org.example.lab01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Controller
{
    @FXML
    private Label courseLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Button welcomeButton;

    @FXML
    private void welcomeButtonClick()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Welcome to Course");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to Lab-01");
        alert.showAndWait();
    }
}