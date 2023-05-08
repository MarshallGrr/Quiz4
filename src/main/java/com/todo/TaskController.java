/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


 */        
package com.todo;

import java.util.*;
/**
 *
 * @author informatica
 */
public class TaskController {
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskController() {
    }
    
    public void create(Task entTask){
        tasks.add(entTask);
    }
    
    public Task read(String title){
        
        
        for(int ii = 0; ii < tasks.size(); ii++){
            if(tasks.get(ii).getTitle().equals(title)){
                return tasks.get(ii);
            }
            else{
                System.out.println("No se encontro el task, ingrese de nuevo el titulo: ");
                return null;
                       
                        
            }
        }
        return null;
        
    }
    
    public void update(String title, String newTitle, String desc, boolean status){
        Task uptTask = read(title);
        
        if(newTitle != null && newTitle != title){
            uptTask.setTitle(newTitle);
        }
        else if(desc != uptTask.getDescription() && desc != null){
            uptTask.setDescription(desc);
        }
        else if(status != uptTask.isStatus()){
            uptTask.setStatus(status);
        }
        
        for(int ii = 0; ii < tasks.size(); ii++){
            if(tasks.get(ii).getTitle().equals(title)){
                tasks.set(ii, uptTask);
            }
        }
        
    }
        
    public void delete(Task entTask){
         tasks.remove(entTask);
    }
    
    
}
