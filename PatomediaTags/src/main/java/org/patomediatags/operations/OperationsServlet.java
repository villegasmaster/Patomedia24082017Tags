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
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


/**
 * Servlet implementation class ServletPrueba
 */
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String UPLOAD_DIRECTORY = "C:/PatomediaTags";
       
   

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
	protected void doPost(RequestContext req, HttpServletResponse response) throws ServletException, IOException {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		try {

		// req es la HttpServletRequest que recibimos del formulario.
		// Los items obtenidos serán cada uno de los campos del formulario,
		// tanto campos normales como ficheros subidos.
		List<FileItem> items = upload.parseRequest(req);

		// Se recorren todos los items, que son de tipo FileItem
		for (Object item : items) {
		   FileItem uploaded = (FileItem) item;

		   // Hay que comprobar si es un campo de formulario. Si no lo es, se guarda el fichero
		   // subido donde nos interese
		   if (!uploaded.isFormField()) {
		      // No es campo de formulario, guardamos el fichero en algún sitio
		      File fichero = new File("/tmp", uploaded.getName());
		      
				uploaded.write(fichero);
			
		   } else {
		      // es un campo de formulario, podemos obtener clave y valor
		      String key = uploaded.getFieldName();
		      String valor = uploaded.getString();
		   }
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
