
/*Create class IPLTeam with method play. Create child classes of IPLTeam 
called as CSK, RCB. In main, call play from child class objects */
package com.quetions;

class IPLTeam {
	public void play() {
		System.out.println("Playing :");
	}
}

class CSK extends IPLTeam {

}

class RCB extends IPLTeam {

}

public class TestIPLTeam {

	public static void main(String[] args) {
		CSK c = new CSK();
		c.play();

		RCB r = new RCB();
		r.play();

	}

}
