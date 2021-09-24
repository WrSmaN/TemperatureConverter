package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverterC;
import model.TempConverterF;

/**
 * Servlet implementation class getTempCServlet
 */
@WebServlet("/getTempCServlet")
public class getTempCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userTemp = request.getParameter("userTempC");
		
		TempConverterC userTemps = new TempConverterC(Double.parseDouble(userTemp));
		
		request.setAttribute("userTemperatureC", userTemps);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
