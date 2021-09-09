public class MyLinkedlist{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void printMiddle(){
		
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		while(fast_ptr!=null && fast_ptr.next !=null){
			fast_ptr = fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		System.out.println("The Middle element is : "+slow_ptr.data );
	}
	
	public void push(int new_data){
		
		Node new_node=new Node(new_data);
		new_node.next = head;
		head=new_node;
	}
	public void printlist(){
		Node tnode = head;
		while(tnode != null){
			System.out.print(tnode.data+"->");
			tnode=tnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String [] args){
		
		MyLinkedlist ll = new MyLinkedlist();
		for(int i=5;i>0;i--){
			ll.push(i);
			
		}
		ll.printlist();
		ll.printMiddle();
	}
	
}