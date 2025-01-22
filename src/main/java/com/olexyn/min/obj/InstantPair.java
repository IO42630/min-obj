package com.olexyn.min.obj;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InstantPair {

	Instant instant;
	long value;

}
