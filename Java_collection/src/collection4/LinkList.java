package collection4;

public class LinkList {
	private Node head;
	private Node tail;
	
	public void add(int data) {
		Node temp = new Node(data);
		if(head==null) 
			head=temp; // 첫번째 노드만들어지면
		else { // 두번째부터
			tail.setLink(temp);
		}
		tail=temp;
	}
	public void view() {
		Node move = head;
		while(move!=null) {
			System.out.println(move);
			move = move.getLink();
		}
	}
	
		
		
	
}
