class DS_Linkedlist {
	
	
	Node start;
	Node tail;
	
	
	class Node {
		int data;
		Node next;
		
		Node(int d) {
			data=d;
			next=null;
		}
	}
		
		public void addNode(int data) {
			Node newNode=new Node(data);
			
			if(start==null){
				start=newNode;
				tail=newNode;
			}
			
			tail.next=newNode;
			tail=newNode;
		}
		
		public void addFirst(int data) {
			Node newNode=new Node(data);
			if(start==null) {
				start=newNode;
			}
			newNode.next=start;
			start=newNode;
		}
		
		
		public void deleteNode(int pos) {
			if(start == null || pos==1) {
				System.out.print("List is Empty");
				start=start.next;
				return;
			}
			
			Node p=start;
			Node temp=start.next;
			temp=temp.next;
			int i=1;
			while(i != pos) {
				if(i==pos-1) {
					p.next=temp;
					return;
				}
				temp=temp.next;
				p=p.next;
				i++;
			} 
			
		}
		
		public void findNode(int d) {
			if(start==null) {
				System.out.print("List is Empty");
			}
			
			Node temp=start;
			int pos=0;
			while(temp.data!=d) {
				temp=temp.next;
				pos++;
			}
			pos++;
			System.out.print("Your "+temp.data+" value found at "+pos+" position");
		}
		
		public void displayNodes() {
			if(start==null) {
				System.out.print("List is Empty: ");
			}
			
			Node temp=start;
			
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			
			System.out.print("Null");
		}
		
		
		
		public static void main(String args[]) {
			DS_Linkedlist list=new DS_Linkedlist();
			list.addNode(10);
			list.addNode(20);
			list.addNode(30);
			
			list.addFirst(3);
			
			list.displayNodes();
		}
			
			
}
	