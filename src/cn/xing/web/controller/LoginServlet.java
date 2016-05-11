package cn.xing.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xing.domain.User;
import cn.xing.service.impl.BusinessServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		BusinessServiceImpl service  =new BusinessServiceImpl();
		User user=service.login(username, password);
		if(user!=null){
			request.getSession().setAttribute("user", user);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			return ;
		}
		request.setAttribute("message", "用户名或密码错误");
		request.getRequestDispatcher("/message.jsp").forward(request, response);



	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}