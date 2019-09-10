package Booking;

public class Bag {
	
	private Long amount;				//����
	private Invitation invitation;		//�ʴ���
	private Ticket ticket;				//Ƽ��
	
	
	//�ʴ��� ���� ���ݸ� ����
	public Bag(long amount) {
		this(null,amount);
	}
	
	//�ʴ��嵵 �ְ�, ���ݵ� �ִ°��.
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	public Long hold(Ticket ticket) {
		if(hasInvitation()) {
			setTicket(ticket);
			return 0L;
		}else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
	
	
	//�ʴ��� ����
	public boolean hasInvitation() {
		return invitation != null;
	}
	
	//Ƽ������
	public boolean hasTicket() {
		return ticket != null;
	}
	
	//�ʴ����� Ƽ������ ��ȯ
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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
