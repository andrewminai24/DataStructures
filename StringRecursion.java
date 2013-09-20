
public class StringRecursion {
	
	public static void printReverse(String str){
		if (str == null || str.length() == 0) return;
		
		int lnth = str.length();
		if (lnth ==1) {System.out.print(str); return; }
		
		else  printReverse(str.substring(1));
		System.out.print(str.substring(0,1));
		
	}
	
	public static String reverse(String str){
		if (str == null || str.length() == 0) return str;
		int lnth = str.length();
		if (lnth ==1) return str;
		if (lnth ==2) return str.substring(1,2)+str.substring(0,1);

		return str.substring(lnth-1,lnth) + reverse(str.substring(1,lnth-1)) + str.substring(0,1);
		
	}
	
	public static String trim(String str){
		if (str == null || str.length() == 0) return str;
		
		if (!str.substring(0,1).equals(" ") && !str.substring(str.length()-1,str.length()).equals(" ")) return str;
		if (str.substring(0,1).equals(" ") && str.substring(str.length()-1,str.length()).equals(" ") && str.length()>1) return trim(str.substring(1,str.length()-1));
		if (str.substring(0,1).equals(" ")) return trim(str.substring(1,str.length()));
		else return trim(str.substring(0,str.length()-1));
	}
	
	
	public static void main(String args[]){
		String none = null;
		String blank = "";
		System.out.println(trim("Hello World    "));
		
		System.out.println(reverse("H"));
		printReverse("kalpan");
		
	}
}
