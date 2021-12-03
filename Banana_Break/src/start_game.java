import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;

public class start_game extends JFrame {
	private Image background=new ImageIcon(start_game.class.getResource("./images/mainFrame.png")).getImage();
	private JPanel contentPane;
	
	public void homeframe() {
		setTitle("Banana Break");//타이틀
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(721, 540);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start_game frame = new start_game();
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
	public start_game() {
		homeframe();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("게임 시작하기");
		btnNewButton.setBounds(176, 306, 149, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("게임 설명서");
		btnNewButton_1.setBounds(377, 306, 149, 32);
		contentPane.add(btnNewButton_1);
	}
}
