import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextArea;

public class main_game extends JFrame {
	private Image main_background = new ImageIcon(main_game.class.getResource("./images/back_main.png")).getImage();
	private JPanel mainPane;

	private void homeframe() {
		setTitle("Test Break");//타이틀
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(720, 544);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void paint(Graphics g) {
		g.drawImage(main_background, 0, 0, null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_game frame = new main_game();
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
	public main_game() {
		homeframe();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 544);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JButton btnNewButton = new JButton("반죽추가");
		btnNewButton.setBounds(140, 71, 108, 32);
		mainPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빵주기");
		btnNewButton_1.setBounds(140, 25, 107, 33);
		mainPane.add(btnNewButton_1);
		
		Panel panel = new Panel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 26, 113, 32);
		mainPane.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 71, 113, 32);
		mainPane.add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(521, 25, 169, 32);
		mainPane.add(panel_2);
	}
}
