package dataStructure;
class Node{
	String data;
	Node next;
	Node(String data){
		this.data=data;
	}
}
public class LinkedList {
	Node head;
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
			System.out.println("ListEmpty");
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
			System.out.println("ListEmpty");
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
			System.out.println("ListEmpty");
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
			if(current.data==key) {
				System.out.println(key+" Founded");
				flag=false;
				break;
			}
			current = current.next;
		}
		if(flag)
			System.out.println(key+" Not Founded");
		
	}
	/**
	 * 
	 * display is method to print the @param myList
	 */
	public static void display(LinkedList myList) {
		Node current = myList.head;
		while(current != null) {
			if(current.next!=null)
				System.out.print(current.data+" -> ");
			else
				System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}
	/*public static void main(String[] args) {
		LinkedList myList=new LinkedList();
		System.out.println("Insertion at end : ");
		myList=insertAtEnd(myList,7);
		myList=insertAtEnd(myList,4);
		myList=insertAtEnd(myList,1);
		myList=insertAtEnd(myList,6);
		myList=insertAtEnd(myList,10);
		display(myList);
		System.out.println("Insertion at begin : ");
		myList=insertAtBegin(myList,5);
		display(myList);
		System.out.println("Insertion at middle : ");
		myList=insertAtMiddle(myList,8,2);
		display(myList);
		System.out.println("Deletion At End : ");
		myList=deleteAtEnd(myList);
		myList=deleteAtEnd(myList);
		display(myList);
		System.out.println("Deletion At begin : ");
		myList=deleteAtBegin(myList);
		myList=deleteAtBegin(myList);
		display(myList);
		System.out.println("Deletion At Middle : ");
		myList=deleteAtMiddle(myList,2);
		display(myList);
		System.out.println("Search : ");
		search(myList,7);
		search(myList,81);
	}*/

}
