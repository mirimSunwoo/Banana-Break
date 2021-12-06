import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.Font;


public class Game extends JFrame{

	private Image startBack = new ImageIcon(main_game.class.getResource("./images/mainFrame.png")).getImage();

	public void paint(Graphics g) {
		g.drawImage(startBack, 0, 0, null);
	}
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public Game() {
		super();
		initialize();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel startPane = new JPanel();
		startPane.setBounds(0, 0, 705, 505);
		startPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(startPane);
		startPane.setLayout(null);
		
		JButton btnStart = new JButton("���� �����ϱ�");
		btnStart.setBounds(176, 306, 149, 32);
		startPane.add(btnStart);
		
		JButton btnExplan = new JButton("���� ������");
		btnExplan.setBounds(377, 306, 149, 32);
		startPane.add(btnExplan);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 705, 505);
		lblNewLabel.setIcon(new ImageIcon(Game.class.getResource("/images/mainFrame.png")));
		startPane.add(lblNewLabel);
		
		
		JPanel mainPane = new JPanel();
		mainPane.setBounds(0, 0, 705, 505);
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(mainPane);
		mainPane.setLayout(null);
		
		JButton btnAdd = new JButton("�����߰�");
		btnAdd.setBounds(140, 71, 108, 32);
		mainPane.add(btnAdd);
		
		JButton btnGive = new JButton("���ֱ�");
		btnGive.setBounds(140, 25, 107, 33);
		mainPane.add(btnGive);
		
		Panel panel = new Panel();
		panel.setBounds(10, 26, 113, 32);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		mainPane.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(10, 71, 113, 32);
		panel_1.setBackground(Color.WHITE);
		mainPane.add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(521, 25, 169, 32);
		panel_2.setBackground(Color.WHITE);
		mainPane.add(panel_2);
		
		JLabel timerLabel = new JLabel("00:01:00");
		timerLabel.setFont(new Font("����", Font.BOLD, 16));
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setBounds(0, 16, 705, 45);
		mainPane.add(timerLabel);
		
		Timer timer = new Timer(1000, new ActionListener() {
			int timeSec = 60;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(timeSec == 60) {
					timerLabel.setText("00:01:00");
					timeSec--;
				}else {
					timerLabel.setText("00:00:" + timeSec--);
				}
				if(timeSec == -1) System.exit(0);
			}
		});
		
		timer.start();
		
		JButton btnHomeBack = new JButton("���� ������");
		btnHomeBack.setBounds(522, 66, 171, 32);
		mainPane.add(btnHomeBack);
		
		JButton btnGameClear = new JButton("\uAC8C\uC784 \uD074\uB9AC\uC5B4");
		btnGameClear.setBounds(522, 105, 171, 32);
		mainPane.add(btnGameClear);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Game.class.getResource("/images/back_main.png")));
		lblNewLabel_1.setBounds(0, 0, 705, 505);
		mainPane.add(lblNewLabel_1);
		
		JPanel finishPane = new JPanel();
		finishPane.setBounds(0, 1, 705, 503);
		finishPane.setLayout(null);
		finishPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(finishPane);
		
		JButton btnFinishWith = new JButton("�����̵�� ���� ���");
		btnFinishWith.setBounds(402, 200, 231, 48);
		finishPane.add(btnFinishWith);
		
		JButton btnFinishBack = new JButton("������ ������ ���ư���");
		btnFinishBack.setBounds(85, 200, 231, 48);
		finishPane.add(btnFinishBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Game.class.getResource("/images/back_log.png")));
		lblNewLabel_2.setBounds(0, 0, 705, 503);
		finishPane.add(lblNewLabel_2);
		
		JPanel gameoverPane = new JPanel();
		gameoverPane.setBounds(-50, -32, 800, 581);
		frame.getContentPane().add(gameoverPane);
		gameoverPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		gameoverPane.add(lblNewLabel_3);
		lblNewLabel_3.setBounds(40, 5, 720, 544);
		lblNewLabel_3.setIcon(new ImageIcon(Game.class.getResource("/images/gameover.png")));
		
		JButton btngameoverBack = new JButton("���ư���");
		btngameoverBack.setBounds(321, 40, 144, 23);
		gameoverPane.add(btngameoverBack);
		
		finishPane.setVisible(false);
		mainPane.setVisible(false);
		gameoverPane.setVisible(false);

		//���� �����ϴ� ȭ��
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				startPane.setVisible(false);
				gameoverPane.setVisible(false);
				finishPane.setVisible(false);
			}
			
		});
		//����ȭ�鿡�� �������� ���ư���
		btnHomeBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPane.setVisible(false);
				startPane.setVisible(true);
				gameoverPane.setVisible(false);
				finishPane.setVisible(false);
			}
			
		});
		//���� ��������
		btnGameClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPane.setVisible(false);
				finishPane.setVisible(true);
				gameoverPane.setVisible(false);
				startPane.setVisible(false);
			}
			
		});
		//���� ������ �ΰ��� �� �� ����
		btnFinishWith.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				finishPane.setVisible(false);
				gameoverPane.setVisible(true);
				startPane.setVisible(false);
				mainPane.setVisible(false);
			}
			
		});
		btnFinishBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				finishPane.setVisible(false);
				gameoverPane.setVisible(true);
				startPane.setVisible(false);
				mainPane.setVisible(false);
			}
			
		});
		btngameoverBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				finishPane.setVisible(true);
				gameoverPane.setVisible(false);
				startPane.setVisible(false);
				mainPane.setVisible(false);
			}
			
		});
	}
}