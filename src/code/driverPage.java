package code;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class driverPage {
    public driverPage() {
        JFrame frame = new JFrame("Driver");
        frame.setSize(1120, 750);
        frame.setLayout(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel j = new JLabel("Driver");
        j.setFont(new Font("Helvetica", Font.BOLD, 30));
        j.setBounds(510, 50, 100, 30);
        frame.add(j);

        String[] temp = pageOne.username.split("@");
        String username = temp[0];
        for (int i = 0; i < fileFunctions.numberOfLines("info.txt"); i++) {
            String[] user = fileFunctions.readFile("info.txt", 0, i).split("@");

            if (user[0].equals(username)) {
                System.out.println("Found" + user[0]);
                
            }
        }
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new driverPage();
    }
    
}
