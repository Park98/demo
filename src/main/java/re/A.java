package re;

public class A {
	public void f1(){
		System.out.println("A's f1");
	}
	public String f2(){
		System.out.println("A's f2");
		return "I am f2";
	}
	public void f3(String s1,int a1){
		System.out.println("A'a f3");
		System.out.println("s1:"+s1+"a1:"+a1);
	}

}
