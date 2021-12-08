import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.AbstractButton;
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
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextField;


public class Game extends JFrame{

	private Image startBack = new ImageIcon(main_game.class.getResource("./images/mainFrame.png")).getImage();
	private JTextField textField, textField_1, textField_2;
	
	int burnt = 0; //탄 빵갯수
	int BuyDough = 0; //반죽사기
	int MyBread = 0; //만든 빵 갯수
	int Money = 100; //기본자금 100원
	int Dough = 0;
	
	public void paint(Graphics g) {
		g.drawImage(startBack, 0, 0, null);
	}
	private JFrame frame;
	private JTextField bubble_1;

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
    public class TaskToDo extends TimerTask {
       int timeSec = 60;
       JLabel timerLabel;    
       
       public TaskToDo(JLabel timerLabel) {
          this.timerLabel = timerLabel;
       }
       
        @Override
        public void run() {
           if(timeSec == 60) {
                timerLabel.setText("00:01:00");
                timeSec--;
             }else {
               if(timeSec >= 10)
                  timerLabel.setText("00:00:" + timeSec--);
               else
                  timerLabel.setText("00:00:0" + timeSec--);
             }
             if(timeSec == -1) this.cancel();
          
      }
    }
//    public static void Main_sound(String file) {
//    	try {
//    		AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
//    		Clip clip = AudioSystem.getClip();
//    		clip.open(ais);
//    		clip.start();
//    	}catch(Exception e) {
//    		e.printStackTrace();
//    	}
//    }
	private void initialize() {
		//게임 시작화면
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 721, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Music introMusic = new Music("mainMusic.mp3",true);
		introMusic.start();
		//메인 노래
//		Main_sound("/music/factory-area-10410.mp3");
		
		JPanel startPane = new JPanel();
		startPane.setBounds(0, 0, 705, 505);
		startPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(startPane);
		startPane.setLayout(null);
		
		JButton btnStart = new JButton("게임 시작하기");
		btnStart.setBounds(279, 323, 149, 32);
		startPane.add(btnStart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 705, 505);
		lblNewLabel.setIcon(new ImageIcon(Game.class.getResource("/images/mainFrame.png")));
		startPane.add(lblNewLabel);
		
		//메인 게임화면
		JPanel mainPane = new JPanel();
	      mainPane.setBounds(0, 0, 705, 505);
	      mainPane.setBorder(new LineBorder(Color.black, 5));
	      mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      frame.getContentPane().add(mainPane);
	      mainPane.setLayout(null);

	      JButton btnAdd = new JButton("반죽추가");
	      btnAdd.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseClicked(MouseEvent e) {
	            if (Money <= 0) {
	               JOptionPane jOptionPane = new JOptionPane();
	               jOptionPane.showMessageDialog(null, "돈이 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
	            } else {
	               Dough += 1;
	               Money -= 10;
	            }
	            textField_1.setText(Dough + "개");
	            textField_2.setText(Money + "원");
	         }
	      });
	      btnAdd.setBounds(10, 50, 100, 32);
	      mainPane.add(btnAdd);

	      JButton btnGive = new JButton("빵주기");
	      btnGive.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseClicked(MouseEvent e) {
	            if (MyBread <= 0) {
	               JOptionPane jOptionPane = new JOptionPane();
	               jOptionPane.showMessageDialog(null, "빵이 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
	            } else {
	               MyBread -= 1;
	            }
	            textField.setText(MyBread + "개");
	         }
	      });
	      btnGive.setBounds(10, 10, 100, 33);
	      mainPane.add(btnGive);

	      textField = new JTextField();
	      textField.setEditable(false);
	      textField.setHorizontalAlignment(SwingConstants.CENTER);
	      textField.setBounds(120, 10, 113, 32);
	      textField.setText(MyBread + "개");
	      mainPane.add(textField);
	      textField.setColumns(10);

	      Panel panel = new Panel();
	      panel.setFont(new Font("Dialog", Font.BOLD, 12));
	      panel.setBounds(120, 10, 113, 32);
	      panel.setForeground(Color.WHITE);
	      panel.setBackground(Color.WHITE);
	      panel.toString();

	      mainPane.add(panel);

	      textField_1 = new JTextField();
	      textField_1.setEditable(false);
	      textField_1.setHorizontalAlignment(SwingConstants.CENTER);
	      textField_1.setBounds(120, 50, 113, 32);
	      textField_1.setText(Dough + "개");
	      mainPane.add(textField_1);
	      textField_1.setColumns(10);

	      Panel panel_1 = new Panel();
	      panel_1.setBounds(120, 50, 113, 32);
	      panel_1.setBackground(Color.WHITE);
	      mainPane.add(panel_1);

	      textField_2 = new JTextField();
	      textField_2.setEditable(false);
	      textField_2.setHorizontalAlignment(SwingConstants.CENTER);
	      textField_2.setBounds(495, 10, 200, 32);
	      textField_2.setText(Money + "원");
	      mainPane.add(textField_2);
	      textField_2.setColumns(10);

	      Panel panel_2 = new Panel();
	      panel_2.setBounds(495, 10, 200, 32);
	      panel_2.setBackground(Color.WHITE);
	      mainPane.add(panel_2);
		
		JLabel timerLabel = new JLabel("00:01:00");
	    timerLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 45));
	    timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    timerLabel.setBounds(0, 0, 705, 82);
	    mainPane.add(timerLabel);
	    
		JTextPane textPane = new JTextPane();
		textPane.setText("0");
		textPane.setBounds(122, 10, 111, 33);
		mainPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("0");
		textPane_1.setBounds(122, 50, 111, 32);
		mainPane.add(textPane_1);
	      
        JLabel timerLabel1 = new JLabel("");
        timerLabel1.setFont(new Font("굴림", Font.BOLD, 15));
        timerLabel1.setBounds(0, 0, 705, 66);
        timerLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        mainPane.add(timerLabel1);
      
        Timer time = new Timer();
        time.schedule(new TaskToDo(timerLabel), 2500, 1000);
      
		JButton btnHomeBack = new JButton("나가기");
		btnHomeBack.setBounds(495, 50, 85, 32);
		mainPane.add(btnHomeBack);
		
		JButton btnReGame = new JButton("\uAC8C\uC784\uD074\uB9AC\uC5B4");
		btnReGame.setActionCommand("");
		btnReGame.setBounds(585, 50, 110, 32);
		mainPane.add(btnReGame);
		
		
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
						
						MyBread += 1;
					}
				};
				timer1.schedule(task1, 4000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton.setBounds(30, 340, 124, 81);
						mainPane.add(btnNewButton);
						
						burnt +=1;
						System.out.println(burnt);
					

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
						btnNewButton_1.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_3 (1).png")));
						btnNewButton_1.setBounds(30, 420, 124, 81);
						mainPane.add(btnNewButton_1);
						
						MyBread += 1;
					}
				};
				timer1.schedule(task1, 3000);
				
				TimerTask task2 = new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnNewButton_1.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_4 (1).png")));
						btnNewButton_1.setBounds(30, 420, 124, 81);
						mainPane.add(btnNewButton_1);
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;

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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;

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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;

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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;

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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;
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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;
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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;
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
						
						burnt +=1;
						System.out.println(burnt);

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
						
						MyBread += 1;
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
						
						burnt +=1;
						System.out.println(burnt);

					}
				};
				timer2.schedule(task2, 7000);
			}
			
		});
		
		btnNewButton_9.setIcon(new ImageIcon(Game.class.getResource("/images/bananaFrame_10.3 (1).png")));
		btnNewButton_9.setBounds(550, 420, 124, 81);
		mainPane.add(btnNewButton_9);
		
		
//		if(burnt>=10) {
//		JLabel angryLabel = new JLabel("");
//		angryLabel.setIcon(new ImageIcon(Game.class.getResource("/images/angry.png")));
//		angryLabel.setBounds(-11, -34, 731, 385);
//		mainPane.add(angryLabel);
//		}
		
		//메인화면 배경
		JLabel MainBack = new JLabel("");
		
//		lblNewLabel_1.addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentShown(ComponentEvent e) {
//				burnt = 10;
//				if(burnt>=10) {
//					JLabel angryLabel = new JLabel("");
//					angryLabel.setIcon(new ImageIcon(Game.class.getResource("/images/angry.png")));
//					angryLabel.setBounds(-11, -34, 731, 385);
//					mainPane.add(angryLabel);
//				}
//			}
//		});
		
		JLabel angryLabel = new JLabel("");
		angryLabel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				angryLabel.setIcon(new ImageIcon(Game.class.getResource("/images/angry.png")));
				angryLabel.setBounds(-11, -34, 731, 385);
				mainPane.add(angryLabel);
			}
		});
		
//		angryLabel.setIcon(new ImageIcon(Game.class.getResource("/images/angry.png")));
//		angryLabel.setBounds(-11, -34, 731, 385);
//		mainPane.add(angryLabel);
////		
		bubble_1 = new JTextField();
		bubble_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bubble_1.setText("5");
			}
		});
		bubble_1.setBounds(125, 185, 30, 30);
		bubble_1.setEditable(false);
		mainPane.add(bubble_1);
		bubble_1.setColumns(10);
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setIcon(new ImageIcon(Game.class.getResource("/images/image 55.png")));
		lblNewLabel_4.setBounds(110, 170, 73, 66);
		mainPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(Game.class.getResource("/images/image 55.png")));
		lblNewLabel_4_1.setBounds(290, 170, 73, 66);
		mainPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon(Game.class.getResource("/images/image 55.png")));
		lblNewLabel_4_2.setBounds(470, 170, 73, 66);
		mainPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon(Game.class.getResource("/images/image 55.png")));
		lblNewLabel_4_3.setBounds(630, 170, 73, 66);
		mainPane.add(lblNewLabel_4_3);
		
		
		MainBack.setIcon(new ImageIcon(Game.class.getResource("/images/back_main.png")));
		MainBack.setBounds(-11, 0, 731, 505);
		mainPane.add(MainBack);
		
		
		
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
//		게임화면에서 메인으로 돌아가기
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
//		게임 끝났을때
		btnReGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPane.setVisible(true);
				finishPane.setVisible(false);
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
