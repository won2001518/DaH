package T5_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class InsaMain {

	private JFrame frame;

	public static void main(String[] args) {
		new InsaMain();
	}

	public InsaMain() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("파일 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 83);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("인사관리프로그램(v1.0)");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 28));
		lblTitle.setBounds(0, 0, 784, 83);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 85, 784, 390);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(InsaMain.class.getResource("/T4WindowBuilder1/Imsges/다운로드 (1).jpg")));
		lblLogo.setBounds(0, 0, 784, 390);
		pn2.add(lblLogo);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 478, 784, 83);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnInput = new JButton("사원등록");
		btnInput.setFont(new Font("굴림", Font.BOLD, 20));
		btnInput.setBounds(20, 10, 171, 63);
		pn3.add(btnInput);
		
		JButton btnSearch = new JButton("개별조회");
		btnSearch.setFont(new Font("굴림", Font.BOLD, 20));
		btnSearch.setBounds(211, 10, 171, 63);
		pn3.add(btnSearch);
		
		JButton btnList = new JButton("전체조회");
		btnList.setFont(new Font("굴림", Font.BOLD, 20));
		btnList.setBounds(402, 10, 171, 63);
		pn3.add(btnList);
		
		JButton btnExit = new JButton("종  료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(593, 10, 171, 63);
		pn3.add(btnExit);
		
		frame.setVisible(true);
		
// ------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------

		
		// 회원 개별 조회버튼을 마우스 클릭 실행
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("검색할 성명을 입력하세요");
				InsaDAO dao = new InsaDAO();
				InsaVO vo = dao.getNameSearch(name);
				
				if(vo.getName() == null) JOptionPane.showMessageDialog(frame, "검색한 회원이 없습니다.");
				else {
					frame.dispose();
//					System.out.println("vo(m) : " + vo);
					new InsaSearch(vo);
//	
				}
			}
		});
		
		// 사원등록 폼 호출
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new InsaInput();
			}
		});
		
		// 종료버튼을 마우스로 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
//				if(ans == 0) System.exit(0);
				System.exit(0);
			}
		});
		
	}
}
