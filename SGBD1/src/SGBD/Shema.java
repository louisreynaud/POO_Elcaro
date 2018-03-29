package SGBD;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public class Shema implements Serializable {
	
	public static class TDItem implements Serializable {
		private static final long serialersionUID =1L;
	
	public final Type filedType;
	
	public final String filedName;
	
	public TDItem(Type t,String n) {
		
		this.filedName= n;
		this.filedType= t;
	}
	public String toString() {
		return filedName+"("+filedType+")";
	}
	
	}
	public Iterator<TDItem> iterator(){
		return Arrays.asList(this.tdItems).iterator();
	}
	private static final long serialersionUID =1L;
	private final TDItem[] tdItems;
	
	public Shema(Type[] typeAr, String[] fieldAr) {
		tdItems = new TDItem[typeAr.length];
		for(int i=0;i<typeAr.length;i++) {
			tdItems[i] = new TDItem(typeAr[i],fieldAr[i]);
		}
	}
	public Shema(Type[] typeAr) {
		tdItems =new TDItem[typeAr.length];
		for(int i=0 ;i<typeAr.length;i++) {
			tdItems[i]= new TDItem(typeAr[i], "");
		}
	}
	public int numFields() {
		return tdItems.length;   //  a verifier !!!!
	}
	
	public String getFieldName(int i) {
		return tdItems[i].filedName;
	}
	
	public Type getFieldType(int i) {
		return tdItems[i].filedType;
	}
	
	public int fieldNameToIndex(String name) {
		for(int i=0;i<numFields();i++) {
			if(tdItems[i].filedName != null && tdItems[i].filedName.equals(name))
			return i;
		}
	}
	
	
	}
	
	

