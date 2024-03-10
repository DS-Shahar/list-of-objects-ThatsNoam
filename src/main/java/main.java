public class main1 {
	public static void insert(Queue<Task> q, Task t) {
		q.insert(null);
		boolean added = false;
		
		while (q.head() != null) {
			if (q.head().getPriority() > t.getPriority() && added == false) {
				q.insert(t);
				q.insert(q.remove());
				added = true;
			}
			else {
				q.insert(q.remove());
			}
		}
		q.remove();
		if (!added) {
			q.insert(t);
		}
		}
	public static void update(Queue<Task> q, boolean b, int c) {
		if (b) {
			q.remove();
		}
		else {
			q.head().subCredit(c);
			if (q.head().getCredit() < 10) {
				q.head().addCredit(100);
				q.head().decPriority();
			}
			insert(q,q.head());
			q.remove();
			
			
		}
	}
	public static void main(String[] args) {
		Queue<Task> q1 = new Queue<>();

	}

}
