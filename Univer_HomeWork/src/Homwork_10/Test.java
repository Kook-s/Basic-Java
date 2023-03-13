package Homwork_10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test extends JFrame {

	ImageIcon[] image = { new ImageIcon("images/img1.jpeg"), new ImageIcon("images/img2.jpeg"),
			new ImageIcon("images/img3.jpeg"), new ImageIcon("images/img4.png") };
	JLabel imageLabel = new JLabel();
	ImageIcon[] btnimg = { new ImageIcon("images/leftbtn.png"), new ImageIcon("images/rightbtn.png") };
	int a = 0;

	Test() {
		setTitle("좌우로 이미지 넣기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JPanel content = new JPanel();

		for (int i = 0; i < 4; i++) {
			Image normal = image[i].getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
			image[i] = new ImageIcon(normal);
		}
		for (int i = 0; i < 2; i++) {
			Image btnnormal = btnimg[i].getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
			btnimg[i] = new ImageIcon(btnnormal);
		}
		JButton leftBtn = new JButton(btnimg[0]);
		JButton rightBtn = new JButton(btnimg[1]);
		leftBtn.setBorder(BorderFactory.createEmptyBorder());
		leftBtn.setContentAreaFilled(false);
		rightBtn.setBorder(BorderFactory.createEmptyBorder());
		rightBtn.setContentAreaFilled(false);
		
		JPanel btnArea = new JPanel();
		btnArea.setLayout(new GridLayout(1, 2));
		btnArea.add(leftBtn);
		btnArea.add(rightBtn);

		leftBtn.addActionListener(e -> {
			if(a<0)a=3;
			imageLabel.setIcon(image[a]);
			a--;
		});

		rightBtn.addActionListener(e -> {
		if(a>3)a=0;
			imageLabel.setIcon(image[a]);
			a++;
		});
		leftBtn.setSelected(false);
		rightBtn.setSelected(false);
		add(btnArea, BorderLayout.SOUTH);
		add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test();
	}
}