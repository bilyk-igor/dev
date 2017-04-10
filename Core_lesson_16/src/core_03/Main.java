package core_03;

import core_03.Judge.Punishment.Prison;
import core_03.OuterClass.MemberClass;

public class Main {

	public static void main(String[] args) {
		
		Judge.Punishment punishment = new Judge.Punishment();
		
		Prison prison = new Prison();
		
		punishment.inStaticClassMethod();
		
		System.out.println();
		
		OuterClass outerClass = new OuterClass();
		
		MemberClass memberClass = outerClass.createMemberClass();
		
		memberClass.memberClassMethod();
		
		System.out.println();
		
		outerClass.createLocalClassMethod();
		System.out.println();
		
		outerClass.createAnnonymousClass();
		
		
		
		
	}
	
}
