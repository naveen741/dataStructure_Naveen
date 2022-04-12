package datastructure;
import java.util.*;
public class Queue {
	ArrayList<Integer> myQueue;
	int size;
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
			System.out.println("Can't enqueue, Queue is overflow");
	}
	/*
	 * deQueue is a method to delete an element in queue 
	 * it returns queue underflow if queue is empty
	 * */
	void deQueue() {
		if(!isEmpty())
			myQueue.remove(0);
		else
			System.out.println("Can't dequeue, Queue is underflow");
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
		for(int i=0;i<myQueue.size();i++) {
			System.out.print(myQueue.get(i)+" ");
		}
		System.out.println();
	}
	/**
	 * 
	 * isEmpty method @return queue is empty or not
	 */
	boolean isEmpty() {
		return myQueue.size()==0;
	}
	public static void main(String[] args) {
		Queue q1=new Queue(15);
		System.out.println("Enqueue");
		q1.enQueue(7);
		q1.enQueue(4);
		q1.enQueue(1);
		q1.enQueue(6);
		q1.enQueue(10);
		q1.enQueue(3);
		q1.display();
		System.out.println("Dequeue");
		q1.deQueue();
		q1.deQueue();
		q1.display();
		if(q1.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Queue is not empty");
		System.out.print("Front : ");
		System.out.println(q1.front());
		System.out.print("Rear : ");
		System.out.println(q1.rear());
	}

}
