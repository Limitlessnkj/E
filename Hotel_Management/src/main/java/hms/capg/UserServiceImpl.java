package hms.capg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hms.capg.HotelBean;
import hms.capg.UserDao;
@Service("userService")
public class UserServiceImpl implements UserService {
@Autowired
UserDao userDao;

	//@Override
	public List<HotelBean> getHotelList(String city) {
		return userDao.getHotelList(city);
	}

}
