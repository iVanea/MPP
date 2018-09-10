package prob2;

public abstract class Department  {
	
	
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() throws EmptyQueueException {
		return queue;
	}
	
	//implement
	public abstract String getName();
	
	
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	public String nextMessage() {
		try {
			String s = queue.peek();
			queue.dequeue();
			return s;
		}catch(EmptyQueueException ex) {
			System.out.println(ex.getMessage());
			
			return ex.getMessage();
		}
		
	}
}
