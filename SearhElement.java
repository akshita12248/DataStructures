package singlell;
public class SearchEle {
    
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
    
    public void search(int ele)
    {
        Node current=head;
        if(current.data==ele)
        {
            System.out.println("yes,element is present at head");
        }
        
        while(current.next!=null && current.data!=ele)
        {
            current=current.next;
            if(current.data==ele)
            {
                System.out.println("yes,element is present");
            }
                          
            
        }
        
        if(current.next==null)
        {
            System.out.println("no");
        }
        
        
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
        
        SearchEle li =new SearchEle();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.search(10);
        
    }
    }
