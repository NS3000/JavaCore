package DataStr;

public class Linkdlistnode {
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    Node head;
    public void add(int value){
        if(head==null){
            head = new Node(value);
        }else{
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(value);
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -->");
            temp=temp.next;
        }
    }

    public void delete(int value){
        Node temp = head;
        while(temp.next.value!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }


    public static void main(String[] args) {
        Linkdlistnode ll = new Linkdlistnode();
        ll.add(5);
        ll.add(1);
        ll.add(25);
        ll.add(7);
        ll.add(9);
        ll.delete(1);
        ll.add(8);
        ll.print();
    }


}
