import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;


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
		//게임 시작화면
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel startPane = new JPanel();
		startPane.setBounds(0, 0, 705, 505);
		startPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(startPane);
		startPane.setLayout(null);
		
		JButton btnStart = new JButton("게임 시작하기");
		btnStart.setBounds(176, 306, 149, 32);
		startPane.add(btnStart);
		
		JButton btnExplan = new JButton("게임 설명서");
		btnExplan.setBounds(377, 306, 149, 32);
		startPane.add(btnExplan);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 705, 505);
		lblNewLabel.setIcon(new ImageIcon(Game.class.getResource("/images/mainFrame.png")));
		startPane.add(lblNewLabel);
		
		//메인 게임화면
		JPanel mainPane = new JPanel();
		mainPane.setBounds(0, 0, 705, 505);
		mainPane.setBorder(new LineBorder(Color.black,5));
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(mainPane);
		mainPane.setLayout(null);
		
		JButton btnAdd = new JButton("반죽추가");
		btnAdd.setBounds(140, 71, 108, 32);
		mainPane.add(btnAdd);
		
		JButton btnGive = new JButton("빵주기");
		btnGive.setBounds(140, 25, 107, 33);
		mainPane.add(btnGive);
		
		Panel panel = new Panel();
		panel.setFont(null);
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
		
		JButton btnHomeBack = new JButton("게임 나가기");
		btnHomeBack.setBounds(522, 66, 171, 32);
		mainPane.add(btnHomeBack);
		
		JButton btnGameClear = new JButton("\uAC8C\uC784 \uD074\uB9AC\uC5B4");
		btnGameClear.setBounds(522, 105, 171, 32);
		mainPane.add(btnGameClear);
		
		
		//1번 줄
		//1
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton.setBounds(30, 340, 124, 81);
				mainPane.add(btnNewButton);
				
				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton.setBounds(30, 340, 124, 81);
						mainPane.add(btnNewButton);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton.setBounds(30, 340, 124, 81);
						mainPane.add(btnNewButton);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton.setBounds(30, 340, 124, 81);
		mainPane.add(btnNewButton);
		
		//2
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_1.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_1.setBounds(30, 420, 124, 81);
				mainPane.add(btnNewButton_1);
				
				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton.setBounds(30, 420, 124, 81);
						mainPane.add(btnNewButton);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton.setBounds(30, 420, 124, 81);
						mainPane.add(btnNewButton);
					}
				};
				timer2.schedule(task2, 7000);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_1.setBounds(30, 420, 124, 81);
		mainPane.add(btnNewButton_1);
		
		
		//2번 줄
		//3
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_2.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_2.setBounds(160, 340, 124, 81);
				mainPane.add(btnNewButton_2);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_2.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_2.setBounds(160, 340, 124, 81);
						mainPane.add(btnNewButton_2);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_2.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_2.setBounds(160, 340, 124, 81);
						mainPane.add(btnNewButton_2);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_2.setBounds(160, 340, 124, 81);
		mainPane.add(btnNewButton_2);
		
		//4
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_3.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_3.setBounds(160, 420, 124, 81);
				mainPane.add(btnNewButton_3);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_3.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_3.setBounds(160, 420, 124, 81);
						mainPane.add(btnNewButton_3);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_3.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_3.setBounds(160, 420, 124, 81);
						mainPane.add(btnNewButton_3);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_3.setBounds(160, 420, 124, 81);
		mainPane.add(btnNewButton_3);
		
		//3번 줄
		//5
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_4.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_4.setBounds(290, 340, 124, 81);
				mainPane.add(btnNewButton_4);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_4.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_4.setBounds(290, 340, 124, 81);
						mainPane.add(btnNewButton_4);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_4.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_4.setBounds(290, 340, 124, 81);
						mainPane.add(btnNewButton_4);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_4.setBounds(290, 340, 124, 81);
		mainPane.add(btnNewButton_4);
		
		//6
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_5.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_5.setBounds(290, 420, 124, 81);
				mainPane.add(btnNewButton_5);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_5.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_5.setBounds(290, 420, 124, 81);
						mainPane.add(btnNewButton_5);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_5.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_5.setBounds(290, 420, 124, 81);
						mainPane.add(btnNewButton_5);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_5.setBounds(290, 420, 124, 81);
		mainPane.add(btnNewButton_5);
		
		//4번 줄
		//7
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_6.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_6.setBounds(420, 340, 124, 81);
				mainPane.add(btnNewButton_6);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_6.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_6.setBounds(420, 340, 124, 81);
						mainPane.add(btnNewButton_6);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_6.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_6.setBounds(420, 340, 124, 81);
						mainPane.add(btnNewButton_6);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_6.setBounds(420, 340, 124, 81);
		mainPane.add(btnNewButton_6);
		
		//8
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_7.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_7.setBounds(420, 420, 124, 81);
				mainPane.add(btnNewButton_7);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_7.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_7.setBounds(420, 420, 124, 81);
						mainPane.add(btnNewButton_7);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_7.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_7.setBounds(420, 420, 124, 81);
						mainPane.add(btnNewButton_7);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_7.setBounds(420, 420, 124, 81);
		mainPane.add(btnNewButton_7);
		
		//5번 줄
		//9
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_8.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_8.setBounds(550, 340, 124, 81);
				mainPane.add(btnNewButton_8);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_8.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_8.setBounds(550, 340, 124, 81);
						mainPane.add(btnNewButton_8);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_8.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_8.setBounds(550, 340, 124, 81);
						mainPane.add(btnNewButton_8);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_8.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_8.setBounds(550, 340, 124, 81);
		mainPane.add(btnNewButton_8);
		
		
		//10
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_9.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_2.png")));
				btnNewButton_9.setBounds(550, 420, 124, 81);
				mainPane.add(btnNewButton_9);

				Timer timer1 = new Timer(); //맛있는거
				Timer timer2 = new Timer(); //탄거
				TimerTask task1 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_9.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_9.setBounds(550, 420, 124, 81);
						mainPane.add(btnNewButton_9);
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_9.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_9.setBounds(550, 420, 124, 81);
						mainPane.add(btnNewButton_9);
					}
				};
				timer2.schedule(task2, 7000);
				
			}
		});
		btnNewButton_9.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_9.setBounds(550, 420, 124, 81);
		mainPane.add(btnNewButton_9);
		
		//메인화면 배경
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Game.class.getResource("/images/back_main.png")));
		lblNewLabel_1.setBounds(-11, 0, 731, 505);
		mainPane.add(lblNewLabel_1);
		
		JPanel finishPane = new JPanel();
		finishPane.setBounds(0, 1, 705, 503);
		finishPane.setLayout(null);
		finishPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(finishPane);
		
		JButton btnFinishWith = new JButton("원숭이들과 같이 살기");
		btnFinishWith.setBounds(402, 200, 231, 48);
		finishPane.add(btnFinishWith);
		
		JButton btnFinishBack = new JButton("본래의 삶으로 돌아가기");
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
		
		JButton btngameoverBack = new JButton("돌아가기");
		btngameoverBack.setBounds(321, 40, 144, 23);
		gameoverPane.add(btngameoverBack);
		
		finishPane.setVisible(false);
		mainPane.setVisible(false);
		gameoverPane.setVisible(false);

		//게임 시작하는 화면
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				startPane.setVisible(false);
				gameoverPane.setVisible(false);
				finishPane.setVisible(false);
			}
			
		});
		//게임화면에서 메인으로 돌아가기
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
		//게임 끝났을때
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
		//게임 끝나고 두개의 삶 중 선택
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
