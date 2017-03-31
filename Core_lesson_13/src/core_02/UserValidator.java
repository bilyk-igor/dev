package core_02;

public class UserValidator implements Validator{

	@Override
	public void validate(Object object) throws Exception {

		User user = (User)object;
		try{
		if(!user.getEmail().contains("@")){
			throw new UserException(ValidateMessages.EMAIL_VALIDATION_EXCEPTION);
		}
		else if(user.getLogin().equals("con")){
			throw new UserException(ValidateMessages.LOGIN_VALIDATION_EXCEPTION);
		}
		}catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
