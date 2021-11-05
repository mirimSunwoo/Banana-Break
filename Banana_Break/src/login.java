import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.*;

public class login extends JFrame{
	Image img = null;
	public login(){
		setTitle("Banana Break");
		JPanel p = new JPanel();
		p.setLayout(null);
		Label id = new Label("아이디 : ");
		add(id);
		Label pw = new Label("비밀번호 : ");
		add(pw);
		TextField t_id = new TextField();
		add(t_id);
		TextField t_pw = new TextField();
		add(t_pw);
		t_pw.setEchoChar('*');
		JButton btn_id = new JButton("로그인");
		add(btn_id);
		JButton btn_pw = new JButton("회원가입");
		add(btn_pw);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String []args) {
		
	}
}
