package datastructure;

import java.util.logging.Level;
import java.util.logging.Logger;

class Node{
	String data;
	Node next;
	Node(String data){
		this.data=data;
	}
}
public class LinkedList {
	Node head;
	static Logger logger=Logger.getLogger(LinkedList.class.getName());
	/**
	 * insertAtEnd is method to insert element at end
	 * @param myList is the Linked List
	 * @param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList insertAtEnd(LinkedList myList, String data) {
		Node num=new Node(data);
		if(myList.head ==null){
			myList.head=num;
		}
		else {
			Node temp=myList.head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=num;
		}
		return myList;
		
	}
	/**
	 * insertAtBegin is method to insert element at Begin
	 * @param myList is the Linked List
	 * @param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList insertAtBegin(LinkedList myList, String data) {
		Node num=new Node(data);
		if(myList.head ==null){
			myList.head=num;
		}
		else {
			Node temp=myList.head;
			myList.head=num;
			myList.head.next=temp;
		}
		return myList;
		
	}
	/**
	 * insertAtMiddle is method to insert element at Middle
	 * @param myList is the Linked List
	 * @param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList insertAtMiddle(LinkedList myList, String data,int position) {
		Node num=new Node(data);
		int index=0;
		if(myList.head ==null){
			myList.head=num;
		}
		else {
			Node temp=myList.head;
			Node prev=myList.head;
			while(temp!=null) {
				index++;
				if(index==position) {
					prev.next=num;
					num.next=temp;
				}
				prev=temp;
				temp=temp.next;
			}
		}
		return myList;
		
	}
	/**
	 * deleteAtBegin method to delete element at Begin
	 *@param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList deleteAtBegin(LinkedList myList) {
		if(myList.head ==null){
			logger.log(Level.WARNING, "Cant delete at begin List is Empty");
		}
		else {
			myList.head=myList.head.next;
		}
		return myList;
		
	}
	/**
	 * deleteAtBegin method to delete element at Middle
	 *@param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList deleteAtMiddle(LinkedList myList,int position) {
		int index=0;
		if(myList.head ==null){
			logger.log(Level.WARNING, "Cant delete at Middle List is Empty");
		}
		else {
			Node temp=myList.head;
			Node prev=myList.head;
			while(temp!=null) {
				index++;
				if(index==position) {
					prev.next=temp.next;
				}
				temp=temp.next;
			}
		}
		return myList;
		
	}
	/**
	 * deleteAtBegin method to delete element at ENd
	 *@param data is the data to be added
	 * @return updated List
	 */
	public static LinkedList deleteAtEnd(LinkedList myList) {
		if(myList.head ==null){
			logger.log(Level.WARNING, "Cant delete at End List is Empty");
		}
		else {
			Node temp=myList.head;
			Node prev=myList.head;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
		}
		return myList;
		
	}
	/**
	 * search method is to search the key
	 * key is searched in @param myList 
	 * @param key element to be searched
	 */
	public static void search(LinkedList myList,String key) {
		Node current = myList.head;
		boolean flag=true;
		while(current != null) {
			if(current.data.equals(key)) {
				logger.log(Level.INFO,"{0} Founded",key);
				flag=false;
				break;
			}
			current = current.next;
		}
		if(flag)
			logger.log(Level.INFO,"{0} Not Founded",key);
		
	}
	/**
	 * 
	 * display is method to print the @param myList
	 */
	public static void display(LinkedList myList) {
		Node current = myList.head;
		StringBuilder str=new StringBuilder();
		while(current != null) {
			if(current.next!=null)
				str.append(current.data+" -> ");
			else
				str.append(current.data);
			current = current.next;
		}
		String temp=str.toString();
		logger.log(Level.INFO,"{0}",temp);
	}
	public static void main(String[] args) {
		LinkedList myList=new LinkedList();
		logger.log(Level.INFO,"Insertion at end : ");
		myList=insertAtEnd(myList,"Naveen");
		myList=insertAtEnd(myList,"Navin");
		myList=insertAtEnd(myList,"Naveen Kumar");
		myList=insertAtEnd(myList,"Naveen Kumar A");
		myList=insertAtEnd(myList,"Naveee");
		display(myList);
		logger.log(Level.INFO,"Insertion at begin : ");
		myList=insertAtBegin(myList,"annadurai");
		display(myList);
		logger.log(Level.INFO,"Insertion at middle : ");
		myList=insertAtMiddle(myList,"Annadurai",2);
		display(myList);
		logger.log(Level.INFO,"Deletion At End : ");
		myList=deleteAtEnd(myList);
		myList=deleteAtEnd(myList);
		display(myList);
		logger.log(Level.INFO,"Deletion At begin : ");
		myList=deleteAtBegin(myList);
		myList=deleteAtBegin(myList);
		display(myList);
		logger.log(Level.INFO,"Deletion At Middle : ");
		myList=deleteAtMiddle(myList,2);
		display(myList);
		logger.log(Level.INFO,"Search : ");
		search(myList,"naveen");
		search(myList,"Naveen");
	}

}
