package Booking;

public class TicketSeller {
	private TicketOffice ticketOffice;		//티켓 판매원은 자신이 일하는 매표소를 알아야함
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
}
