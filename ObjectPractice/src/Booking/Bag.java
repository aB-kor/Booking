package Booking;

public class Bag {
	
	private Long amount;				//현금
	private Invitation invitation;		//초대장
	private Ticket ticket;				//티켓
	
	
	//초대장 없이 현금만 보관
	public Bag(long amount) {
		this(null,amount);
	}
	
	//초대장도 있고, 현금도 있는경우.
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
	
	
	//초대장 유무
	public boolean hasInvitation() {
		return invitation != null;
	}
	
	//티켓유무
	public boolean hasTicket() {
		return ticket != null;
	}
	
	//초대장을 티켓으로 교환
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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
