package main;
public class SinglyLinkedList {
    public class Node{
        private int data;
        private Node next;


        public int getData()
        {
            return data;
        }
        public int getNext()
        {
            return next;
        }
        public void setData(int data)
        {
            this.data=data;
        }
        public void setNext(Node next)
        {
            this.next=next;
        }
    public node(int data)
{   this.data=data;
}
        public node(int data,Node next)
        {   this.data=data;this.next=next;
        }
}
private Node head=null;
private int size=0;
public static void main(String args[])
{ SinglyLinkedList linkedList=new SinglyLinkedList();
    System.out.println(linkedlist);
}
public String toString(){
  StringBuilder response = new StringBuilder();

response.append("[");Node temp=this.head;while(temp!=null){response.append(temp.getData());temp=temp.next;}
    response.append("]");

return response.toString();
} private void insertHead(int data){Node newNode=new Node(data,this.head);this.head=newNode
}
private void insertAfter(int data,Node node){
node.next=new Node(data,node.next);size++;           }