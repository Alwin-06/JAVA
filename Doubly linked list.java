/* Doubly linked list using java */

import java.util.*;
class Node
{
    int data;
    Node llink;
    Node rlink;
    public Node(int data)
    {
        this.data=data;
        llink=null;
        rlink=null;
    }
}
class Dll
{
    Node head;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.rlink!=null)
            {
                temp=temp.rlink;
            }
            temp.rlink=newNode;
            newNode.llink=temp;
            newNode.rlink=null;
        }
    }
    void delete(int key)
    {
        Node current=head;
        while(current!=null && current.data!=key)
        {
            current=current.rlink;
        }
        if(current==null)
        {
            System.out.println("Not found");
        }
        if(current.llink!=null)
        {
            current.llink.rlink=current.rlink;
        }
        else
        {
            head=current.rlink;
        }
         if(current.rlink!=null)
        {
            current.rlink.llink=current.llink;
        }
        else
        {
            current.llink.rlink=null;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.rlink;
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Dll L1=new Dll();
        Scanner scan=new Scanner(System.in);
        int choice;
        System.out.println("1:Insert 2:Delete 3:Display ");
        System.out.println("Enter 4 for EXIT");
        do
        {
            System.out.println("Enter your choice");
            choice=scan.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter number to be inserted: ");
                        int data=scan.nextInt();
                        L1.insert(data);
                        break;
                case 2: System.out.println("Data deleted: ");
                        int deldata=scan.nextInt();
                        L1.delete(deldata);
                        break;
                case 3: L1.display();
                        break;
                case 4: break;
            }
        }
        while(choice!=4);
        scan.close();
    }
}
