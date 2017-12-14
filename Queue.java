/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface {

	private Node queueList;
	
	public Queue() {
		queueList = null;
	}
	
	public void enqueue(String record) {
		Node storageNode = new Node();
		storageNode.record = record;
		Node pointer = queueList;
		if(pointer != null) {
			while(pointer.next != null) {
				pointer = pointer.next;
			} 
			pointer.next = storageNode;
		} else {
			queueList = storageNode;
		}
	}
	
	public String dequeue() {
		String answer;
		answer = queueList.record;
		queueList = queueList.next;
		return answer;
	}
	
	public void printQueue() {
		Node pointer = queueList;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
}
