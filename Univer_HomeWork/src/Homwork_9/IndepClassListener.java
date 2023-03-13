package Homwork_9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IndepClassListener extends JFrame {

	JButton hannam = new JButton("Hannam");
	JButton university = new JButton("University");
	JButton student = new JButton("Student");
	JLabel text = new JLabel("Press button", SwingConstants.CENTER);

	IndepClassListener() {
		setTitle("버튼 눌러 텍스트 보여주기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentP = new JPanel();
		contentP.setLayout(new GridLayout(2, 1));

		JPanel contentP2 = new JPanel();		
		contentP2.setLayout(new GridLayout(1, 3,-5,0));
		contentP2.setPreferredSize(new Dimension(300, 100));
		contentP2.add(hannam);
		contentP2.add(university);
		contentP2.add(student);
		contentP.add(contentP2);
		contentP.add(text);
		
		hannam.addActionListener(e -> {
			text.setText("Hannam");
		});

		university.addActionListener(e -> {
			text.setText("University");
		});

		student.addActionListener(e -> {
			text.setText("Student");
		});
		
		add(contentP);
		setSize(300, 190);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}
