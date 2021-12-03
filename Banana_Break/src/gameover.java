import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class gameover extends JFrame {
	private Image gameover_background = new ImageIcon(main_game.class.getResource("./images/gameover.png")).getImage();

	private JPanel contentPane;

	private void homeframe() {
		setTitle("Test Break");//타이틀
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(720, 544);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void paint(Graphics g) {
		g.drawImage(gameover_background, 0, 0, null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameover frame = new gameover();
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
	public gameover() {
		homeframe();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
