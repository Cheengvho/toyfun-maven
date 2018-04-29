package com.cheen.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import com.cheen.dao.impl.TicketDaoImpl;
import com.cheen.pojo.Ticket;

@Controller
public class TicketController {
	@RequestMapping(value="showList")
	public String getShowList() {
		return "showList";
	}
	
	@RequestMapping(value="TicketAjaxDemo")
	public @ResponseBody Collection<Ticket> TicketTest() {
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
	
	@RequestMapping(value="TicketDaoImplTest")
	public ModelAndView TicketController() {
		TicketDaoImpl dao = new TicketDaoImpl();
		List<Ticket> tickets = dao.getTickets();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/showModelAndView");
		mv.addObject("tickets",tickets);
		return mv;
		
	}
	
}
