package T2__AWT1.copy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T05_GridlLayout extends Frame implements WindowListener, ActionListener {

	public T05_GridlLayout() {
		designview();
	}

	private void designview() {
		setTitle("AWT 프레임(GridLayout)");
		setLayout(new GridLayout(2,3));
		setBounds(340, 350, 400, 350);

		Button btn1 = new Button("북쪽");
		Button btn2 = new Button("남쪽");
		Button btn3 = new Button("서쪽");
		Button btn4 = new Button("동쪽");
		Button btnExit = new Button("가운데(종료)");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
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
		new T05_GridlLayout();
	}
}
