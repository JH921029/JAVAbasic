package quiz09;

public class Main {

	public static void main(String[] args) {
		SuperSonicAp ssa = new SuperSonicAp("종이비행기");
		ssa.flyMode =1 ;
		System.out.println(ssa.info());
		ssa.fly();
		
		ssa.flyMode =0 ;
		System.out.println(ssa.info());
		ssa.fly();


	}
}
