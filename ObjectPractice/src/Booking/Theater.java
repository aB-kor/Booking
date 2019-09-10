package Booking;

public class Theater {
	
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		//관람객의 가방에 초대권이 있으면
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();		//판매원이 파는 티켓하나 반환
			audience.getBag().setTicket(ticket);							//반환된 티켓을 세팅
		}else {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();		//판매원이 파는 티켓하나 반환
			audience.getBag().minusAmount(ticket.getFee());					//관람객 금액차감
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());		//판매원 금액증감
			audience.getBag().setTicket(ticket);							//반환된 티켓을 세팅
		}
	}
	
}
