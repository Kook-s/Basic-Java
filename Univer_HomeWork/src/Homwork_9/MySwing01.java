package Homwork_9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MySwing01 extends JFrame {

	MySwing01() {
		setTitle("Multiple Layouut Ezample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentP = new JPanel();
		contentP.setLayout(new BorderLayout());
		setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		JPanel westP = new JPanel();
		westP.setLayout(new GridLayout(4, 1));
		westP.setBackground(Color.YELLOW);
		westP.add(new JLabel("Type ID", SwingConstants.CENTER));
		westP.add(new JTextField(""));
		westP.add(new JLabel("Type Password", SwingConstants.CENTER));
		westP.add(new JTextField(""));	
		contentP.add(westP, BorderLayout.WEST);
		
		JPanel eastP = new JPanel();
		eastP.setLayout(new GridLayout(3, 1,0,10));
		eastP.setBackground(Color.GREEN);
		eastP.add(new JLabel("Please check!!", SwingConstants.CENTER));
		eastP.add(new JLabel("C# JCheckBox", SwingConstants.CENTER));
		eastP.add(new JLabel("C++ JCheckBox", SwingConstants.CENTER));		
		contentP.add(eastP, BorderLayout.EAST);

		JPanel lowerP = new JPanel();
		JButton okB = new JButton("OK");
		okB.setPreferredSize(new Dimension(100, 30));
		lowerP.add(okB, SwingConstants.CENTER);
		contentP.add(lowerP, BorderLayout.SOUTH);
		add(contentP);
		setSize(200, 180);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MySwing01();
	}

}
