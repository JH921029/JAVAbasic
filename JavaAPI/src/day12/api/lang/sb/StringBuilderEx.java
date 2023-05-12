package day12.api.lang.sb;

public class StringBuilderEx {
	public static void main(String[] args) {
		
		//StringBuilder - 단일 쓰레드 환경에서 사용
		//StringBuffer - 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		str = str + "program";
		sb.append("program");
		
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메서드
		//append() - 끝에 괄호 추가
		sb.append("ming");
		System.out.println(sb);
		
		
		//insert() - 중간에 추가
		sb.insert(4, " study");
		System.out.println(sb);
		
		
		//replace
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete()
		sb.delete(0, 5);//이상 미만
		System.out.println(sb);
		
		sb.deleteCharAt(0);// 인덱스번째 삭제
		System.out.println(sb);
		
		
		//거꾸로
		sb.reverse();
		System.out.println(sb);
		
		
		//toString 문저열로 형변환 StringBuㅑㅣder랑 String은 다른거라서 StringBuilder를 String으로 변환해야해
		String result = sb.toString();
		if(result.equals("gnimmargorp koo")) {
			System.out.println("true");
		}
		
		
	}

}
