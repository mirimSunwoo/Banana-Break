import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
public class main_activity extends JFrame{
	private Image background=new ImageIcon(main_activity.class.getResource("./images/mainFrame.png")).getImage();
	
	public main_activity() {
		homeframe();
	}
	public void homeframe() {
		setTitle("Banana Break");//Ÿ��Ʋ
		setVisible(true);	//â�� ���� ���̵��� ��
		setSize(721, 540);	//������� 640*480
		setResizable(false);	//������ ������ �Ұ���
		setLocationRelativeTo(null);	//â�� ����� �ߵ��� ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//â�� ���� ���α׷��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	public void paint(Graphics g) {//�׸��� �Լ�
		g.drawImage(background, 0, 0, null);
	}
	public static void main(String[] args) {
		new main_activity();
	}
}
