package com.oop.interfacee;

public class TestBusinessMan {

	public static void main(String[] args) {
		Businessman b = new Businessman();
		
		System.out.println("BusinessMan :");
		b.donation();
		b.doParty();
		b.earnMoney();
		b.helpToOthers();
		System.out.println();

		Richman rm = new Businessman();
		System.out.println("Richman : ");
		rm.donation();
		rm.earnMoney();
		rm.doParty();
		System.out.println();

		SocialWorker sw = new Businessman();
		System.out.println("SocialWorkerr :");
		sw.helpToOthers();

	}
}
