import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		JButton btnExplan = new JButton("���� ����");
		btnExplan.setBounds(377, 306, 149, 32);
		startPane.add(btnExplan);
		
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
		
		JButton btnHomeBack = new JButton("���� ������");
		btnHomeBack.setBounds(522, 66, 171, 32);
		mainPane.add(btnHomeBack);
		
		JButton btnGameClear = new JButton("\uAC8C\uC784 \uD074\uB9AC\uC5B4");
		btnGameClear.setBounds(522, 105, 171, 32);
		mainPane.add(btnGameClear);
		
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
		
		JPanel gameoverPane = new JPanel();
		gameoverPane.setBounds(0, 0, 705, 505);
		frame.getContentPane().add(gameoverPane);
		
		JButton btngameoverBack = new JButton("���ư��� �׽�Ʈ");
		gameoverPane.add(btngameoverBack);
		
		finishPane.setVisible(false);
		mainPane.setVisible(false);
		//���� �����ϴ� ȭ��
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				startPane.setVisible(false);
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

			}
			
		});
		//���� ������ �ΰ��� �� �� ����
		btnFinishWith.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				finishPane.setVisible(false);
				gameoverPane.setVisible(true);
				gameoverPane.setVisible(false);

			}
			
		});
		btnFinishBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				finishPane.setVisible(false);
				gameoverPane.setVisible(true);

			}
			
		});
		btngameoverBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gameoverPane.setVisible(false);
				finishPane.setVisible(true);
			}
			
		});
	}

}
