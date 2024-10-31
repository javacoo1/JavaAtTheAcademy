package com.jh.package1;

import com.jh.accessmf.Human;

public class TestMf extends Human {

	@Override
	public void info() {
		super.info();
		name = "jh";
		age = 10;
//		addr = "아사다마오";
//		birth = "11/11";
	}
}
