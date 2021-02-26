package com.hakiemra.ch05;

public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "This is your lucky day!";
	}
}
