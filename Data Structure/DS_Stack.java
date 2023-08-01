// stack impelemation in Array
class TempJava {

    public static final int Max=100;
    int top;
    int arr[]=new int[Max];

    TempJava() {
        top=-1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int data) {
        if(top >= (Max-1)) {
            System.out.print("Stack Overflow");
            return;
        }
        arr[++top]=data;
        System.out.println(data+" Pushed into Stack");
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int a = arr[top--];
        return a;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        int a = arr[top];
        return a;
    }

    public void Print_Stack() {
        for(int i=top;i>-1;i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        TempJava obj=new TempJava();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println("\n"+obj.pop()+" is Poped from Stack");
        System.out.println("\n"+obj.peek()+" is Top element of Stack\n\nStack Present Elements");
        obj.Print_Stack();
    }
}









// stack impelemation in linkedlist
/*
class Example {

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data=d;
            next=null;
        }
    }

    static class Stack {
        public static Node head = null;
        public static void push(int data) {
            Node newNode=new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next=head;
            head=newNode;

        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top=head;
            head=head.next;
            return top.data;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            Node top=head;
            return top.data;
        }


    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
*/