//iphone model Example...
package com.multilevel;

class Iphone6 {
	void makeCalls() {
		System.out.println("Calling functionality");
	}
}

class Iphone10 extends Iphone6 {
	void unlockPhoneUsingFaceId() {
		System.out.println("phone Unlocked");
	}
}

class Iphone12 extends Iphone10 {
	void support5GNetwork() {
		System.out.println("5G Network");
	}

	public static void main(String[] args) {
		Iphone12 i = new Iphone12();
		i.makeCalls();
		i.unlockPhoneUsingFaceId();
		i.support5GNetwork();
	}
}
