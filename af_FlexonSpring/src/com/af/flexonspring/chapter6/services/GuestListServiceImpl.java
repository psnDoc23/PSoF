package com.af.flexonspring.chapter6.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.af.flexonspring.chapter6.domain.Guest;

@SuppressWarnings("serial")
public class GuestListServiceImpl implements Serializable, GuestListService 
{
	public List<Guest> getGuestList() 
	{
		List<Guest> guestList = new ArrayList<Guest>();
		
		guestList.add(new Guest("Guest One"));
		guestList.add(new Guest("Guest Two"));
		guestList.add(new Guest("Guest Three"));
		guestList.add(new Guest("Guest Four"));
		
		return guestList;
	}
}