package com.dnbsammie.models;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class Task extends BaseModel {
    private String title, description;
    private TaskCategory category;
    private TaskPriority priority;
    private boolean complete;
    private boolean isRecurring;
    private List<String> recurrenceDays;
    private LocalDateTime deadline;

    public Task(LocalDateTime createdAt, LocalDateTime updatedAt, String title, String description,
            TaskCategory category, TaskPriority priority, boolean complete, boolean isRecurring,
            List<String> recurrenceDays, LocalDateTime deadline) {
        super(createdAt, updatedAt);
        this.title = title;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.complete = complete;
        this.isRecurring = isRecurring;
        this.recurrenceDays = recurrenceDays;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return complete;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public List<String> getRecurrenceDays() {
        return recurrenceDays;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public void setRecurrenceDays(List<String> recurrenceDays) {
        this.recurrenceDays = recurrenceDays;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void toggleCompletion() {
        this.complete = !this.complete;
        updateTimeStamp();
    }

    public Duration timeUntilDeadline() {
        return Duration.between(LocalDateTime.now(), deadline);
    }

    public boolean isOverdue() {
        return deadline != null && LocalDateTime.now().isAfter(deadline);
    }

    // Métodos Actuales:
    public boolean isDueToday() {
        return deadline != null && deadline.toLocalDate().isEqual(LocalDateTime.now().toLocalDate());
    }

    public LocalDateTime nextRecurrenceDate() {
        if (!isRecurring || recurrenceDays.isEmpty())
            return null;

        LocalDateTime now = LocalDateTime.now();
        for (String day : recurrenceDays) {
            DayOfWeek targetDay = DayOfWeek.valueOf(day.toUpperCase());
            LocalDateTime nextOccurrence = now.with(TemporalAdjusters.next(targetDay));
            if (nextOccurrence.isAfter(now))
                return nextOccurrence;
        }
        return null;
    }
}