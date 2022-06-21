package diary;
import java.time.LocalDate;

public class Diary implements Comparable<Diary> {
	private LocalDate day;
	private String title;
	private String weather;
	private String content;
	
	public Diary(LocalDate day) {
		super();
		this.day = day;
	}
	public Diary(LocalDate day, String title, String weather, String content) {
		super();
		this.day = day;
		this.title = title;
		this.weather = weather;
		this.content = content;
	}
	public LocalDate getDay() {
		return day;
	}
	public void setDay(LocalDate day) {
		this.day = day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "일기 [날짜=" + day + ", 제목=" + title + ", 날씨=" + weather + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diary other = (Diary) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}
	@Override
	public int compareTo(Diary o) {
		return day.compareTo(o.day);
	}
}







