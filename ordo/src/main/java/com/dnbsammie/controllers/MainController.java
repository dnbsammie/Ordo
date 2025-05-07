package com.dnbsammie.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contentArea;

    private void loadScreen(String fxmlPath) {
        try {
            Node screen = FXMLLoader.load(getClass().getResource("/com/dnbsammie/views/screens/" + fxmlPath));
            contentArea.getChildren().setAll(screen);
        } catch (IOException e) {
            System.out.println("Error al cargar pantalla: " + fxmlPath);
            e.printStackTrace();
        }
    }

    @FXML
    private void loadHome() {
        loadScreen("Home.fxml");
    }

    @FXML
    private void loadProfile() {
        loadScreen("Profile.fxml");
    }

    @FXML
    private void loadSettings() {
        loadScreen("Settings.fxml");
    }

    @FXML
    private void toggleOptionsMenu() {
        System.out.println("Aquí iría el menú flotante de opciones (todavía no implementado)");
    }
}