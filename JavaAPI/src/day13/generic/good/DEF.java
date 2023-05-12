package day13.generic.good;

public class DEF<T, C> {  //자동 게터세터 알트쉬프트에스

	private T t;
	private C c;
	
	
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "DEF [t=" + t + ", c=" + c + "]";
	}
	
	
	
}
