
public class Task {
	private String id;
	private int credit;
	private int priority;
	public Task(String id, int credit, int priority) {
		this.id = id;
		this.credit = credit;
		this.priority = priority;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public void decPriority() {
		this.priority += 1;
	}
	
	public void addCredit(int c) {
		this.credit += c;
	}
	
	public void subCredit(int c) {
		this.credit -= c;

	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", credit=" + credit + ", priority=" + priority + "]";
	}
	
}
