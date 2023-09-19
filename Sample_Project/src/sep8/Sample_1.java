package sep8;

public class Sample_1 {
	public  int add(int x ,int y) {
		int z=x+y;
		return z;
	}
	public String verify_strings(String str1,String str2)
	{
		String res="";
		if (str1.equalsIgnoreCase(str2)) {
			res="strings are equal";
		}
		else
		{
			res="strings are not equal";
		}
		return res;
	}
	public boolean compare_values(int a ,int b)
	{
		if (a==b) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
    Sample_1 obj =new Sample_1();
    int a =obj.add(300, 500);
    System.out.println(a);
    String res =obj.verify_strings("Selenium","selenium");
    System.out.println(res);
    boolean z =obj.compare_values(200, 002);
    System.out.println(z);
	}

}
