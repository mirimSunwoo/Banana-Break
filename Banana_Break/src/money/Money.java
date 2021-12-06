package money;

import java.util.*;

public class Money {

	/*
	 * 바나나 빵 1개당 원석 1~5개
	 * 사용자 - 탄 바나나빵이 3개가 있을 경우 화를 낸다. (패널티 - 일정하게 원석 3개씩 뺏김)
	 * 
	 * 반죽 10원
	 * 기본 머니는 100원
	 * 
	 * 원석이 100개가 되면은 게임오버
	 */
	
	private int money = 100;		// 사용자 원석
	private final int DOUGH = 10;	// 반죽

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