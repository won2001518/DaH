package T3_swing1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T02_Radio2 extends JFrame {
	
	public T02_Radio2() {
		super("스윙연습(라디오버튼)");
		designView();
	}
	
	private void designView() {
		setSize(400, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new GridLayout(4, 1));
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		
		pn1.setBackground(Color.BLUE);
		pn2.setBackground(Color.YELLOW);
		pn3.setBackground(Color.CYAN);
		pn4.setBackground(Color.GREEN);
		
		JLabel lbl = new JLabel();
		lbl.setText("스윙연습하기");
		pn1.add(lbl);
		
		//테크박스, 
		Checkbox chkHobby1 = new Checkbox("등산");
		Checkbox chkHobby2 = new Checkbox("낚씨");
		Checkbox chkHobby3 = new Checkbox("수영");
		Checkbox chkHobby4 = new Checkbox("바둑");
		Checkbox chkHobby5 = new Checkbox("기타");
		
		pn2.add(chkHobby1);
		pn2.add(chkHobby2);
		pn2.add(chkHobby3);
		pn2.add(chkHobby4);
		pn2.add(chkHobby5);
		
		//라디오버튼
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox chkMale = new Checkbox("Male", gender, false);
		Checkbox chkFeMale = new Checkbox("FeMele",gender, true);
		
		pn3.add(chkMale);
		pn3.add(chkFeMale);
		
		
		JButton btnExit = new JButton("종료");
		pn4.add(btnExit);
		
		add(pn1);
		add(pn2);		
		add(pn3);		
		add(pn4);		
		
		setVisible(true);
		
	// ------------------- 위쪽은 사용자 인터페이스구현(UI) , 아래쪽은 method(동작) 처리 -----------------

		
		// 종료버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		
	}

	public static void main(String[] args) {
		new T02_Radio2();
	}
}
