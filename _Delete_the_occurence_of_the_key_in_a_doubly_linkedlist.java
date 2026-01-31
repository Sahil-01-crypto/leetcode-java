package leetcode;

class node {
        int data ;
    node next  ;
    node prev ;
    node(int data ){
        this .  data = data ;

    }
    }

public class _Delete_the_occurence_of_the_key_in_a_doubly_linkedlist {

    public static node deleteKey(node head , int key ) {
        node temp = head;
        while (temp != null) {
            if (temp.data == key) {

                node nextNode = temp.next;
                node prevNode = temp.prev;
                if (temp == head) {
                    head = nextNode;
                    if (head != null)
                        head.prev = null;
                    if (nextNode != null) {
                        nextNode.next = prevNode ;
                    }
                    if (prevNode != null) {
                        prevNode.next = nextNode ;
                    }
                }
                temp = temp.next;
            }

        }
        return head ;
    }
    public static void display(node head ){
        node temp = head ;
        while(  temp != null ){
            System.out.print(temp . data+" ");
            temp = temp . next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(4);
        node c = new node(10);
        node d = new node(3);
        node e = new node(5);
        node f = new node(20);
        node g = new node(10);
        a.prev = null ;
        a.next = b ;
        b.prev = a ;
        b.next = c ;
        c.prev = b ;
        c.next= d ;
        d.prev = c ;
        d.next=e;
        e.prev=d;
        e.next = f;
        f . prev = e ;
        f.next = g ;
        g.prev = f ;
        g.next = null ;
        System.out.println("Before  Deletion ");
        display( a );
        a= deleteKey(a , 10 );
        System.out.println("After Deletion ");
        display( a );


    }
}

