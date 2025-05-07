// package com.dnbsammie.controllers;

// import com.dnbsammie.models.PomodoroSession;

// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;

// public class PomodoroController {
// private PomodoroSession session;

// @FXML
// private Label statusLabel;

// @FXML
// private Button startButton;

// @FXML
// private void startPomodoro() {
// session = new PomodoroSession(25, 5);
// session.startSession();
// statusLabel.setText("Pomodoro en curso...");
// }

// @FXML
// private void completePomodoro() {
// if (session != null && session.isRunning()) {
// session.completePomodoro();
// statusLabel.setText("Pomodoro completado! Descanso de " +
// session.getBreakDuration() + " min.");
// }
// }
// }
