package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverterF;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempFServlet")
public class getTempFServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempFServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userTemp = request.getParameter("userTempF");
		
		TempConverterF userTemps = new TempConverterF(Double.parseDouble(userTemp));
		
		request.setAttribute("userTemperature", userTemps);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		
		
	}

	
	
}
