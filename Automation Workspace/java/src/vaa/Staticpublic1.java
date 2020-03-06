package vaa;

public class Staticpublic1 {
static void staticmethod() {
	System.out.println("static methods can be called without creating objects");
}
public void publicmethod() {
	System.out.println("public methods must be called without creating projects");
}
	public static void main(String[] args) {
staticmethod();
Staticpublic1 obj=new Staticpublic1();
obj.publicmethod();
}

}
