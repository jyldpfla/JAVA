package question.model;

public class Question {
	int question_id;
	int topic_id;
	String topic;
	String question_text;
	
	public Question() {}
	
	public Question(int topic_id, String topic) {
		this.topic_id = topic_id;
		this.topic = topic;
	}
	
	public Question(int question_id, int topic_id, String question_text) {
		this.question_id = question_id;
		this.topic_id = topic_id;
		this.question_text = question_text;
	}
	
	public String getTopic() {
		return topic;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public String getQuestion_text() {
		return question_text;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", topic_id=" + topic_id + ", topic=" + topic
				+ ", question_text=" + question_text + "]";
	}
	
}
