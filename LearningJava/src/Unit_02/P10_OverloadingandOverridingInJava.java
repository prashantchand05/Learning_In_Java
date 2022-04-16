package Unit_02;

public class P10_OverloadingandOverridingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingandOverridingInJava obj = new OverloadingandOverridingInJava();
		System.out.println("add() with 2 parameters");
		System.out.println(obj.add(4,6));
		
		System.out.println("add() with 3 parameters");
		System.out.println(obj.add(4,6,7));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(1,2));

	}

}
class OverloadingandOverridingInJava() {
	
	
	
	
	
}