package SGBD;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.ParseException;

public class STRING_TYPE extends Type {
	public int getLen() {
		return STRING_LEN+4;
	}
	public Field parse(DataInputStream dis) throws ParseException{
		
	
	try {
		
		int strLen =dis.readInt();
		byte bs[]= new byte[strLen];
		dis.read(bs);
		dis.skipBytes(STRING_LEN-strLen);
		return new StringField(new String(bs),STRING_LEN);
	}catch(IOException e) {
		throw new ParseException("ERROR1",0);
	}
	
	}
	public static final int STRING_LEN =128;

}

