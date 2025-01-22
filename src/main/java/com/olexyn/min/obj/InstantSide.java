package com.olexyn.min.obj;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstantSide {

	private InstantSide[] side;
	private InstantPair[] values;

	public InstantSide(int sideSize, boolean isValues) {
		if (isValues) {
			values = new InstantPair[sideSize];
		} else {
			side = new InstantSide[sideSize];
		}

	}

}
