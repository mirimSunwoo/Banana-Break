import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import timer.Timer;
public class main_game extends JFrame{
	static ImageIcon icon;
	
	public static void main(String args[]) {
		icon = new ImageIcon("./images/back_log.png");
		JFrame frm = new JFrame("Banana Break ����ȭ��");
		
		Timer t = new Timer();
		JTextField tf = new JTextField();
		frm.setSize(721, 540);	//������� 640*480
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		 // ���̾ƿ� ����
		frm.getContentPane().setLayout(null);
		
		
		TextField banjuk = new TextField("");
        // �� ��ư ����
        JButton btn1 = new JButton("�����߰�");
        JButton btn2 = new JButton("�ٳ����ֱ�");
        JButton btn3 = new JButton("���");
 
        
        btn1.setBounds(30,30, 122, 30);
        btn2.setBounds(30, 100, 122, 30);
        btn3.setBounds(500,30, 122, 30);
        // �� �����ӿ��ٰ� ��ư �߰�
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        frm.getContentPane().add(btn3);
        frm.getContentPane().add(banjuk);
 
        // �������� ���̵��� ����
        frm.setVisible(true);
       
	}
}
