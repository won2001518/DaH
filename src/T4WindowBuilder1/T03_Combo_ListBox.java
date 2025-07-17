package T4WindowBuilder1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class T03_Combo_ListBox {

	private JFrame frame;

	public static void main(String[] args) {
		new T03_Combo_ListBox();
	}

	public T03_Combo_ListBox() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 392, 384);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("직업을 선택하세요");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitle.setBounds(27, 20, 332, 48);
		pn1.add(lblTitle);
		
		JComboBox comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "의사", "변호사", "회계사", "군인", "회사원", "공무원", "간호사", "자영업", "기타"}));
		comboJob.setFont(new Font("굴림", Font.BOLD, 19));
		comboJob.setBounds(12, 80, 347, 31);
		pn1.add(comboJob);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(392, 0, 392, 384);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 122, 336, 149);
		pn2.add(scrollPane);
		
		JList listJob = new JList();
		listJob.setFont(new Font("굴림", Font.BOLD, 18));
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "군인", "회사원", "공무원", "간호사", "자영업", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 382, 784, 93);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnCombo = new JButton("콤보출력");
		btnCombo.setFont(new Font("굴림", Font.BOLD, 20));
		btnCombo.setBounds(54, 27, 120, 40);
		pn3.add(btnCombo);
		
		JButton btnList = new JButton("리스트출력");
		btnList.setFont(new Font("굴림", Font.BOLD, 20));
		btnList.setBounds(228, 27, 135, 40);
		pn3.add(btnList);
		
		JButton btnMessage = new JButton("메세지출력");
		btnMessage.setFont(new Font("굴림", Font.BOLD, 20));
		btnMessage.setBounds(417, 27, 135, 40);
		pn3.add(btnMessage);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(606, 27, 120, 40);
		pn3.add(btnExit);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(0, 474, 784, 87);
		frame.getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JLabel lblMessage = new JLabel("메세지가 출력됩니다.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 22));
		lblMessage.setBounds(225, 29, 332, 48);
		pn4.add(lblMessage);
		
		
		frame.setVisible(true);
		
	// ------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------

	  // 직업 리스트박스를 선택할때 수행
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				//Object[] jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job : jobs) msg += job + "/";
				msg = msg.substring(0, msg.length()-1);
				
				lblMessage.setText(msg);
			}
		});
		
		// 직업 콤보박스를 선택할때 수행
		comboJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
			}
		});
		
		
		// 종료버튼을 마우스로 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
	}
}
