package Booking;

public class Audience {
	private Bag bag;
	
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
	//이제 관람객 자신이 직접 가방안에 초대장이 있는지 확인한다.
	//외부 제 3자가 자신의 가방을 열어볼수없음
	//Audience가 직접 Bag을 처리함
	//Audience 클래스에서 getBag 메서드를 제거할 수 있고, 결과적으로 Bag의 존재를 내부로 캡슐화했음.
	//근데 아직 Bag은 Audience에 의해 끌려다님.
	//buy 메서드의 내용을 Bag 클래스(hold 메서드)에 옮기고, 인터페이스에만 의존하도록 수정한다
	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}
}
