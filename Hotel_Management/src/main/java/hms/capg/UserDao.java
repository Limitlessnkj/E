package hms.capg;

import java.util.List;

import hms.capg.HotelBean;

public interface UserDao {
	public List<HotelBean> getHotelList(String city);
}
