// Queue impelemation in LinkedList
/*
class Example {

    static Node front;
    static Node rear;
   
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data=d;
            next=null;
        }
    }

    public static class Queue {

        public void Enqueue(int data) {
            Node newNode=new Node(data);
            if(rear == null) {
                rear=newNode;
                front=newNode;
            }
            rear.next=newNode;
            rear=newNode;
            System.out.println(rear.data+" is now in Queue");
        }

        public int Dequeue() {
            if(rear.data == front.data) {
                int data = front.data;
                System.out.println("\n"+data+" is now out of Queue");
                return -1;
            }
            int data=front.data;
            front=front.next;
            System.out.println("\n"+data+" is now out of Queue");
            return data;
        }

        public int peek() {
            if(rear == null) {
                System.out.print("Queue is Empty");
                return -1;
            }
            System.out.println("\n"+front.data+" is First person");
            return front.data;
        }


    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);

        q.Dequeue();
        q.peek();
        q.Dequeue();
        q.peek();
        q.Dequeue();
        q.Dequeue();
        
    }

}

*/








// Queue impelemation in Array
/*
class TempJava {
	
	public static final int Max=5;
	int front;
	int rear;
	int arr[]=new int[Max];
	
	TempJava() {
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty() {
		return rear == -1;
	}
	public void enqueue(int data) {
		if(front==0 && rear == Max-1) {
			System.out.print("Queue is Full");
			return;
		}
		arr[++rear]=data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
			return -1;
		}
		if(arr[front]==arr[rear]) {
			int b=arr[front];
			front=-1;
			rear=-1;
			return b;
		}
		int a = arr[front];
		front++;
		return  a;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[front];
	}
	
	public static void main(String args[]) {
		TempJava obj=new TempJava();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		
		while(!obj.isEmpty()) {
			System.out.print(obj.peek()+" ");
			System.out.print(obj.dequeue());
		}
	}
	
}
*/