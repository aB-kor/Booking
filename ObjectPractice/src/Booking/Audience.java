package Booking;

public class Audience {
	private Bag bag;
	
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
	//���� ������ �ڽ��� ���� ����ȿ� �ʴ����� �ִ��� Ȯ���Ѵ�.
	//�ܺ� �� 3�ڰ� �ڽ��� ������ ���������
	//Audience�� ���� Bag�� ó����
	//Audience Ŭ�������� getBag �޼��带 ������ �� �ְ�, ��������� Bag�� ���縦 ���η� ĸ��ȭ����.
	//�ٵ� ���� Bag�� Audience�� ���� �����ٴ�.
	//buy �޼����� ������ Bag Ŭ����(hold �޼���)�� �ű��, �������̽����� �����ϵ��� �����Ѵ�
	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}
}
