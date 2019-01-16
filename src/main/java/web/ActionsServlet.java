package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BmiService;

public class ActionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 接受请求，依据请求路径，调用对应模型来处理
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		System.out.println("path:" + path);
		if ("/bmi".equals(path)) {
			String height = request.getParameter("height");
			String weight = request.getParameter("weight");
			String gender = request.getParameter("gender");
			BmiService service= new BmiService();

			String status = service.bmi(Double.parseDouble(height),
					Double.parseDouble(weight),
					gender);
			/*
			 * 接收模型返回的处理结果，调用对应的视图来展现
			 */
			request.setAttribute("status",status);
			request.getRequestDispatcher("view.jsp").forward(request, response);
			/*
			 * 将处理器实例交给HanderMapping来处理
			 * handerMapping利用java反射对处理器进行分析
			 * 建立请求路径与处理器的对应关系
			 * 
			 * 
			 */

		}

	}

}
