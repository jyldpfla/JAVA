package diary;
import java.time.LocalDate;
import java.util.List;

public interface DiaryManage {
	void add(Diary d);
	List<Diary> list();
	void edit(LocalDate day, String content);
	void deleteFirst();
}
