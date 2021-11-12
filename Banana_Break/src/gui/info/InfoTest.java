package gui.info;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class InfoTest implements ActionListener{
	JFrame f;  						
	JButton bInsert,bModify,bDelete,bShow,bExit;
	JTextArea ta;
	JTextField tfName,tfGender,tfAge,tfID,tfPW;
	ArrayList list = new ArrayList();


	InfoTest(){
		f = new JFrame();
		bInsert = new JButton("입력");
		bModify = new JButton("변경");
		bDelete = new JButton("삭제");
		bShow = new JButton("정보");
		bExit = new JButton("종료");
		ta = new JTextArea();
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfID = new JTextField(10);
		tfPW = new JTextField(20);



	}

	void addLayout() {
		f.setLayout(new BorderLayout());
		f.add(ta,BorderLayout.CENTER);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 5));
		p.add(bInsert);
		p.add(bModify);
		p.add(bDelete);
		p.add(bShow);
		p.add(bExit);
		f.add(p,BorderLayout.SOUTH);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(new JLabel("이름"));
		p1.add(tfName);
		p1.add(new JLabel("아이디"));
		p1.add(tfID);
		p1.add(new JLabel("비밀번호"));
		p1.add(tfPW);
		p1.add(new JLabel("나이"));
		p1.add(tfAge);
		f.add(p1,BorderLayout.WEST);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	void eventProc() {
		bInsert.addActionListener(this);
		bModify.addActionListener(this);
		bDelete.addActionListener(this);
		bShow.addActionListener(this);
		bExit.addActionListener(this);

		tfID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = tfID.getText();
				for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if((p.getID()).equals(ID)) {
						tfName.setText(p.getName());
						tfID.setText(p.getID());
						tfPW.setText(p.getPW());
						tfAge.setText(Integer.toString(p.age));

					}
				}

			}
		}//end of tfTel
				);


	}


	public void actionPerformed(ActionEvent ev) {
		JButton btn = (JButton)ev.getSource();
		if(btn == bInsert) {
			insertData();
			clearTextField();
			showData();
		}else if(btn == bModify) {
			modifyData();
			clearTextField();			
			showData();
		}else if(btn == bDelete) {
			deleteData();
			clearTextField();
			showData();
		}else if(btn == bShow) {
			showData();

		}else if(btn == bExit) {
			System.exit(0);
		}


	}//end of actionPerformed

	void showData() {
		ta.setText("-------------------------------\n");
		for(int i = 0;i<list.size();i++) {
			Person p = (Person)list.get(i);
			ta.append(p.toString());
		}
	}


	void insertData() {
		Person p = new Person();

		p.setName (tfName.getText());
		p.setID (tfID.getText());
		p.setPW (tfPW.getText());
		p.setAge (Integer.parseInt(tfAge.getText()));

		list.add(p);


	}

	void clearTextField() {
		tfName.setText(null);
		tfAge.setText(null);
		tfID.setText(null);
		tfPW.setText(null);

	}

	void deleteData() {
		String ID = tfID.getText();
		for(int i=0;i<list.size();i++) {
			Person p = (Person)list.get(i);
			if((p.getID()).equals(ID)) {
				list.remove(p);

			}
		}

	}//end of deleteData

	void modifyData() {
		String ID = tfID.getText();
		for(int i=0 ; i<list.size();i++) {
			Person p = (Person)list.get(i);
			if(p.getID().equals(ID)) {
				p.setName (tfName.getText());
				p.setID (tfID.getText());
				p.setPW (tfPW.getText());
				p.setAge (Integer.parseInt(tfAge.getText()));

				//list.set(i, p);
			}
		}


	}



	public static void main(String[] args) {
		InfoTest it = new InfoTest();
		it.addLayout();
		it.eventProc();


	}

}
