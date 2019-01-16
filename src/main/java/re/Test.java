package re;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	/*
	 * 注解的属性：
	 * 注解可以又多个属性，如果属性名为value，则在使用时，可以不指定属性名
	 * 只有一个属性时
	 */
	public String value();
	
	
}
