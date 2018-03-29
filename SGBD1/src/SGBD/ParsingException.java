package SGBD;

import java.lang.*;
public class ParsingException extends Exception {
	public ParsingException(String string) {
		super(string);
	}
	public ParsingException(Exception e) {
		super(e);
	}
	
	private static final long serialVersionUDI =1L;

}
