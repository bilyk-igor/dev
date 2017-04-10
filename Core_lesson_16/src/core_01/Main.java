package core_01;

import core_01.OuterClass.MemberClass;

public class Main {

	public static void main(String[] args) {
		
		Judge.Punishment punishment = new Judge.Punishment();
		
		punishment.giveThePunishment();
		
		Judge.Punishment.Fine fine = new Judge.Punishment.Fine();
		
		Judge.Punishment.Prison prison = new Judge.Punishment.Prison();
		
		OuterClass outerClass = new OuterClass();
		
		MemberClass memberClass = outerClass.createMemberClass();
		
		outerClass.createLocalClass();
		
		outerClass.createAnnonymousClass();
		
		
		
	}
	
}

