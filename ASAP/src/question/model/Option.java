package question.model;

public class Option {
	int option_id;
	int question_id;
	String option_text;
	String group_text;
	
	Option(){};
	
	public Option(int option_id, int question_id, String option_text, String group_text) {
		super();
		this.option_id = option_id;
		this.question_id = question_id;
		this.option_text = option_text;
		this.group_text = group_text;
	}

	public int getOption_id() {
		return option_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public String getOption_text() {
		return option_text;
	}

	public String getGroup_text() {
		return group_text;
	}

	@Override
	public String toString() {
		return "Option [option_id=" + option_id + ", question_id=" + question_id + ", option_text=" + option_text
				+ ", group_text=" + group_text + "]";
	}
	
}
