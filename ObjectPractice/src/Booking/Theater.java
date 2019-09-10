package Booking;

public class Theater {
	
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		//�������� ���濡 �ʴ���� ������
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();		//�Ǹſ��� �Ĵ� Ƽ���ϳ� ��ȯ
			audience.getBag().setTicket(ticket);							//��ȯ�� Ƽ���� ����
		}else {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();		//�Ǹſ��� �Ĵ� Ƽ���ϳ� ��ȯ
			audience.getBag().minusAmount(ticket.getFee());					//������ �ݾ�����
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());		//�Ǹſ� �ݾ�����
			audience.getBag().setTicket(ticket);							//��ȯ�� Ƽ���� ����
		}
	}
	
}
