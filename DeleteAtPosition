/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlell;

/**
 *
 * @author hp
 */
public class Deleteposition {
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
    
    public void delete(int pos)
    {
        int count=0;
        
        Node current=head;
        Node prev=null;
        
        while(current!=null && count!=pos)
        {
            prev=current;
            current=current.next;
            count++;
        }
        prev.next=current.next;
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
        
        Deleteposition li= new Deleteposition();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(50);
        li.display();
        
        System.out.println("");
        li.delete(1);
        li.display();
    }
    
}
