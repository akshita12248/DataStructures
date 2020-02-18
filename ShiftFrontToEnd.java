public class ShiftEndToFront {
    static Node head;
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
     public static int count()
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
        
        return count;
    }
  
    public void shift(int arr[])
      {
          int i=0;
          
          Node current=head;
          
          while(current!=null)
          {
              arr[i]=current.data;
              i++;
              current=current.next;
          }
          int temp=0;
          int length=count();
          
          int temp1[]=new int[100];
      
        for(i=0;i<length;i++)
        {
            temp1[i]=arr[length-1];
            
            
        }
        
        for(i=0;i<1;i++)
        {
            System.out.print(temp1[i]+" ");
        }
        
        for(i=0;i<length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
         
      }
    
    
         public Node display()
         {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return temp;
    }
    
    
    public static void main(String[] args) {
        ShiftEndToFront li=new ShiftEndToFront();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.display();
        System.out.println("");
        System.out.println("After Shifting");
        System.out.println("");
        int arr[]=new int[count()];
        li.shift(arr);
       
        
}
    
}
