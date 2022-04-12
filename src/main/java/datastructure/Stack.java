package datastructure;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Stack {
	ArrayList<Integer> list;
	int size; 
	static Logger logger=Logger.getLogger(Stack.class.getName());
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
			logger.log(Level.INFO,"Cant push Stack is overFlow");
	}
	/**
	 * pop is method to delete last element in Stack
	 */
	void pop(){
		if(!list.isEmpty())
			list.remove(list.size()-1);
		else
			logger.log(Level.INFO,"Cant pop Stack is underFlow.");
	}
	/**
	 * peek is method returns the top value of Stack 
	 */
	void peek() {
		logger.log(Level.INFO,"top (peek) element : {0}",list.get(list.size()-1));
	}
	/**
	 * display method prints the stack element
	 */
	void display() {
		StringBuilder str=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1)
				str.append(list.get(i));
			else
				str.append(list.get(i)+"-");
		}
		String temp=str.toString();
		logger.log(Level.INFO,"{0}",temp);
	}
	/**
	 * isEmpty checks the stack is empty or not
	 */
	void isEmpty() {
		if(list.isEmpty()) 
			logger.log(Level.INFO,"Stack is emptied.");
		else 
			logger.log(Level.INFO,"Stack is not emptied.");
	}
	public static void main(String[] args) {
		Stack s1=new Stack(15);
		logger.log(Level.INFO,"Push operation");
		s1.push(7);
		s1.push(4);
		s1.push(7);
		s1.push(1);
		s1.push(6);
		s1.display();
		logger.log(Level.INFO,"Checking stack is empty or not...");
		s1.isEmpty();
		logger.log(Level.INFO,"peek element operation");
		s1.peek();
		logger.log(Level.INFO,"Pop operation");
		s1.pop();
		s1.pop();
		s1.pop();
		s1.display();
		logger.log(Level.INFO,"peek element operation");
		s1.peek();
		s1.pop();
		s1.pop();
		logger.log(Level.INFO,"Checking stack is empty or not...");
		s1.isEmpty();
		s1.pop();
	}

}
