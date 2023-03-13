package Homwork_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class Test2 extends JFrame {
	
	int id = 2013001;
	String inId = String.valueOf(id);
	JTextField idAnswer = new JTextField(10);
	JTextField nameAnswer = new JTextField(10);

	String typeName;
	JRadioButton[] type = new JRadioButton[3];
	String[] text = { "교수", "직원", "학생" };
	ImageIcon plusIcon = new ImageIcon("images/plusbtn.png");

	Test2() {
		setTitle("사용자 등록 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentP = new JPanel();
		contentP.setLayout(new GridLayout(3, 1));

		JPanel upperP = new JPanel();
		upperP.setLayout(new GridLayout(3, 1));

		JPanel inUpperP = new JPanel();
		inUpperP.setLayout(new GridLayout(1, 2));
		inUpperP.add(new JLabel("학번"));
		idAnswer.setEditable(false);
		idAnswer.setText(inId);
		inUpperP.add(idAnswer);
		upperP.add(inUpperP);

		JPanel inMiddleP = new JPanel();
		inMiddleP.setLayout(new GridLayout(1, 2));
		inMiddleP.add(new JLabel("타입"));
		ButtonGroup group = new ButtonGroup();
		
		for (int i = 0; i < type.length; i++) {
			type[i] = new JRadioButton(text[i]);
			group.add(type[i]);
			inMiddleP.add(type[i]);
			
			type[i].addItemListener(e -> {
				if (e.getItem() == type[0])
					typeName = "교수";
				else if (e.getItem() == type[1])
					typeName = "직원";
				else if (e.getItem() == type[2])
					typeName = "학생";
			});
		}
		upperP.add(inMiddleP);

		JPanel inLowP = new JPanel();
		inLowP.setLayout(new GridLayout(1, 2));
		inLowP.add(new JLabel("이름"));
		inLowP.add(nameAnswer);
		upperP.add(inLowP);
		contentP.add(upperP);

		Image normal = plusIcon.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		plusIcon = new ImageIcon(normal);
		
		JButton plusBtn = new JButton(plusIcon);
		plusBtn.setBorder(BorderFactory.createEmptyBorder());
		plusBtn.setContentAreaFilled(false);
		contentP.add(plusBtn);

		JTextArea ta = new JTextArea(7, 30);
		contentP.add(ta);

		plusBtn.addActionListener(e -> {
			ta.append("id: " + idAnswer.getText() + ", type: " + typeName + ", name: " + nameAnswer.getText() + "\n");
			String inId = String.valueOf(++id);
			idAnswer.setText(inId);
		});

		add(contentP);
		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}
}