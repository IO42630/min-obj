package com.olexyn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstantSide {



    private InstantSide[] side;
    private InstantPair[] values;

    public InstantSide(int sideSize, boolean isValues) {
        if (isValues) {
            this.values = new InstantPair[sideSize];
        } else {
            this.side = new InstantSide[sideSize];
        }

    }

}
