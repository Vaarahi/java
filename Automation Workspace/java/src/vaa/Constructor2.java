package vaa;

public class Constructor2 {
int modelyear;
String modelname;
public Constructor2(int year, String name) {
	modelyear=year;
	modelname=name;
}
	public static void main(String[] args) {
Constructor2 obj=new Constructor2(1969, "Mustang");
System.out.println(obj.modelyear + " " + obj.modelname);
	}

}
