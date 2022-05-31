// p216 AlarmClockTest

class Time {
	private int time;
	private int minute;
	private int second;
	
	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	
	public int getTime() {
		return time;
	} // int 형으로 time을 불러오도록 getter 설정
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void printAll() {
		System.out.println(time + ":" + minute + ":" + second);
	}

}
	
class AlarmClock {
		private Time currentTime; // has-a 관계
		private Time alarmTime; // Time이라는 type으로 사용 우리가 자체적으로 만든 타입들은 고유값을 가짐
		// 고유값들은 문자열타입으로 되어있음
		
		public AlarmClock(Time a, Time c) { 
			alarmTime = a; 
			currentTime = c;
		}
		public Time getCurrentTime() {
		return currentTime;
	}
}

public class AlarmClockTest {
	public static void main(String args[]) {
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c =  new AlarmClock(alarm, current);
		
		int hour = c.getCurrentTime();
		Time hour = c.getCurrentTime();
		System.out.println(hour.getTime());
		hour.printAll();
		// getCurrentTime() 는 Time이라는 class type이랑 int랑 type이 다름
		//Time hour = c.getCurrentTime()이면 type은 같아지는데, 
		System.out.println(c);
	} // end main
} // end class
	
