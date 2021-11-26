package timer;

import java.util.*;


public class Timer {

	public static void main(String[] args) {
		MyTimer timer = new MyTimer(0,1,0);
		timer.start();
	}

}

class MyTimer {
	MyTime time;
	
	MyTimer(int hour, int min, int sec) {
		time = new MyTime(hour, min, sec);
	}
	
	String getTime() {
		return time.toString();
	}
	
	void start() {
		while(true) {
			try {
				Thread.sleep(1000); // 1초 동안 수행을 멈춘다.
			} catch (Exception e) {
		
			}
			
			System.out.println(time);
			decSecond();
		}
	}
	
	// 시간을 감소시키는 함수
    void decHour() {
        if(time.getHour() > 0) {
        	time.setHour(time.getHour()-1);
        	time.setMinute(59);
        	time.setSecond(59);
        } else {
        	stop();            
        }

  }
	
	void decMinute() {
		if(time.getMinute() > 0) {
            time.setMinute(time.getMinute()-1);
            time.setSecond(59);
		} else {
            decHour();
		}
	}
	
	void decSecond() {
        if(time.getSecond() > 0) {
            time.setSecond(time.getSecond()-1);
        } else {
            decMinute();
        }
	}
	
	void reset() {
		time.setHour(0);
		time.setMinute(0);
		time.setSecond(0);
	}
	
	void stop() {
		System.exit(0);
	}
}

class MyTime {
	int hour = 0, minute = 0, second = 0;
	
	MyTime() {
		this(0, 0, 0);
	}
	
	MyTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour >= 0) this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 0 || minute < 60) this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 0 || second < 60) this.second = second;
	}
	
	public String toString() {
		String temp = "";
		temp += (hour < 10)? "0"+hour : ""+hour;
		temp += ":";
		temp += (minute < 10)? "0"+minute : ""+minute;
		temp += ":";
		temp += (second < 10)? "0"+second : ""+second;
		
		return temp;
	}
	
}