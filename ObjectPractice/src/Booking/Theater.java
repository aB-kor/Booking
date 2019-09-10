package Booking;

//수정된 Thearter 에선 ticketOffice에 직접 접근하지 않는다. 
//TicketSeller에서 ticketOffice에 접근
public class Theater {
	
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
	
}
