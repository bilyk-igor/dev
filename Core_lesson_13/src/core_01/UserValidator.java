package core_01;

public class UserValidator implements Validator{

	@Override
	public void validate(Object object) throws Exception {
		
		User user = (User) object;
		 
		
		if(!user.getEmail().contains("@")){
//			throw new UserException(ValidatorMessage.EMAIL_VALIDATION_EXEPTION);
			System.err.println(user.getEmail());
			System.out.println(ValidatorMessage.EMAIL_VALIDATION_EXEPTION);
		}
		 
		
	}
	
	

}
