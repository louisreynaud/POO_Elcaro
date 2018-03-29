package SGBD;

import java.io.*;
import java.nio.channels.IllegalSelectorException;
public class Predicate implements Serializable {
	private static final long serialVersionUID =1L;
	
	private Op op;
	private int field;
	private Field operand ;
	
	public enum Op implements Serializable {
		  EQUALS, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQ,
		   GREATER_THAN_OR_EQ, LIKE, NOT_EQUALS;
		public static Op getOp(int i) {
			return values()[i];
		}
		public String toString() {
			if(this == EQUALS)
				return "=";
			if(this == GREATER_THAN)
				return ">";
			if(this == LESS_THAN)
                return "<";
            if (this == LESS_THAN_OR_EQ)
                return "<=";
            if (this == GREATER_THAN_OR_EQ)
                return ">=";
            if (this == LIKE)
                return "LIKE";
            if (this == NOT_EQUALS)
                return "<>";
            throw new IllegalStateException("immpo de lire");

		}
	}
	public Predicate(int field, Op op,Field operand) {
		this.field=field;
		this.op=op;
		this.operand= operand;
	}
	public int getField()
	{
		return this.field;
	}
	
	public Op getOp()
	{
		return this.op;
	}
	public Field getOperand()
	{
		return this.operand;
	}
	/*public boolean filter(Tuple t) {
		Field f =t.getField(field);
		return f.compare(op, operand);
	}*/
	

}
