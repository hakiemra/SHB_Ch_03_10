package com.hakiemra.ch09;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "This is your random day!";
	}
}
// Will throw an ERROR
// No qualifying bean of type 'com.hakiemra.ch09.FortuneService' available
// : expected single matching bean but found 2: happyFortuneService,randomFortuneService