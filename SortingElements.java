package singlell;
public class SortingLL {
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
      
      public void sort(int arr[])
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
          
          for(i=0;i<length;i++)
          {
              System.out.println(arr[i]);
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
        
         SortingLL li=new  SortingLL();
         li.insert(30);
         li.insert(10);
         li.insert(20);
         li.insert(40);
         li.insert(01);
         
         int arr[]=new int[count()];
         
         li.sort(arr);
         }
         }
