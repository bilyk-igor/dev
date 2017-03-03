package core_03;

public class C implements A, B{

	@Override
	public void one() {
		// TODO Auto-generated method stub
		B.super.one();
		A.super.one();
	}
	
	

}
