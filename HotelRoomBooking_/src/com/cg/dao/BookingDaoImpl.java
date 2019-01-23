package com.cg.dao;

import java.util.List;


import com.cg.bean.BookingDetail;
import com.cg.bean.Hotel;
import com.cg.exception.HotelException;

public class BookingDaoImpl implements BookingDao {
BookingDetail details;
List<Hotel> deptList=null;
	@Override
	public List<Hotel> getHotelList() {
	
	
	Hotel hotel1=new Hotel(1010, "Vivanta By Taj", "5 Star", 8000, 25);
	Hotel hotel2=new Hotel(1100, "The Lalit International", "4.7 Star", 8500, 20);
	Hotel hotel3=new Hotel(0100, "Courtyard By Mariott", " 4.6 Star", 7000, 30);
	Hotel hotel4=new Hotel(0010, "The Oberoi", "7 Star", 11000, 15);

	  deptList.add(1,hotel1);
	  deptList.add(2,hotel2);
	  deptList.add(3,hotel3);
	  deptList.add(4,hotel4);
		return deptList;
	}

	@Override
	public boolean addBookingDetails(BookingDetail detail) throws HotelException {
		boolean success = false;
		details=new BookingDetail();
		details.setId(detail.getId());
		details.setHotelId(detail.getHotelId());
		details.setCustName(detail.getCustName());
		details.setFromDate(detail.getFromDate());
		details.setToDate(detail.getToDate());
		details.setNoOfRooms(detail.getNoOfRooms());
		if(details!=null)
			success=true;
	
		return success;
	}

	// get single hotel by using it id
	@Override
	public Hotel getHotel(int hotelId) {
        // must exist
		Hotel result=null;
		for(Hotel hotel:deptList) {
		if(hotel.getId()==hotelId) {
			result=hotel;
		}
		}
		return result;
	}

}
