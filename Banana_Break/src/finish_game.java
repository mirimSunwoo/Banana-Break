import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class finish_game extends JFrame {
	private Image finish_background = new ImageIcon(main_game.class.getResource("./images/back_log.png")).getImage();
	private JPanel finishPane;

	private void homeframe() {
		setTitle("Test Break");//Ÿ��Ʋ
		setVisible(true);	//â�� ���� ���̵��� ��
		setSize(720, 544);	//������� 640*480
		setResizable(false);	//������ ������ �Ұ���
		setLocationRelativeTo(null);	//â�� ����� �ߵ��� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	public void paint(Graphics g) {
		g.drawImage(finish_background, 0, 0, null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finish_game frame = new finish_game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public finish_game() {
		homeframe();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 544);
		finishPane = new JPanel();
		finishPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(finishPane);
		finishPane.setLayout(null);
		
		JButton btnNewButton = new JButton("�����̵�� ���� ���");
		btnNewButton.setBounds(402, 200, 231, 48);
		finishPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("������ ������ ���ư���");
		btnNewButton_1.setBounds(85, 200, 231, 48);
		finishPane.add(btnNewButton_1);
		
		
	}

}
