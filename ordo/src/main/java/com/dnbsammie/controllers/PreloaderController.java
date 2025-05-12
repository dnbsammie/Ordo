// package com.dnbsammie.controllers;

// import com.dnbsammie.App;
// import javafx.application.Preloader;
// import javafx.application.Preloader.PreloaderNotification;
// import javafx.stage.Stage;
// import javafx.scene.Scene;
// import javafx.scene.control.ProgressBar;
// import javafx.scene.layout.StackPane;

// public class PreloaderController {
// private ProgressBar progressBar;

// @Override
// public void start(Stage primaryStage) throws Exception {
// progressBar = new ProgressBar();
// StackPane root = new StackPane(progressBar);
// primaryStage.setScene(new Scene(root, 300, 200));
// primaryStage.show();
// }

// @Override
// public void handleApplicationNotification(PreloaderNotification info) {
// if (info instanceof ProgressNotification) {
// progressBar.setProgress(((ProgressNotification) info).getProgress());
// }
// }
// }
