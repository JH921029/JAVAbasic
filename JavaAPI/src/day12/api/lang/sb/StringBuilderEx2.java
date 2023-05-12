package day12.api.lang.sb;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		
//		long start = System.currentTimeMillis();
//		
//		String str = "A";
//		for (int i = 1; i <= 300000; i++) {
//			str = str + "A";
//			
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("수행시간: "+(end - start)*0.001);
		
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		for (int i = 1; i <= 300000; i++) {
			
			sb.append("A");
		}
		
		
		System.out.println("수행시간: "+(end - start)*0.001);
		System.out.println(sb);
	}
}
