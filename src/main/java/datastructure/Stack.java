package datastructure;
import java.util.*;
public class Stack {
	ArrayList<Integer> list;
	int size; 
	/**
	 * Stack is constructor to initialize the @size @list
	 * @param max is maximum size of the Stack
	 */
	Stack(int max){
		this.size=max;
		this.list=new ArrayList<Integer>(max);
	}
	/**
	 * push is method to add element in Stack
	 * @param data is element to be added
	 */
	void push(int data) {
		if(list.size()<this.size)
			list.add(data);
		else
			System.out.println("Can't push Stack is overFlow");
	}
	/**
	 * pop is method to delete last element in Stack
	 */
	void pop(){
		if(!list.isEmpty())
			list.remove(list.size()-1);
		else
			System.out.println("Can't pop Stack is underFlow.");
	}
	/**
	 * peek is method returns the top value of Stack 
	 */
	void peek() {
		System.out.println("top (peek) element : "+list.get(list.size()-1));
	}
	/**
	 * display method prints the stack element
	 */
	void display() {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	/**
	 * isEmpty checks the stack is empty or not
	 */
	void isEmpty() {
		if(list.isEmpty()) {
			System.out.println("Stack is emptied.");
		}
		else {
			System.out.println("Stack is not emptied.");
		}
	}
	public static void main(String[] args) {
		Stack s1=new Stack(15);
		System.out.println("Push operation");
		s1.push(7);
		s1.push(4);
		s1.push(7);
		s1.push(1);
		s1.push(6);
		s1.display();
		System.out.println("Checking stack is empty or not...");
		s1.isEmpty();
		System.out.println("peek element operation");
		s1.peek();
		System.out.println("Pop operation");
		s1.pop();
		s1.pop();
		s1.pop();
		s1.display();
		System.out.println("peek element operation");
		s1.peek();
		s1.pop();
		s1.pop();
		System.out.println("Checking stack is empty or not...");
		s1.isEmpty();
		s1.pop();
	}

}
