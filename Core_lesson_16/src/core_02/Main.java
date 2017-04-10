package core_02;

import core_02.OuterClass.MemberClass;

public class Main {
	public static void main(String[] args) {
		
		
		Judge.Punishment  punishment = new Judge.Punishment();
		
		punishment.inStaticClass();
		
		OuterClass outerClass = new OuterClass();
		MemberClass memberClass = outerClass.createMemberClass();
		System.out.println();
		
		outerClass.createLocalClass();
		
		System.out.println();
		
		outerClass.createAnnonymousClass();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
