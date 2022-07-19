
public class 레스토랑로직을가지고있는객체 {
	private RestaurantsDao dao;

	public 레스토랑로직을가지고있는객체(RestaurantsDao dao) {
		super();
		this.dao = dao;
	}

	public void setDao(RestaurantsDao dao) {
		// dao 객체에 대한 의존성을 주입
		this.dao = dao;
	}
	
	public void 로직1() {
		// 로직 흐름
		// dao.메소드호출();
		dao.create(name, number, address);
		dao.delete(id);
		dao.read();
		dao.read(id);
		dao.update(id, name, number, address);
	}
}
