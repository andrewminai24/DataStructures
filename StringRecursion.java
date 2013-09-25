
public class StringRecursion {
	
	public static void printReverse(String str){
		// Handle null and blank string scenarios
		if (str == null || str.length() == 0) return;
		//Base case
		int lnth = str.length();
		if (lnth ==1) {System.out.print(str); return; }
		//Recursive calls
		else  printReverse(str.substring(1));
		System.out.print(str.substring(0,1));
		
	}
	
	public static String reverse(String str){
		// Handle null and blank string scenarios
		if (str == null || str.length() == 0) return str;
		int lnth = str.length();
		//Base case
		if (lnth ==1) return str;
		if (lnth ==2) return str.substring(1,2)+str.substring(0,1);
		//Recursive calls
		return str.substring(lnth-1,lnth) + reverse(str.substring(1,lnth-1)) + str.substring(0,1);
		
	}
	
	public static String trim(String str){
		// Handle null and blank string scenarios
		if (str == null || str.length() == 0) return str;
		//Base Case ---- No more trimming required
		if (!str.substring(0,1).equals(" ") && !str.substring(str.length()-1,str.length()).equals(" ")) return str;		
		//Recursive calls
		if (str.substring(0,1).equals(" ") && str.substring(str.length()-1,str.length()).equals(" ") && str.length()>1) return trim(str.substring(1,str.length()-1));
		if (str.substring(0,1).equals(" ")) return trim(str.substring(1,str.length()));
		else return trim(str.substring(0,str.length()-1));
	}
	
	
	public static void main(String args[]){
		String none = null;
		String blank = "";
		String str = "Kalpan";
		String character = "H";
		String trim1 = "  Helloworld";
		String trim2 = "  Helloworld   ";
		String trim3 = "Hello world ";
		
		System.out.println("printReverse() Method Testing--------------");
		System.out.print("Reverse of string '" + str+ "' is: ");printReverse(str);
		System.out.println();
		System.out.print("Reverse of blank is: ");printReverse(blank);
		System.out.println();
		System.out.print("Reverse of null is: ");printReverse(none);
		System.out.println();
		System.out.print("Reverse of single letter string '"+character+"' is: ");printReverse(character);
		System.out.println();
		
		System.out.println("reverse() Method Testing--------------");
		System.out.print("Reverse of string '" + str+ "' is: ");System.out.print(reverse(str));
		System.out.println();
		System.out.print("Reverse of blank is: ");System.out.print(reverse(blank));
		System.out.println();
		System.out.print("Reverse of null is: ");System.out.print(reverse(none));
		System.out.println();
		System.out.print("Reverse of single letter string '"+character+"' is: ");System.out.print(reverse(character));
		System.out.println();
		
		System.out.println("trim() Method Testing--------------");
		System.out.println(trim(trim1));
		System.out.println(trim(trim2));
		System.out.println(trim(trim3));
		
	}
}
