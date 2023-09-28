package utility;
import java.time.LocalDate;

import org.apache.tomcat.jni.Local;

public class FechaActual {
	
	public static String getFechaActual() {
		return LocalDate.now().toString();
	}

}
