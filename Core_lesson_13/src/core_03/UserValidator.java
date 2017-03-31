package core_03;

public class UserValidator implements Validator {

	@Override
	public void validate(Object object) throws Exception {

		User user = (User) object;

		try {
			
			System.out.println("enter email again");
			String email = Main.scanner.next();
			
			if (user.getLogin().equalsIgnoreCase("lambo")) {
				throw new UserException(ValidationMessages.LOGIN_VALIDATION_EXCEPTION);
			}else if(!user.getEmail().contains("@")){
				throw new UserException(ValidationMessages.EMAIL_VALIDATION_EXCEPTION);
			}else if(!user.getEmail().equals(email)){
				throw new UserException(ValidationMessages.CONFIRM_EMAIL_EXCEPTION);				
			}

		} catch (UserException e) {

			System.out.println(e.getMessage());

		}
	}

}
