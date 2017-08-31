package org.patomediatags.operations;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.net.URL;;
/**
 * Servlet implementation class ServletPrueba
 */
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "C:/Users/Villegas/Downloads/PatomediaTags";
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Map<String, String[]> parameters = request.getParameterMap();
		 System.out.println(parameters);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(ServletFileUpload.isMultipartContent(request)){
	        try {
	            @SuppressWarnings("unchecked")
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	            String opcion = multiparts.get(0).getString();
	       
	            
	            if("T".equals(opcion)){
	            	
//	            	Tag tag = new Tag();
//	            	String adServe = "SpringServe"; // Se cogerá del form
//	            	String type = "Desktop"; // Se cogerá del form
//	            	String stringMacro = PropertiesConf.getInstance().getProperty(adServe, type);
//	            	//String [] macros = stringMacro.split(",");
	            	
	            	//List<String> ads = PropertiesConf.getInstance().getAds();
	            	
	            	
//	            	tag.setAdName("SpringServe");
//	            	tag.setTag(multiparts.get(1).getString());
	            	
	            }else{
	            	 for(FileItem item : multiparts){
	 	                if(!item.isFormField()){
	 	                    String name = new File(item.getName()).getName();
	 	                    item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
	 	                    request.setAttribute("photoname", name);
	 	                }else{
	 	                    // here get value of other parameter which is not file type
	 	                    System.out.println(item.getFieldName()+" = "+item.getString());
	 	                }
	 	            }
	            }
	           

	           request.setAttribute("message", "File Uploaded Successfully");
	        } catch (Exception ex) {
	           request.setAttribute("message", "File Upload Failed due to " + ex);
	        }

	    }else{
	        request.setAttribute("message", "Sorry this Servlet only handles file upload request");
	    }

	    request.getRequestDispatcher("/index.jsp").forward(request, response);

	}
	
	

}
