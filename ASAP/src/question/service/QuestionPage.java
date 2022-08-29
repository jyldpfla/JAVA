package question.service;

import java.util.List;

import question.model.Question;

public class QuestionPage {
	private int topic_id; 
	private String topic; // 주제
	private int total; // 전체 질문 개수
	private int currentPage; // 현재 페이지
	private List<Question> question_context; // 질문 리스트
	private int totalPages; // 전체 페이지 수
	private int startPage; // 시작하는 페이지
	private int endPage; // 끝 페이지
	
	public QuestionPage(int topic_id, String topic, int total, int currentPage, int size, List<Question> question_context) {
		this.topic_id = topic_id;
		this.topic = topic;
		this.total = total;
		this.currentPage = currentPage;
		this.question_context = question_context;
		// 만약 질문 개수가 0이면 0으로 아래 3가지를 0으로 설정
		if (total == 0) {
			totalPages = 0;
			startPage = 0;
			endPage = 0;
		} else {
			// 질문 개수가 0이 아니면
			totalPages = total / size; // totalPages는 total이 됨(질문지가 페이지당 하나가 나오므로)
			if (total % size > 0) {
				totalPages++;
			}
			startPage = currentPage / 5 * 5 + 1; // 화면 하단에 보여줄 이동링크 개수  : 5개로 지정 [1][2][3][4][5] 이렇게!
			// 현재 페이지가 3이면 startPage가 1이 되고
			endPage = startPage + 4;
			// 끝 페이지는  5
			if (endPage > totalPages) endPage = totalPages;
			// 5의 배수로 안끊길 때를 위한 추가 if문
		}
	}
	
	
	public int getTopic_id() {
		return topic_id;
	}

	public String getTopic() {
		return topic;
	}

	public int getTotal() {
		return total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public List<Question> getQuestion_context() {
		return question_context;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	@Override
	public String toString() {
		return "QuestionPage [topic_id=" + topic_id + ", topic=" + topic + ", total=" + total + ", currentPage="
				+ currentPage + ", question_context=" + question_context + ", totalPages=" + totalPages + ", startPage="
				+ startPage + ", endPage=" + endPage + "]";
	}

}
