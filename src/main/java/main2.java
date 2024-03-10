
public class main2 {
	public static Node<Task> insert(Node<Task> head, Task task1) {
	Node<Task> p = head;
	Node<Task> l1 = new Node<Task>(null);
	Node<Task> p1 = l1;
	int count = 0;
	while (p.hasNext() && count != 1) {
			if (p.getValue().getPriority() <= task1.getPriority()) {
				p1.setNext(new Node<Task>(p.getValue()));
				p = p.getNext();
			}
			else {
				p1.setNext(new Node<Task>(task1));
				count++;
			}
			p1 = p1.getNext();
	}
	if (count != 1) {
		p1.setNext(new Node<Task>(task1));
		p1 = p1.getNext();
	}
	while (p != null) {
		p1.setNext(new Node<Task>(p.getValue()));
		p1 = p1.getNext();
		p = p.getNext();
	}
	return l1.getNext();
	
	}
	public static void main(String[] args) {
		
	}

}
