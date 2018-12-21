package hms.capg;

import java.util.List;

import hms.capg.HotelBean;

public interface UserService {
public List<HotelBean> getHotelList(String city);
}
