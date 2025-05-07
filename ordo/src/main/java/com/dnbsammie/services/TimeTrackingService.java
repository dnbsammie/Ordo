package com.dnbsammie.services;

import com.dnbsammie.models.PomodoroSession;
import com.dnbsammie.models.TimeBlock;
import java.util.ArrayList;
import java.util.List;

public class TimeTrackingService {
    private PomodoroSession currentSession;
    private final List<TimeBlock> timeBlocks;

    public TimeTrackingService() {
        this.timeBlocks = new ArrayList<>();
    }

    public void addTimeBlock(TimeBlock block) {
        if (block != null) {
            timeBlocks.add(block);
        }
    }

    public boolean isTimeForBreak() {
        return timeBlocks.stream().anyMatch(TimeBlock::isCurrentTimeWithinBlock);
    }

    public void startPomodoro(int duration, int breakTime) {
        if (currentSession == null || !currentSession.isRunning()) {
            currentSession = new PomodoroSession(duration, breakTime);
            currentSession.startSession();
        }
    }

    public void endPomodoro() {
        if (currentSession != null && currentSession.isRunning()) {
            currentSession.completePomodoro();
        }
    }

    public boolean isPomodoroActive() {
        return currentSession != null && currentSession.isRunning();
    }

    public int getPomodorosCompleted() {
        return currentSession != null ? currentSession.getPomodorosCompleted() : 0;
    }
}
