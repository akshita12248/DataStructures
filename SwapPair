package singlell;

public class SwapPair {
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
        
       // System.out.println("count: "+count);
        
    }
      
      public void swap(int arr[])
      {
          int i=0,j=0;
          
          Node current=head;
          
          while(current!=null)
          {
              arr[i]=current.data;
              i++;
              current=current.next;
          }
          int temp=0;
          int length=count();
         
           for(i=0;i<length-1;i=i+2)
           {
              
                   temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
           }
          for(i=0;i<length;i++)
          {
              System.out.print(arr[i]+" ");
          }
      }
      
      public static void main(String[] args) {
          SwapPair li=new SwapPair();
          li.insert(1);
          li.insert(2);
          li.insert(3);
          li.insert(4);
          int arr[]=new int[count()];
          
          li.swap(arr);
          
        
    }
      
          
    
}
