package presentation;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Settings {
	/**
	 * Ubicar este método estático en la clase AttendancesService_ServiceLocator.java en la siguiente línea (regularmente la línea número 27):
	 * private java.lang.String BasicHttpBinding_AttendanceService_address = Settings.getUrlService();
	 * @return
	 */
	public static String getUrlService() 
	{
		String UrlService = new String();
		try
		{
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	        Document doc = docBuilder.parse (new File("Configuracion.xml"));
	        doc.getDocumentElement().normalize();
	        Element eElement =  (Element) doc.getElementsByTagName("configuracion").item(0);
	        UrlService = eElement.getElementsByTagName("rutaServicio").item(0).getTextContent().trim();
		}
		catch(Exception exc)
		{
			System.out.println("Log - CANNOT GET THE URL SERVICE FROM Configuracion.xml: " + exc.getMessage());
		}
		return UrlService;
	}
}
