package article.model;

import java.util.Date;

public class Article {
	
	private Integer number;
	private Writer writer;
	private String title;
	private Date regDate;
	private Date modifedDate;
	private int readCount;
	
	public Article(Integer number, Writer writer, String title, Date regDate, Date modifedDate, int readCount) {
		super();
		this.number = number;
		this.writer = writer;
		this.title = title;
		this.regDate = regDate;
		this.modifedDate = modifedDate;
		this.readCount = readCount;
	}

	public Integer getNumber() {
		return number;
	}

	public Writer getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public Date getRegDate() {
		return regDate;
	}

	public Date getModifedDate() {
		return modifedDate;
	}

	public int getReadCount() {
		return readCount;
	}
	
}
