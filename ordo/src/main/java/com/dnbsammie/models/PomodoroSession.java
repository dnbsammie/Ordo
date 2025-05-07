package com.dnbsammie.models;

public class PomodoroSession {
    private int pomodorosCompleted;
    private final int pomodoroDuration;
    private final int breakDuration;
    private int currentSessionTime;
    private boolean isRunning;

    public PomodoroSession(int pomodoroDuration, int breakDuration) {
        this.pomodorosCompleted = 0;
        this.pomodoroDuration = pomodoroDuration;
        this.breakDuration = breakDuration;
        this.currentSessionTime = 0;
        this.isRunning = false;
    }

    public boolean isBreakTime() {
        return currentSessionTime >= pomodoroDuration;
    }

    public void updateSessionTime(int minutes) {
        if (isRunning) {
            currentSessionTime += minutes;
        }
    }

    public void resetSession() {
        pomodorosCompleted = 0;
        currentSessionTime = 0;
        isRunning = false;
    }

    public int getPomodoroDuration() {
        return pomodoroDuration;
    }

    public int getBreakDuration() {
        return breakDuration;
    }

    public int getCurrentSessionTime() {
        return currentSessionTime;
    }

    public void startSession() {
        if (!isRunning) {
            this.isRunning = true;
            this.currentSessionTime = 0;
        }
    }

    public void completePomodoro() {
        if (isRunning) {
            pomodorosCompleted++;
            isRunning = false;
            currentSessionTime = 0;
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getPomodorosCompleted() {
        return pomodorosCompleted;
    }
}
