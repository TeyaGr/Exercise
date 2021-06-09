package Generics;

public class GenericClassTest <T>{

	/// box generic class hm
	private T t;
	public GenericClassTest(){
	
}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public GenericClassTest(T t) {
		super();
		this.t = t;
	}
	public static void main(String[] args) {
		
		GenericClassTest<Integer> box = new GenericClassTest<Integer>();
		box.setT(1);
		System.out.println(box.getT());
		GenericClassTest<String> boxx = new GenericClassTest<String>();
      boxx.setT("Helloworld");
      		System.out.println(boxx.getT());
	}
}