package org.patomediatags.operations;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.patomediatags.configuration.PropertiesConf;
import org.patomediatags.model.Ads;

/**
 * Servlet implementation class BeforeIndex
 */
public class BeforeIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeforeIndex() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Ads> ads = PropertiesConf.getInstance().getAds();
		 HttpSession session = request.getSession();
		 session.setAttribute("ads",ads); 
		// System.out.println(ads);
		 
		
		 request.getSession();
		 
		 request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Ads> ads = PropertiesConf.getInstance().getAds();
		 HttpSession session = request.getSession();
		 session.setAttribute("ads",ads); 
		 //System.out.println(ads);
	}

}
