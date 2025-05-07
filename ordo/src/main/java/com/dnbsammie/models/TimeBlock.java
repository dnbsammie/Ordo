package com.dnbsammie.models;

import java.time.LocalDateTime;

public class TimeBlock {
    private LocalDateTime start;
    private LocalDateTime end;
    private Task task;

    public TimeBlock(LocalDateTime start, LocalDateTime end, Task task) {
        this.start = start;
        this.end = end;
        this.task = task;
    }

    public boolean isCurrentTimeWithinBlock() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(start) && now.isBefore(end);
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}