package org.patomediatags.test;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;
import static org.patomediatags.operations.ProcessTag.getUrlParams;;

public class UrlTest extends TestCase {
	
	String url = "https://www.google.es/search?q=class+uri+java&oq=class+uri+java&aqs=chrome..69i57j0l5.11791j0j4&sourceid=chrome&ie=UTF-8";
	
	

	Map<String, List<String>> parametros = getUrlParams(url);
//	parametros.
//	System.out.println(parametros);
}
