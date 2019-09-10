package Booking;

public class TicketSeller {
	private TicketOffice ticketOffice;		//Ƽ�� �Ǹſ��� �ڽ��� ���ϴ� ��ǥ�Ҹ� �˾ƾ���
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	//���� Audience�� �������̽����� �����ϵ��� ����
	//������ ������ TicketOffice�� ������ħ����. TicketOffice�� �ִ� Ƽ���� ������� ������, Audience�� �Ȱ�, �������� ������� TicketOffice�� �־����
	//ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); -> ticketOffice.sellTicketTo(audience); �� ����
	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
	
}
