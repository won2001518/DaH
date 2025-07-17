package T4WindowBuilder1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class T01_Basic {

	private JFrame frame;
	private JTextField txtMid;
	private JTextField txtName;
	private JTextField txtAge;
	private JPasswordField txtPwd;

	public static void main(String[] args) {
		new T01_Basic();
		} 
					

	public T01_Basic() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
//		frame.setBounds(100, 100, 800, 600);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림", Font.BOLD, 16));
		btnReset.setBounds(292, 511, 200, 40);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 16));
		btnExit.setBounds(538, 511, 200, 40);
		frame.getContentPane().add(btnExit);
		
		JButton btnInput = new JButton("회원가입");
		btnInput.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput.setBounds(46, 511, 200, 40);
		frame.getContentPane().add(btnInput);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD, 20));
		txtMid.setBounds(308, 41, 385, 47);
		frame.getContentPane().add(txtMid);
		txtMid.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 35, 253, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(46, 125, 253, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("성명");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(46, 210, 253, 59);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("나이");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(46, 308, 253, 59);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBounds(308, 216, 385, 47);
		frame.getContentPane().add(txtName);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("굴림", Font.BOLD, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(308, 314, 385, 47);
		frame.getContentPane().add(txtAge);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(308, 133, 385, 47);
		frame.getContentPane().add(txtPwd);
		
		JLabel lblNewLabel_3_1 = new JLabel("자기소개");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(46, 395, 253, 59);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(308, 395, 390, 103);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtAcontent = new JTextArea();
		scrollPane.setViewportView(txtAcontent);
		
		frame.setVisible(true);
		
		
		//----------------------------- 윈쪽은 디자인, 아래쪽은 메소드--------------------------------------------------------------------------------------------------
			//종료 버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		
			//회원가입 버튼 쿨릭시 수행
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = txtMid.getText();
				String pwd = txtPwd.getText();
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				String content = txtAcontent.getText();
				
				if(mid.trim().equals("") || pwd.trim().equals("")|| name.trim().equals("") ) {
					System.out.println("asdfasdfasdf");
					JOptionPane.showMessageDialog(null, "아이디는 필수 입력입니다", "회원가입창",JOptionPane.WARNING_MESSAGE);
					txtMid.requestFocus();
				}
				else if(pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호필수 입력입니다", "회원가입창",JOptionPane.WARNING_MESSAGE);
					txtPwd.requestFocus();
				}
				else if(name.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명은 필수 입력입니다", "회원가입창",JOptionPane.WARNING_MESSAGE);
					txtName.requestFocus();
				}
				else {
					JOptionPane.showMessageDialog(null, "회원 가입합니다", "회원가입",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}
}
