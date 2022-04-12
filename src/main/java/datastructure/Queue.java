package datastructure;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Queue {
	ArrayList<Integer> myQueue;
	int size;
	static Logger logger=Logger.getLogger(Queue.class.getName());
	/*
	 * Queue is a constructor used to initialize the @size and @myQueue
	 * */
	Queue(int size){
		this.size=size;
		myQueue=new ArrayList<Integer>(size);
	}
	/*
	 * enQueue is a method to add an element in queue 
	 * it returns queue overflow if queue is full
	 * */
	void enQueue(int data) {
		if(myQueue.size()<size)
			myQueue.add(data);
		else
			logger.log(Level.WARNING,"Can't enqueue, Queue is overflow");
	}
	/*
	 * deQueue is a method to delete an element in queue 
	 * it returns queue underflow if queue is empty
	 * */
	void deQueue() {
		if(!isEmpty())
			myQueue.remove(0);
		else
			logger.log(Level.WARNING,"Can't dequeue, Queue is underflow");
	}
	/**
	 * 
	 * front method @return the front element of queue
	 */
	int front() {
		return myQueue.get(0);
		
	}
	/**
	 * 
	 * rear method @return the rear element of queue
	 */
	int rear() {
		return myQueue.get(myQueue.size()-1);
		
	}
	/**
	 * display method print the queue
	 */
	void display() {
		StringBuilder str=new StringBuilder();
		for(int i=0;i<myQueue.size();i++) {
			if(i==myQueue.size()-1)
				str.append(myQueue.get(i));
			else
				str.append(myQueue.get(i)+"-");
		}
		logger.log(Level.INFO,str.toString());
	}
	/**
	 * 
	 * isEmpty method @return queue is empty or not
	 */
	boolean isEmpty() {
		return (myQueue.isEmpty());
	}
	public static void main(String[] args) {
		Queue q1=new Queue(15);
		logger.log(Level.INFO,"Enqueue");
		q1.enQueue(7);
		q1.enQueue(4);
		q1.enQueue(1);
		q1.enQueue(6);
		q1.enQueue(10);
		q1.enQueue(3);
		q1.display();
		logger.log(Level.INFO,"Dequeue");
		q1.deQueue();
		q1.deQueue();
		q1.display();
		if(q1.isEmpty())
			logger.log(Level.INFO,"Queue is empty");
		else
			logger.log(Level.INFO,"Queue is not empty");
		logger.log(Level.INFO,"Front : {0}",q1.front());
		logger.log(Level.INFO,"Rear : {0}",q1.rear());
	}

}
