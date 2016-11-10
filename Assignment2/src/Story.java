// Do not change anything in this file!////////////////////////////////////////////
public class Story {
	public static void intro() {
		// Intro 
		System.out.println("-------------------------------------------------------");
		System.out.println("The Worried Wizard - A choose your own adventure game.");
		System.out.println("-------------------------------------------------------");
		System.out.println("At each prompt enter the number for the action you choose to take.");
		System.out.println();
	}

	public static void a() {
		// A 
		System.out.println("A: You are a wizard, and fairly adept in the art of sorcery, but always a bit  ");
		System.out.println("   worried.  You go out for a stroll to calm your nerves when you are confronted");
		System.out.println("   by your arch-nemesis, Malachy, who threatens to kill you unless you help with");
		System.out.println("   his evil plans.  What should you do? ");
		System.out.println("   Type 1 to make yourself invisible(B), Type 2 to cast a spell on Malachy (E), ");
		System.out.println("   Type 3 to agree to help Malachy(H)");
	}

	public static void b() {
		// B 
		System.out.println("B: You make yourself invisible but Malachy quickly retaliates by throwing");
		System.out.println("   anti-invisibility dust into the air. What now?");
		System.out.println("   Type 1 to stay still and hope the dust doesn't work(C).  ");
		System.out.println("   Type 2 to quickly move away from the dust(D).");
	}

	public static void c() {
		// C 
		System.out.println("C: The dust settles but doesn't reveal you to Malachy.  He eventually");
		System.out.println("   departs angrily, and you are left to worry about your next encounter.");
	}

	public static void d() {
		// D 
		System.out.println("D: Malachy hears your steps as you attempt to move away from the dust.  He");
		System.out.println("   casts a dizziness spell on you, which causes you to fall and become visible.");
		System.out.println("   He binds your hands, takes you captive, and uses you to orchestrate his");
		System.out.println("   sinister plan.");
	}

	public static void e() {
		// E 
		System.out.println("E: You cast the spell, but it doesn't appear to work. What should you do?");
		System.out.println("   Type 1 cast the spell again(F), 2 to run away(G).");
	}

	public static void f() {
		// F
		System.out.println("F: Malachy turns into a toad and quickly hops away.  You have ");
		System.out.println("   won this time, but must continue to worry about Malachy's return.");
	}

	public static void g() {
		// G
		System.out.println("G: You turn to run away, but Malachy casts a spell on you while your back is turned, and you die.");
	}
	
	public static void h() {
		// H 
		System.out.println("H: You agree to help Malachy, and he takes you to his lair.  What he is planning");
		System.out.println("   is even worse than you could have imagined.  He warns you that if you try to");
		System.out.println("   escape he will place you under the curse of eternal slumber.  While his back");
		System.out.println("   is turned you decide to take your chances and try to escape anyway.");
		System.out.println("   Type 1 to jump out the window(I), Type 2 to run out the door(J).");
	}

	public static void i() {
		// I 
		System.out.println("I: You are under the curse of eternal slumber.  Nothing you do can break the curse.");
		System.out.println("   Type any number to try to break the curse(I).");
	}

	public static void j() {
		// J 
		System.out.println("J: You run out the door and miraculously escape using a teleportation spell.  You live ");
		System.out.println("   another day but are forced to worry about who Malachy will use instead.");
	}

	public static void k() {
		// K 
		System.out.println("K: The End.  Type any number to continue.");
	}
}
