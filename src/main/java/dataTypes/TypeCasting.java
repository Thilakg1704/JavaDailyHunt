package dataTypes;

public class TypeCasting {
	public static void main(String args[]) {
		
		
		//Implicit Type casting
		
		int number = 100;
		double numberdo = number; // int to double
		System.out.println("Implicit Converting");
		System.out.println("====================");
		System.out.println("Integer value: "+number);
		System.out.println("Double: "+numberdo);
		
		System.out.println("-----------------------");
		//Explicit Converting 
		double doublenum = 20.89;
		int intnum = (int)doublenum;
		System.out.println("Explicit Converting");
		System.out.println("====================");
		System.out.println("Double: "+ doublenum);
		System.out.println("Integer: "+intnum);
		
	}
}
