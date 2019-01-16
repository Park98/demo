package re;

import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Scanner scanner=new Scanner(System.in);
		String className=scanner.nextLine();
		System.out.println("className:"+className);
		/**
		 * 加载类：
		 * jvm（Java）虚拟机委托类加载器
		 * 查找类对的字节码文件，然后将字节码文件的内容读到方法区
		 * 然后将这些内容转换成一个对应的class对象
		 * 
		 */
		Class clazz = Class.forName(className);
		//将类实例化
		Object obj = clazz.newInstance();
		System.out.println("obj:"+obj);
		/**
		 * 获得该类的所有方法的信息
		 * Method对象封装可方法的所有信息，比如方法名
		 * 参数类型 返回类型等等
		 */
		
		Method[] methoods = clazz.getDeclaredMethods();
        for(Method mh:methods){
        	//调用方法
        }
	}

}
