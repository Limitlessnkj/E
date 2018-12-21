package hms.capg;

import hms.capg.UserBean;
import hms.capg.EMSException;

public interface LoginAuthenticationDao {
	UserBean getUser(String userId, String userPassword) throws EMSException;
}
