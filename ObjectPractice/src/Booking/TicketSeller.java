package Booking;

public class TicketSeller {
	private TicketOffice ticketOffice;		//Ƽ�� �Ǹſ��� �ڽ��� ���ϴ� ��ǥ�Ҹ� �˾ƾ���
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
}
