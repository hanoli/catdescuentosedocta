package com.hanoli.comun.utils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hanoli.comun.exception.UtilsException;

public class StringUtils {
	
	private static AnnotationConfigApplicationContext ctx;
	
	public static <T> T getBean(Class<T> clase, Class<?> config) throws UtilsException {
		
		try {
			
			if(ctx == null) {
				ctx = new AnnotationConfigApplicationContext();
				ctx.register(config);
				ctx.refresh();
			}
		
			return ctx.getBean(clase);
			
		} catch (Exception e) {
			throw new UtilsException(e);
		}
		
		
		
	}
	

}
