package singlell;
public class Countlist {
    Node head;
    
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public Node insert(int data)
    {
        
        Node current=new Node(data);
        current.next=null;
        
        if(head==null)
        {
            head=current;
        }
        
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            
            last.next=current;
        }
        return head;
    }
    
    public void count()
    {
        Node current=head;
        Node prev=null;
        int count=0;
        
        while(current!=null)
        {
            prev=current;
            current=current.next;
            count++;
        }
        
        System.out.println("count: "+count);
        
    }
    
    public Node display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
        
        return temp;
    }
    
    public static void main(String[] args) {
        
        Countlist li=new Countlist();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.display();
        
        System.out.println("");
        li.count();
        
    }
    
}
