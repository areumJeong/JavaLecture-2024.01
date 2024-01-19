package ch09_modifier.sec03_static;

import java.lang.reflect.Method;

public class Sample {
		int instanceField;
		public static final int STATIC_FIELD = 1234;
		
		void instanceMethod() {
			System.out.println("instance Method");
	}
		
		static void staticMethod() {
			
		}
}