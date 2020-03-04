package vaa;

public class Methodoverloading {
static int plusint(int x, int y) {
	return x+y;
}
static double plusdouble(double x, double y) {
	return x+y;
}
	public static void main(String[] args) {
int a=plusint(32,43);
double b=plusdouble(43.37,66.33);
System.out.println("int:" + a);
System.out.println("double:" + b);
	}

}
