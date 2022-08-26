package member.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.DuplicateIdException;
import member.service.JoinRequest;
import member.service.JoinService;
import mvc.command.CommandHandler;



public class JoinHandler implements CommandHandler {
   private static final String FORM_VIEW = "/WEB-INF/view/joinForm.jsp";
   private JoinService joinService = new JoinService();
   private static final String check = "go";
   @Override
   public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      if(req.getMethod().equalsIgnoreCase("GET")) {
         return processForm(req, res);
      } else if(req.getMethod().equalsIgnoreCase("POST")) {
         return processSubmit(req, res);
      } else {
         res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
         return null;
      }
   }
   
   private String processForm(HttpServletRequest req, HttpServletResponse res) {
      return FORM_VIEW;
   }
   
   private String processSubmit(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      JoinRequest joinReq = new JoinRequest();
      joinReq.setId(req.getParameter("id"));
      joinReq.setPassword(req.getParameter("password"));
      joinReq.setNickname(req.getParameter("nickname"));
      joinReq.setConfirmPassword(req.getParameter("confirmPassword"));
      
      Map<String, Boolean> errors = new HashMap<>();
      req.setAttribute("errors", errors);
      joinReq.validate(errors);
      
      if(!errors.isEmpty()) {
         return FORM_VIEW;
      }
      
      try {
         joinService.join(joinReq);
         req.setAttribute("merong", true);
         req.getRequestDispatcher(FORM_VIEW).forward(req, res);
         return FORM_VIEW;
         // return "/WEB-INF/view/loginForm.jsp";

      } catch (DuplicateIdException e) {
         errors.put("duplicateId", Boolean.TRUE);
         System.out.println(errors);
         return FORM_VIEW;
      }
   }
}