package question.command;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
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
		System.out.println("핸들" + (req.getAttribute("qTopic") != null));
		if (req.getAttribute("qTopic") == null) {
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
				
				Map<Integer, List<Option>> optionMap = oService.getOption(topic_id);
				req.setAttribute("questionPage", questionPage);
				req.setAttribute("optionMap", optionMap);
				return "/WEB-INF/view/listQuestion.jsp";
			}
		} else if (req.getAttribute("qTopic") != null) { // 여기로 안들어와짐..
			System.out.println("?" + req.getParameter("77"));
		}
		return null;
		

	}
}
