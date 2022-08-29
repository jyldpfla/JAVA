package question.command;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import question.model.Question;
import question.service.QuestionPage;
import question.service.ListQuestionService;

public class ListQuestionHandler implements CommandHandler {
	ListQuestionService qService = new ListQuestionService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String topic = req.getParameter("topic_id");
		int topic_id = Integer.parseInt(topic);
		
		String pageNoVal = req.getParameter("pageNum");
		int pageNum = 1; // pageNo가 null이면 1로 지정
		if (pageNoVal != null) {
			pageNum = Integer.parseInt(pageNoVal);
		}
		QuestionPage questionPage = qService.getQuestionPage(topic_id, pageNum);
		req.setAttribute("questionPage", questionPage);
		return "/WEB-INF/view/listQuestion.jsp";
	}
	
}
