package utils;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Monitor {
	private static boolean state = false;
	private DateTimeFormatter datetimeFormat;
	
	public Monitor() {
		datetimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	}
	public void setState(boolean state) {
		Monitor.state = state;
	}
	public void printMessage(String className, String methodName, String text) {
		if(state)
			System.out.println("(" + dtNow()  + ") " + className + "." + methodName + ": " + text);
	}
	public String getGUIConsoleMessage(String message){
		return dtNow() + ": " + message;
	}
	public String dtNow() {
		return datetimeFormat.format(LocalDateTime.now());
	}
	public void printBytes(byte[] bytes) {
		for(byte b: bytes)
			System.out.print(b);
		System.out.println("");
	}
	public void printByteAsString(byte[] bytes) {
		System.out.println(new String(bytes, StandardCharsets.UTF_8)); 
	}
}
