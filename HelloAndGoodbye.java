package mygui;

//1. Import the necessary toolboxes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // This one is VERY important for events!

public class HelloAndGoodbye extends JFrame {
 // 2. Declare the Source (the button)
 private JButton helloButton;

 // 3. The constructor builds the GUI
 public HelloAndGoodbye() {
     // ... (window setup code from previous example) ...
     helloButton = new JButton("Hello"); // Create the button with the text "Hello"

     // --- THIS IS THE IMPORTANT PART FOR EVENTS ---
     // Step 3: REGISTER the Listener with the Source.
     // 'new ButtonListener()' creates the Listener object.
     // 'addActionListener' registers it with the button.
     helloButton.addActionListener(new ButtonListener());
     // ---

     // Add the button to the window
     add(helloButton);
     setVisible(true);
     setSize(300, 200);
     // ...
 }

 // 4. Create the Listener (The "Brain")
 // This is an 'inner class' (a class inside a class)
 private class ButtonListener implements ActionListener {
     // This is the method that will run when the button is clicked.
     // This is the "response" to the event.
     public void actionPerformed(ActionEvent e) {
         // Check if the source of the event is our helloButton
         if (e.getSource() == helloButton) {
             System.out.println("ooh! she clicked me"); // The action: print "Hello"
         }
     }
 }

 // 5. The main method to run everything
 public static void main(String[] args) {
     new HelloAndGoodbye();
 }
}
