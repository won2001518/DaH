package T6ex_Kiosk1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class KioskMenuInput {
	private KioskDAO dao = new KioskDAO();
	private KioskVO vo = null;
	private int res = 0;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
		new KioskMenuInput();
	}

	public KioskMenuInput() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("버거킹");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 58);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("버거킹 메뉴 등록 화면");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(119, 0, 665, 58);
		pn1.add(lblNewLabel);

		JPanel pn1_1 = new JPanel();
		pn1_1.setLayout(null);
		pn1_1.setBounds(0, 56, 784, 448);
		frame.getContentPane().add(pn1_1);

		JLabel lbl = new JLabel("상품분류");
		lbl.setFont(new Font("굴림", Font.BOLD, 18));
		lbl.setBounds(23, 28, 108, 31);
		pn1_1.add(lbl);

		JLabel lbl_1 = new JLabel("상품명");
		lbl_1.setFont(new Font("굴림", Font.BOLD, 18));
		lbl_1.setBounds(23, 82, 108, 31);
		pn1_1.add(lbl_1);

		JLabel lbl_2 = new JLabel("간단설명");
		lbl_2.setFont(new Font("굴림", Font.BOLD, 18));
		lbl_2.setBounds(23, 134, 108, 31);
		pn1_1.add(lbl_2);

		JLabel lbl_2_1 = new JLabel("상세설명");
		lbl_2_1.setFont(new Font("굴림", Font.BOLD, 18));
		lbl_2_1.setBounds(23, 189, 108, 31);
		pn1_1.add(lbl_2_1);

		JLabel lblkcal = new JLabel("칼로리(kcal)");
		lblkcal.setFont(new Font("굴림", Font.BOLD, 18));
		lblkcal.setBounds(23, 273, 108, 31);
		pn1_1.add(lblkcal);

		JLabel lbl_4 = new JLabel("상품이미지");
		lbl_4.setFont(new Font("굴림", Font.BOLD, 18));
		lbl_4.setBounds(23, 391, 108, 31);
		pn1_1.add(lbl_4);

		JLabel lbl_5 = new JLabel("상품가격");
		lbl_5.setFont(new Font("굴림", Font.BOLD, 18));
		lbl_5.setBounds(23, 332, 108, 31);
		pn1_1.add(lbl_5);

		JComboBox cbPart = new JComboBox();
		cbPart.setModel(new DefaultComboBoxModel(new String[] { "버거세트", "버거", "사이드" }));
		cbPart.setFont(new Font("굴림", Font.PLAIN, 17));
		cbPart.setBounds(158, 28, 316, 31);
		pn1_1.add(cbPart);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(158, 82, 316, 31);
		pn1_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(158, 134, 316, 31);
		pn1_1.add(textField_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 187, 316, 61);
		pn1_1.add(scrollPane);

		JTextArea txtrF = new JTextArea();
		txtrF.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrollPane.setViewportView(txtrF);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(158, 273, 316, 31);
		pn1_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(158, 332, 316, 31);
		pn1_1.add(textField_3);

		JButton btnNewButton = new JButton("이미지등록");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(158, 391, 316, 31);
		pn1_1.add(btnNewButton);

		JLabel lblImage = new JLabel("상품 이미지가 표시됩니다.");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(null);
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.LIGHT_GRAY);
		lblImage.setBounds(511, 174, 245, 245);
		pn1_1.add(lblImage);

		JPanel pn1_2 = new JPanel();
		pn1_2.setBounds(0, 503, 784, 58);
		frame.getContentPane().add(pn1_2);
		pn1_2.setLayout(null);

		JButton btnInput = new JButton("메뉴등록");
		btnInput.setFont(new Font("굴림", Font.BOLD, 17));
		btnInput.setBounds(21, 10, 183, 38);
		pn1_2.add(btnInput);

		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(300, 10, 183, 38);
		pn1_2.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("뒤로가기");
		btnNewButton_1_2.setFont(new Font("굴림", Font.BOLD, 17));
		btnNewButton_1_2.setBounds(589, 13, 183, 35);
		pn1_2.add(btnNewButton_1_2);

		frame.setVisible(true);

//------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------
		
		// 상품 등록버튼 입력처리
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String part = cbPart.getSelectedItem().toString();
				String product = textField.getText().trim();
				String detail = textField_1.getText().trim();
				String content = txtrF.getText().trim();
				String calorie = textField_2.getText().trim();
				String price = textField_3.getText().trim();
				String image = lblImage.getText();

				
				// 검사
				if (product.equals("")) {
					JOptionPane.showMessageDialog(frame, "상품명을 입력해주세요");
					textField.requestFocus();
				} else if (detail.equals("")) {
					JOptionPane.showMessageDialog(frame, "간단한 설명을 입력해주세요");
				} else if (!Pattern.matches("^[0-9]+$", calorie)) {
					JOptionPane.showMessageDialog(frame, "칼로리를 입력해주세요");
					textField_2.requestFocus();
					JOptionPane.showMessageDialog(frame, "가격을 입력해주세요");
				} else if (!Pattern.matches("^[0-9]+$", price)) {
					textField_3.requestFocus();
				}else if (image == null || image.equals("")) {
            JOptionPane.showMessageDialog(frame, "상품 이미지를 등록해주세요");
				}
				else {
					System.out.println("통과 - 처음");
					// 메뉴 중복처리
					vo = dao.getNamesearch(product);
					if (vo.getProduct() != null) {
						JOptionPane.showInternalMessageDialog(frame, "이미 등록된 상품입니다.");
					}
					else {
						// 중복처리
						vo = new KioskVO();
						vo.setPart(part);
						vo.setProduct(product);
						vo.setDetail(detail);
						vo.setCalorie(Integer.parseInt(calorie));
						vo.setImage(image);
						vo.setPrice(Integer.parseInt(price));
						System.out.println("통과11");
						res = dao.setKioskInput(vo);
						System.out.println("통과22");
						
						if(res != 0) {
							JOptionPane.showMessageDialog(null, product + " 상품이 등록되었습니다.");
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							lblImage.setText(null);
						}
						else {
							JOptionPane.showMessageDialog(null, "상품 등록 실패~~ 다시 등록해 주세요.");
//							txtProduct.requestFocus();
						}

					}
				}
			}
		});
		// 이미지 등록
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser im = new JFileChooser();

				FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png");
				im.setFileFilter(fil);

				int res = im.showOpenDialog(null);

				if (res != im.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요", "", JOptionPane.WARNING_MESSAGE);
				} else {
					String filePath = im.getSelectedFile().getPath();
					String fileName = im.getSelectedFile().getPath();
					lblImage.setIcon(new ImageIcon(filePath));

				}
			}
		});

		// 메인메뉴 등록하기 마우스클릭시 수행
//		btnMenuInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new KioskMenuInput();
//			}
//		});

		// 메인화면으로 돌아가기
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMain();
			}
		});

	}
}
