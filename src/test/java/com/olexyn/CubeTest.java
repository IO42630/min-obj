package com.olexyn;

import org.junit.Test;

public class CubeTest {

	@Test
	public void makeCube() {

		int side = 180;
		long maxLong = Long.MAX_VALUE;
		long restLong = maxLong / side / side / side;

		int maxInt = Integer.MAX_VALUE;
		int restInt = maxInt / side / side / side;

		var cube1 = new InstantCube(side, 3);

		int br = 0;
	}
}
