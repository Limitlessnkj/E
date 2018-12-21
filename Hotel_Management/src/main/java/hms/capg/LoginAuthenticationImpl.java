package hms.capg ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hms.capg.UserBean;
import hms.capg.LoginAuthenticationDao;
import hms.capg.LoginAuthenticationDaoImpl;
import hms.capg.EMSException;
@Service
public class LoginAuthenticationImpl implements LoginAuthentication {
	@Autowired
	LoginAuthenticationDao loginAuthenticationDao;
	public LoginAuthenticationImpl() {
	loginAuthenticationDao=new LoginAuthenticationDaoImpl();
	}

	//@Override
	public UserBean getUser(String userId, String userPassword) throws EMSException {
		return loginAuthenticationDao.getUser(userId, userPassword);
	}

}
