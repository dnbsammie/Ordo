package com.dnbsammie.models;

import java.util.List;

public class User {
    private String name, email, password;
    private List<Task> tasks;
    private List<TimeBlock> schedule;

    public User(String name, String email, String password, List<Task> tasks, List<TimeBlock> schedule) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.tasks = tasks;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<TimeBlock> getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void addTimeBlock(TimeBlock block) {
        schedule.add(block);
    }

    public void removeTimeBlock(TimeBlock block) {
        schedule.remove(block);
    }
}
