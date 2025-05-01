/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author User
 */
public class Feedback {
    private String message;
    private int rating;

    public String getMessage() { 
        return message; 
    }
    public void setMessage(String message) { 
        this.message = message; 
    }
    public int getRating() { 
        return rating; 
    }

    public void displayFeedback() {
        System.out.println("Displaying feedback: " + message + " | Rating: " + rating);
    }
}

