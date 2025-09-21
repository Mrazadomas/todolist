package org.example;
import java.util.ArrayList;

public class ToDoList {

    public static ArrayList<String> Incomplete = new ArrayList<String>();
    public static ArrayList<String> complete = new ArrayList<String>();
    
    public void add(String input) {
        Incomplete.add(input);
    }
    
    public void add(int input) {
        System.out.println("Please enter the name of a task in the form of a string.");
    }

    public void complete(String input) {
        for (int i = 0; i < Incomplete.size(); i++) {
            if (Incomplete.get(i).equals(input)) {
                complete.add(input);
                Incomplete.remove(i);
            }
        }
    }

    public void complete(int input) {
        System.out.println("Please enter the name of a task in the form of a string.");
    }

    public void all() {
        System.out.println("Incomplete:\n\n");
        for (int i = 0; i < Incomplete.size(); i++) {
            System.out.println((i + 1) + ". " + Incomplete.get(i));
            }
        System.out.println("\n");
            System.out.println("Complete:\n\n");
        for (int i = 0; i < complete.size(); i++) {
            System.out.println((i + 1) + ". " + complete.get(i));
            }
    }

    public void complete() {
        System.out.println("Complete:\n");
        for (int i = 0; i < complete.size(); i++) {
            System.out.println((i + 1) + ". " + complete.get(i));
            }
    }

    public void incomplete() {
        System.out.println("Incomplete:\n");
        for (int i = 0; i < Incomplete.size(); i++) {
            System.out.println((i + 1) + ". " + Incomplete.get(i));
            }
    }

    public void clear() {
        Incomplete.clear();
        complete.clear();
    }
        
    

}
