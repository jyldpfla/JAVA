package diary;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiaryManageImpl implements DiaryManage {
	private List<Diary> list;
	
	public DiaryManageImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public void add(Diary d) {
		list.add(d);
	}

	@Override
	public List<Diary> list() {
		return list;
	}

	@Override
	public void edit(LocalDate day, String content) {
		int index = list.indexOf(new Diary(day));
		if (index >= 0) {
			Diary d = list.get(index);
			d.setContent(content);
		}
	}

	@Override
	public void deleteFirst() {
		if (!list.isEmpty()) {
			list.remove(0);
		}
	}
}










