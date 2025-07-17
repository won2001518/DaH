package T4WindowBuilder1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class T02_Ratio_Checkbox {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		new T02_Ratio_Checkbox();

	}

	public T02_Ratio_Checkbox() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("라디오/체크박스 연습");

		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel pa1 = new JPanel();
		pa1.setBackground(Color.CYAN);
		pa1.setBounds(0, 0, 784, 64);
		frame.getContentPane().add(pa1);
		pa1.setLayout(null);

		JLabel lblC = new JLabel("라디오버튼/체크받스 연습");
		lblC.setFont(new Font("굴림", Font.BOLD, 19));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(0, 0, 784, 64);
		pa1.add(lblC);

		JPanel pa2 = new JPanel();
		pa2.setBounds(0, 63, 784, 436);
		frame.getContentPane().add(pa2);
		pa2.setLayout(null);

		JLabel lblGebter = new JLabel("성 별");
		lblGebter.setFont(new Font("굴림", Font.PLAIN, 16));
		lblGebter.setHorizontalAlignment(SwingConstants.CENTER);
		lblGebter.setBounds(31, 40, 89, 38);
		pa2.add(lblGebter);

		JLabel lblHobby = new JLabel("취 미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		lblHobby.setBounds(35, 123, 89, 38);
		pa2.add(lblHobby);

		JRadioButton rdMale = new JRadioButton("남자");
		buttonGroup.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 20));
		rdMale.setBounds(242, 39, 89, 38);
		pa2.add(rdMale);

		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setSelected(true);
		buttonGroup.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 20));
		rdFemale.setBounds(455, 39, 89, 38);
		pa2.add(rdFemale);

		JCheckBox chHobby1 = new JCheckBox("등산");
		chHobby1.setFont(new Font("굴림", Font.PLAIN, 20));
		chHobby1.setBounds(159, 125, 89, 33);
		pa2.add(chHobby1);

		JCheckBox chHobby2 = new JCheckBox("낚시");
		chHobby2.setFont(new Font("굴림", Font.PLAIN, 20));
		chHobby2.setBounds(283, 125, 89, 33);
		pa2.add(chHobby2);

		JCheckBox chHobby3 = new JCheckBox("수영");
		chHobby3.setFont(new Font("굴림", Font.PLAIN, 20));
		chHobby3.setBounds(407, 125, 89, 33);
		pa2.add(chHobby3);

		JCheckBox chHobby4 = new JCheckBox("바둑");
		chHobby4.setFont(new Font("굴림", Font.PLAIN, 20));
		chHobby4.setBounds(531, 125, 89, 33);
		pa2.add(chHobby4);

		JCheckBox chHobby5 = new JCheckBox("바이크");
		chHobby5.setFont(new Font("굴림", Font.PLAIN, 20));
		chHobby5.setBounds(655, 125, 89, 33);
		pa2.add(chHobby5);

		JLabel lblMessge = new JLabel("메세지 출력");
		lblMessge.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessge.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMessge.setBounds(31, 249, 715, 111);
		pa2.add(lblMessge);

		JPanel pa3 = new JPanel();
		pa3.setBackground(Color.ORANGE);
		pa3.setBounds(0, 497, 784, 64);
		frame.getContentPane().add(pa3);
		pa3.setLayout(null);

		JButton btngenter = new JButton("성별출력");
		btngenter.setBounds(71, 24, 166, 30);
		pa3.add(btngenter);

		JButton btnHobby = new JButton("취미");
		
		btnHobby.setBounds(308, 24, 166, 30);
		pa3.add(btnHobby);

		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 12));
		btnExit.setBounds(545, 24, 166, 30);
		pa3.add(btnExit);

		frame.setVisible(true);

		// -----------------------------------위 디자인, 아래메소드--------------------------------------------------------
		//취미 출력버튼 클릭시 수행
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(chHobby1.isSelected()) hobby += chHobby1.getText() + "/";
				if(chHobby2.isSelected()) hobby += chHobby2.getText() + "/";
				if(chHobby3.isSelected()) hobby += chHobby3.getText() + "/";
				if(chHobby4.isSelected()) hobby += chHobby4.getText() + "/";
				if(chHobby5.isSelected()) hobby += chHobby5.getText() + "/";
			
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessge.setText(hobby);
			}
		});
		
		
		
		
		
		
		// 성별 출력버튼 클릭시 수행
		btngenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택한 성별은";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
					
				lblMessge.setText(gender);
			}
		});
		
		
		
		// 종료 버튼을 마우스로 클릭시 수행

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료합니까?", "작업종료", JOptionPane.YES_NO_CANCEL_OPTION);
				if (ans == 0)
					System.exit(0);
			}
		});

	}
}
