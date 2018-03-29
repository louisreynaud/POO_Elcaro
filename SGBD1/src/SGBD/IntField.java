package SGBD;

import java.io.*;

import SGBD.Field;

public class IntField implements Field{
	private static final long serialVersionUID=1L;
	private final int value;
	public int getValue() {
		return value;
	}
	

	public IntField(int i) {
		value =i;
	}
	public String toString() {
		return Integer.toString(value);
	}
	public int hashCode() {
		return value;
	}
	public boolean equals(Object field) {
		return ((IntField) field).value==value;
	}
	public void serialize(DataOutputStream dos) throws IOException{
		(dos).writeInt(value);
	}
	 public boolean compare(Predicate.Op op, Field val) {

	        IntField iVal = (IntField) val;

	        switch (op) {
	        case EQUALS:
	            return value == iVal.value;
	        case NOT_EQUALS:
	            return value != iVal.value;

	        case GREATER_THAN:
	            return value > iVal.value;

	        case GREATER_THAN_OR_EQ:
	            return value >= iVal.value;

	        case LESS_THAN:
	            return value < iVal.value;

	        case LESS_THAN_OR_EQ:
	            return value <= iVal.value;

	    case LIKE:
	        return value == iVal.value;
	        }

	        return false;
	    }
	 public Type getType() {
			return getType();
		}
}
