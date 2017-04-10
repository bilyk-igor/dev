package core_04;

import core_04.OuterClass.MemberClass;
import core_04.Judge.Punishment.Prison;

public class Main {

	public static void main(String[] args) {
		
		Judge.Punishment punishment = new Judge.Punishment();
		
		punishment.staticClassMethod();
		
		Prison prison = new Prison();
		
		OuterClass outerClass = new OuterClass();
		
		MemberClass memberClass = outerClass.createMemberClass();	
		
		memberClass.memberClassMethod();
		
		
		
		
		
		
		
		
	}
	
}
