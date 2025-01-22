package com.olexyn.min.obj;

public class InstantCube {

	InstantSide x1;

	public InstantCube(int sideSize, int sidesCount) {
		x1 = new InstantSide(sideSize, false);
		if (sidesCount == 2) {
			for (int i = 0; i < x1.getSide().length; i++) {
				x1.getSide()[i] = new InstantSide(sideSize, true);
			}
		}
		if (sidesCount == 3) {
			for (int i = 0; i < sideSize; i++) {
				x1.getSide()[i] = new InstantSide(sideSize, false);
				for (int j = 0; j < sideSize; j++) {
					x1.getSide()[i].getSide()[j] = new InstantSide(sideSize, true);
				}
			}
		}
	}

}
