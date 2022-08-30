package question.command;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import question.model.Option;
import question.model.Question;
import question.service.QuestionPage;
import question.service.ListOptionService;
import question.service.ListQuestionService;

public class ListQuestionOptionHandler implements CommandHandler {
	ListQuestionService qService = new ListQuestionService();
	ListOptionService oService = new ListOptionService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String topic = req.getParameter("topic_id");
		int topic_id = Integer.parseInt(topic);
		// startPage 사용할 때 3, 4외에 request 값 못 받도록 하기
		if (topic_id != 3 & topic_id != 4) {
			res.sendRedirect("../startQuestion.jsp");
			return null;
		} else {
			String pageNoVal = req.getParameter("pageNum");
			int pageNum = 1; // pageNo가 null이면 1로 지정(받아오는 값이 없으므로 1로 자동설정 되게 돼있음)
			if (pageNoVal != null) {
				pageNum = Integer.parseInt(pageNoVal);
			}
			QuestionPage questionPage = qService.getQuestionPage(topic_id, pageNum);
			List<Question> qList = qService.getQuestionPage(topic_id, pageNum).getQuestion_context();
			for(int i = 0; i <qList.size(); i++) {
				
				
				
//				옵션클래스가 하나당 두 개 =oService.get(qList.get(i).getQuestion_id());
			}
			
			
			Map<Integer, List<Option>> optionList = oService.getOption(topic_id);
			req.setAttribute("questionPage", questionPage);
			req.setAttribute("optionList", optionList);
			return "/WEB-INF/view/listQuestion.jsp";
		}
		
		// startPage 사용해서 위처럼 해둔 거! 요청 값 제대로 받으면 아래로 사용
//		String pageNoVal = req.getParameter("pageNum");
//		int pageNum = 1; // pageNo가 null이면 1로 지정(받아오는 값이 없으므로 1로 자동설정 되게 돼있음)
//		if (pageNoVal != null) {
//			pageNum = Integer.parseInt(pageNoVal);
//		}
//		QuestionPage questionPage = qService.getQuestionPage(topic_id, pageNum);
//		req.setAttribute("questionPage", questionPage);
//		return "/WEB-INF/view/listQuestion.jsp";
	}
} 
