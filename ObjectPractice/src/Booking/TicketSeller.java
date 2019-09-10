package Booking;

public class TicketSeller {
	private TicketOffice ticketOffice;		//티켓 판매원은 자신이 일하는 매표소를 알아야함
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	//이제 Audience의 인터페이스에만 의존하도록 변경
	//하지만 여전히 TicketOffice의 자율권침해함. TicketOffice에 있는 티켓을 마음대로 꺼내서, Audience에 팔고, 받은돈을 마음대로 TicketOffice에 넣어버림
	//ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); -> ticketOffice.sellTicketTo(audience); 로 변경
	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
	
}
