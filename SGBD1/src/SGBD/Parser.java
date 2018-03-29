package SGBD;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Parser {
	static boolean explain = false;
	
	public static Predicate.Op getOp(String s) throws SGBD.ParsingException{
		
		if(s.equals("="))
			return Predicate.Op.EQUALS;
		if (s.equals(">"))
            return Predicate.Op.GREATER_THAN;
        if (s.equals(">="))
            return Predicate.Op.GREATER_THAN_OR_EQ;
        if (s.equals("<"))
            return Predicate.Op.LESS_THAN;
        if (s.equals("<="))
            return Predicate.Op.LESS_THAN_OR_EQ;
        if (s.equals("LIKE"))
            return Predicate.Op.LIKE;
        if (s.equals("~"))
            return Predicate.Op.LIKE;
        if (s.equals("<>"))
            return Predicate.Op.NOT_EQUALS;
        if (s.equals("!="))
            return Predicate.Op.NOT_EQUALS;
        
        throw new SGBD.ParsingException("ERROR Predicate"+s);
		
	}

}
