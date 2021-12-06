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
		setTitle("Test Break");//타이틀
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(720, 544);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
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
		
		JButton btnNewButton = new JButton("원숭이들과 같이 살기");
		btnNewButton.setBounds(402, 200, 231, 48);
		finishPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("본래의 삶으로 돌아가기");
		btnNewButton_1.setBounds(85, 200, 231, 48);
		finishPane.add(btnNewButton_1);
		
		
	}

}
