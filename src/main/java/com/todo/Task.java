/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo;

/**
 *
 * @author informatica
 */
public class Task {
    private String title = "";
    private String description = "";
    private boolean status = false;

    public Task(String title, String description, boolean status) {
        this.description = description;
        this.title = title;
        this.status = status;
        
    }
    
    public String toString(){
        return getTitle() + " " + getDescription() + " " + isStatus();
    }
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
