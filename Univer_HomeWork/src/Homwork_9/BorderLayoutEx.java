package Homwork_9;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx()
   {
      setTitle("BorderLayout Sample");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());
      add(new JButton("Package Explorer"), BorderLayout.WEST);
      add(new JButton("Test.java"), BorderLayout.CENTER);
      add(new JButton("Console"), BorderLayout.SOUTH);
      
      setSize(800, 600);
      setVisible(true);
   }

   public static void main(String[] args) 
   {
      new BorderLayoutEx();
   }
}