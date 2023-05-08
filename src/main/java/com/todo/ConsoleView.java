/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.todo;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author informatica
 */
public class ConsoleView {

    public static void main(String[] args) throws IOException {
        
        TaskController controller = new TaskController();
        Scanner lectura = new Scanner(System.in);
        int salir = 1;
        while(salir == 1){
        System.out.println("Seleccione lo que quiere hacer ");
   
        System.out.println("A. Crear nueva task ");
        
        System.out.println("B. Leer una tarea existente ");
        
        System.out.println("C. Acutalizar una tarea existente ");
        
        System.out.println("D. Borrar una tarea existente ");
        
        System.out.println("E. Salir");
        
        String resp = lectura.nextLine();
        resp = resp.toUpperCase();
        
        
            switch(resp){
                case "A" -> { 
                    Task task = new Task(lectura.nextLine(),lectura.nextLine(), lectura.nextBoolean());
                    controller.create(task);
                }

                case "B" -> {
                    Task task1 = controller.read(lectura.nextLine());
                    System.out.println(task1.toString());
                }

                case "C" -> {
                    System.out.println("Ingrese los datos en el siguiente orden, en el caso de que no vaya a cambiar ingrese null: ");
                    System.out.println("Titulo: ");
                    String titulo = lectura.nextLine();
                    System.out.println("Nuevo Titulo: ");
                    String nTitulo = lectura.nextLine();
                    System.out.println("Nueva Descripcion: ");
                    String nDesc = lectura.nextLine();
                    System.out.println("Estatus, ingrese false or true: ");
                    boolean status = lectura.nextBoolean();
                    controller.update(titulo, nTitulo, nDesc, status);
                }

                case "D" -> {
                    Task task2 = controller.read(lectura.nextLine());
                    controller.delete(task2);
                }

                case "E" -> {
                }
                    
               
            }
            System.out.println("Desea salir? ");
            System.out.println("0. Si");
            System.out.println("1. No");
            salir = lectura.nextInt();
        }
        
    }
}
