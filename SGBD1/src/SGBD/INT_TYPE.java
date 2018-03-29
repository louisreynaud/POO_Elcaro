package SGBD;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.ParseException;

public class INT_TYPE extends Type {
	
		public int getLen() {
			return 4;
		}
		
		public Field parse(DataInputStream dis) throws ParseException{
			try {
				return new IntField(dis.readInt());
			}catch(IOException e) {
				throw new ParseException("ERROR", 0);
			}
		}
		
		
	}


