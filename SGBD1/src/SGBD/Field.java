package SGBD;

import java.io.*;
import java.util.*;

public interface Field extends Serializable{

	void serialize(DataOutputStream dos) throws IOException;
	public boolean compare(Predicate.Op op, Field value);
	public Type getType();
	public int hashCode();
	public boolean equals(Object field);
	
	public String toString();
}
