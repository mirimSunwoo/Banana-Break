import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
public class start extends JFrame{
	private Image background=new ImageIcon(start.class.getResource("./images/mainFrame.png")).getImage();
	
	public start() {
		homeframe();
	}
	public void homeframe() {
		setTitle("Banana Break");//타이틀
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(721, 540);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//창을 끄면 프로그램을 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);
	}
	public static void main(String[] args) {
		new start();
	}
}
