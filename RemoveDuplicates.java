
package singlell;

public class DuplicatesSorted {
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
      
      public void remove(int arr[])
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
          for(i=0;i<length;i++)
          {
              for(int j=i+1;j<length;j++)
              {
                  if(arr[i]>arr[j])
                  {
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
              }
          }
          for(i=0;i<length-1;i++)
          {
              if(arr[i]==arr[i+1])
          {
             arr[i+1]=0;
            
          }
          
          }
          for(i=0;i<length;i++)
          {
              if(arr[i]!=0)
              {
              System.out.println(arr[i]+" ");
              }
          }
          
      }
      public static void main(String[] args) {
          DuplicatesSorted li=new DuplicatesSorted();
          li.insert(2);
          li.insert(3);
          li.insert(2);
          li.insert(4);
          li.insert(1);
          li.insert(3);
          li.insert(4);
          
          int arr[]=new int[count()];
          
          li.remove(arr);
        
    }
    
}
