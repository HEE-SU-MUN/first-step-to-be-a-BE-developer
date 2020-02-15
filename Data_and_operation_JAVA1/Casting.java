
public class Casting {

	public static void main(String[] args) {
	double a = 1.1;
	double b = 1;
	double b2 = (double)1;
	System.out.println(b2);
	
	//int c = 1.1;
	int d = (int) 1.1;
	double e = 1.1;
	System.out.println(d);

	String f = Integer.toString(1);
	System.out.println(f.getClass());
	}

}
