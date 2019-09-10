package Booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	private Long amount;										//�Ǹűݾ�
	private List<Ticket> tickets = new ArrayList<Ticket>();		//��ȯ���� Ƽ�ϵ�
	
	public TicketOffice(Long amount, Ticket ...tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
		
	}
	
	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}
	
	//�÷��ǿ��� �� ù��° ��ġ�� ����� ticket�� ��ȯ��
	public Ticket getTicket() {
		return tickets.remove(0);
	}
	
	//�ݾ� ����
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
	//�ݾ� ����
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
}
