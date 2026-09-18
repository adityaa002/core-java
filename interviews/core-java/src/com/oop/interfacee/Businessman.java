package com.oop.interfacee;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn money");
	}

	@Override
	public void donation() {
		System.out.println("Do donation");
	}

	@Override
	public void doParty() {
		System.out.println("Do party");
	}

	@Override
	public void helpToOthers() {
		System.out.println("Help to others");
	}
}
