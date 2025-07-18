package T4WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import T5_insa1.InsaDAO;
import T5_insa1.InsaVO;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

@SuppressWarnings({"rawtypes", "unused" , "unchecked"})
public class T07_JTable {

	private JFrame frame;
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	
	InsaDAO dao = new InsaDAO();

	public static void main(String[] args) {
		new T07_JTable();
	}

	public T07_JTable() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JTable 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 56);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("JTable 연습");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitle.setBounds(43, 10, 407, 36);
		pn1.add(lblTitle);
		
		JButton btnExit = new JButton("종 료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(637, 11, 114, 36);
		pn1.add(btnExit);
		
		JButton btnPrint = new JButton("선택셀의값출력");
		btnPrint.setFont(new Font("굴림", Font.BOLD, 18));
		btnPrint.setBounds(448, 10, 173, 36);
		pn1.add(btnPrint);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 56, 784, 442);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(34, 10, 720, 422);
		//pn2.add(scrollPane);
		
		// table = new JTable();
		//scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 496, 784, 65);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setEnabled(false);
		lblMessage.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 10, 784, 45);
		pn3.add(lblMessage);
		
		// ---- 아래쪽으로 JTable 설계하기 -----
		// JTable제작시는 '제목(필드명)'과 '데이터'를 설계하여 Vector 객체 타입으로 준비한다.
		
		// 1. '제목'을 Vector에 저장
		title = new Vector();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		// 2. '데이터'를 Vector로 준비... 데이터는 DB에서 가져온다.
		vData = dao.getInsaList("","");
		
		// 3. DB에서 가져온 자료(vData)와 타이틀(title)을 DefaultTableModel객체생성시 할당한다.
		dtm = new DefaultTableModel(vData, title);	// (데이터,타이틀)
		
		// 4. DefaultTableModel에 담긴 벡터타입의 '데이터/타이틀'을 JTable객체 생성시에 담아준다.
		table = new JTable(dtm);
		
		// 5. 자료가 담긴 JTable을 JScrollPane객체 생성시에 담아준다.
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(34, 10, 720, 422);
		pn2.add(scrollPane);
		
		// 6. 출결결과를 화면에 표시한다.
		frame.setVisible(true);
		
	  // ------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------

		// 테이블(JTable)에서 셀의 자료를 선택하면 해당 레코드(행)의 정보를 출력하기
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				System.out.println("선택된 행의 정보 : " + row);
				if(row != -1) {
					InsaVO vo = dao.getNameSearch(table.getValueAt(row, 1).toString());
					
					String temp = "성명 :"+vo.getName()+", 나이 :"+vo.getAge()+", 성별 :"+vo.getGender()+", 입사일 :"+vo.getIpsail().substring(0,10)+"";
					
					lblMessage.setText(temp);	
				}
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
