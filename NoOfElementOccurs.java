package singlell;
public class Intoccurs {
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
   
    public void noOfInt(int n)
    {
        int count=0;
        
        Node current=head;
        
        while(current!=null)
        {
            if(current.data==n)
            {
                count++;
            }
            current=current.next;
        }
        
        System.out.println(n +" occurs "+count+" times");
        
        if(head==null)
        {
            System.out.println("no element is there");
        }
    }
    
    public static void main(String[] args) {
        Intoccurs li=new Intoccurs();
        li.insert(10);
        li.insert(20);
        li.insert(10);
        li.insert(10);
        li.insert(20);
        li.insert(20);
        
        li.noOfInt(10);
        li.noOfInt(29);
        li.noOfInt(20);
        
    }
    
}
