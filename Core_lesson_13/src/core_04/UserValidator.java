package core_04;

import core_01.UserException;

public class UserValidator implements Validator {

	@Override
	public void validate(Object object) throws Exception {

		User user = (User) object;

		String loginFromDB = "mamba";

		try {

			if (user.getLogin().equalsIgnoreCase(loginFromDB)) {
				throw new UserException(ValidatorMessges.LOGIN_ALREADY_EXIST);
			}else if(!user.getEmail().contains("@")){
				throw new UserException(ValidatorMessges.EMAIL_VALIDATION_EXCEPTION);
			}

		} catch (UserException e) {

			System.out.println(e.getMessage());

		}

	}

}
