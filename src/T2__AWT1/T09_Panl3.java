package T2__AWT1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T09_Panl3 extends Frame implements WindowListener, ActionListener {

	public T09_Panl3() {
		designview();
	}

	private void designview() {
		setTitle("AWT 프레임(GridLayout/panel)");
		setLayout(new GridLayout(1,3));
		setBounds(340, 350, 400, 350);

		Panel pn1 = new Panel();
		Panel pn2 = new Panel(new GridLayout(3,1));
		Panel pn3 = new Panel();
		Panel pn4 = new Panel();
		Panel pn5 = new Panel();
		Panel pn6 = new Panel();
		
		pn1.setBackground(Color.RED);
		pn3.setBackground(Color.LIGHT_GRAY);
		pn4.setBackground(Color.BLUE);
		pn5.setBackground(Color.GRAY);
		pn6.setBackground(Color.GREEN);
		
		Label lbl1 = new Label();
		Label lbl2 = new Label();
		Label lbl3 = new Label();
		
		Button bnt1 = new Button("btn1");
		Button bnt2 = new Button("btn2");
		
		lbl1.setText("첫번째 패널입니다.");
		lbl2.setText("두번째 패널입니다.");
		lbl3.setText("세번째 패널입니다.");
	
		
		pn1.add(bnt1);
		pn2.add(pn4);
		pn2.add(pn5);
		pn2.add(pn6);
		pn3.add(bnt2);
		pn4.add(lbl1);
		pn5.add(lbl2);
		pn6.add(lbl3);
		
		add(pn1);
		add(pn2);
		add(pn3);
		
		

		
		
		addWindowListener(this);

		setVisible(true);
	}

// ------------------- 위쪽은 사용자 인터페이스구현(UI) , 아래쪽은 method(동작) 처리 -----------------
	@Override
	public void actionPerformed(ActionEvent e) {
//		Button btnText = (Button) e.getSource();
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args) {
		new T09_Panl3();
	}
}
