
package singlell;
public class Middleelement {
    
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
    
    public void middle()
    {
        Node prev=head;
        Node current=head;
        
        if(head!=null)
        {
            while(current.next!=null && current!=null)
        {
            current=current.next.next;
            prev=prev.next;
        }
        
        System.out.println(prev.data);
        }
    }
    
    public static void main(String[] args) {
        Middleelement li=new Middleelement();
        
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(50);
        li.insert(60);
        li.insert(70);
        
        li.middle();
        
        
        
    }
    
}
