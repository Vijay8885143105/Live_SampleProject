package sep8;

public class Java_ConvertionFnctns {

	public static void main(String[] args) {
		//How to convert integer type to string
		//Value of
		int a = 234;
		int b = 567;
		String x =String.valueOf(a);
		String y =String.valueOf(b);
		System.out.println(x.concat(y));
		//How to convert string type to integer
		//parseint
		String str1 = "24";
		String str2 = "26";
		int t1 =Integer.parseInt(str1);
		int t2 =Integer.parseInt(str2);
		System.out.println(t1+t2);
		System.out.println(t1*t2);
		System.out.println(t1/t2);
		System.out.println(t1%t2);




	}

}
