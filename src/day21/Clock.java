package day21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock {
    public static void main(String[] args) {
        //ActionListener listener=new TimerListner();
      //Timer timer= new Timer(5000, listener);
        Timer timer= new Timer(5000, e ->
                System.out.println("This is being called with lamda expression"));
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
