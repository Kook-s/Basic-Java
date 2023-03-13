package Homwork_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class Test3 extends JFrame {
	
	int a;
	int id = 2013001;
	String inId = String.valueOf(id);
	JTextField idAnswer = new JTextField(10);
	JTextField nameAnswer = new JTextField(10);
	String typeName;
	JRadioButton[] type = new JRadioButton[3];
	String[] text = { "==선택==", "교수", "직원", "학생" };
	ImageIcon plusIcon = new ImageIcon("images/plusbtn.png");

	Test3() {
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
		JComboBox strCombo = new JComboBox(text);
		inMiddleP.add(strCombo);
		
		strCombo.addActionListener(e -> {
			a =strCombo.getSelectedIndex();
			typeName=text[a];
			
		});

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
			
			if(a==0)
				JOptionPane.showMessageDialog(null, "콤보박스를 선택하세요 ", "Message", JOptionPane.ERROR_MESSAGE);
			else if(nameAnswer.getText().equals(""))
				JOptionPane.showMessageDialog(null, "이름을 입력하세요 ", "Message", JOptionPane.ERROR_MESSAGE);		
			else {
			ta.append("id: " + idAnswer.getText() + ", type: " + typeName + ", name: " + nameAnswer.getText() + "\n");
			String inId = String.valueOf(++id);// 고친 부분
			idAnswer.setText(inId);
			}
		});

		add(contentP);
		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test3();
	}
}