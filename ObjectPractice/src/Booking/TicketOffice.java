package Booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	private Long amount;										//판매금액
	private List<Ticket> tickets = new ArrayList<Ticket>();		//교환해줄 티켓들
	
	public TicketOffice(Long amount, Ticket ...tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
		
	}
	
	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}
	
	//컬렉션에서 맨 첫번째 위치에 저장된 ticket을 반환함
	public Ticket getTicket() {
		return tickets.remove(0);
	}
	
	//금액 증가
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
	//금액 차감
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
}
