package com.cheen.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cheen.dao.TicketDao;
import com.cheen.pojo.Ticket;

public class TicketDaoImpl implements TicketDao {
	
	public List<Ticket> getTickets() {
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		Ticket ticket1 = new Ticket();
		ticket1.setTid(121);
		ticket1.setDeparture_add("SHN");
		ticket1.setDestination_add("LOA");
		ticket1.setDeparture_time("1305");
		ticket1.setArrival_time("1825");
		ticket1.setPrice(67.8);
		ticket1.setUname_code("C93832");
		tickets.add(ticket1);
		
		Ticket ticket2 = new Ticket();
		ticket2.setTid(122);
		ticket2.setDeparture_add("HND");
		ticket2.setDestination_add("ALA");
		ticket2.setDeparture_time("0640");
		ticket2.setArrival_time("1135");
		ticket2.setPrice(127);
		ticket2.setUname_code("D85414");
		tickets.add(ticket2);
		
		Ticket ticket3 = new Ticket();
		ticket3.setTid(123);
		ticket3.setDeparture_add("JFK");
		ticket3.setDestination_add("DAM");
		ticket3.setDeparture_time("0755");
		ticket3.setArrival_time("2235");
		ticket3.setPrice(458);
		ticket3.setUname_code("A58451");
		tickets.add(ticket3);
		
		return tickets;
	}

}
