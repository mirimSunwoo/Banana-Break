import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
public class start extends JFrame{
	private Image background=new ImageIcon(start.class.getResource("./images/mainFrame.png")).getImage();
	
	public start() {
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
		new start();
	}
}
