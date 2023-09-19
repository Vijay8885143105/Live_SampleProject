package sep8;

public class Sample {
	public static int add(int x,int y) {
		int z=x+y;
		return z;
	}
	public static String Verify_strings(String str1,String str2) {
		String res ="";
		if (str1.equalsIgnoreCase(str2)) {			
				res="strings are equal";
			}
			else
			{
				res="strings are not equal";
		}
		return res;		
	}
	public static boolean compare_values(int a,int b) {
		if (a==b) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int z=Sample.add(100, 400);
		System.out.println(z);
		String res =Sample.Verify_strings("India", "india");
		System.out.println(res);
		boolean x =Sample.compare_values(100, 100);
		System.out.println(x);
		

	}

}
