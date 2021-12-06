package money;

import java.util.*;

public class Money {

	/*
	 * �ٳ��� �� 1���� ���� 1~5��
	 * ����� - ź �ٳ������� 3���� ���� ��� ȭ�� ����. (�г�Ƽ - �����ϰ� ���� 3���� ����)
	 * 
	 * ���� 10��
	 * �⺻ �Ӵϴ� 100��
	 * 
	 * ������ 100���� �Ǹ��� ���ӿ���
	 */
	
	private int money = 100;		// ����� ����
	private final int DOUGH = 10;	// ����

	public Money() {}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buyDough(int count) {
		this.money -= DOUGH * count;
	}
	
	public void sellBananaBread(int count) {
		Random random = new Random();
		for(int i=1; i<=count; i++) 
			this.money += random.nextInt(5)+1;
	}
	
}