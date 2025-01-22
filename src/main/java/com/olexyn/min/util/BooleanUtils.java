package com.olexyn.min.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BooleanUtils {
	
	public static boolean isTrue(Object obj) {
		return obj instanceof Boolean && (Boolean) obj;
	}
}
