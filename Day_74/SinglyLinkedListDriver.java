//package LabSheet1;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public void setData(int data){
        this.data=data;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}

class SinglyLinkedList {
    private Node head;
    int size=0;
    SinglyLinkedList(){
        head=null;
    }
    public void Traverse(){
        Node ptr = head;
        if (ptr==null){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is :");
            while (ptr!=null){
                System.out.print(ptr.getData());
                System.out.print("  ");
                ptr=ptr.getNext();
            }
        }

    }
    public void insertFront(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            head=node;
            node.setNext(temp);
        }
    }

    public void deleteFront(){
        if(head==null){
            System.out.println("The list is empty");
        }
        else{
            Node temp=head;
            head=temp.getNext();

        }
    }

    public void insertEnd(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node ptr = head;
            Node prev = new Node();
                while (ptr!=null){
                    prev=ptr;
                    ptr=ptr.getNext();
                }
                prev.setNext(node);

        }
    }


    public void Search(int data){
        Node ptr = head;
        if (ptr==null){
            System.out.println("The list is empty");
        }else{
            while (ptr!=null){
                if(ptr.getData()==data){
                    System.out.println("Element found");
                    break;
                }
                ptr=ptr.getNext();
            }
        }

    }

    public int getSize(){
        Node ptr = head;
        if (ptr==null){
            System.out.println("The list is empty");
            return 0;
        }else{
            while (ptr!=null){
                size=size+1;
                ptr=ptr.getNext();
            }
        }
        return size;
    }

}

public class SinglyLinkedListDriver {
    public static void main(String args[]) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println(" \n");
            System.out.println("CHOICES");
            System.out.println("1.Traveseal");
            System.out.println("2.Insert a node at front");
            System.out.println("3.Insert a node at end");
            System.out.println("4.Delete a node at front");
            System.out.println("5.Search for an element");
            System.out.println("6.Get the size");
            System.out.println("Enter you choice(enter Q for exit) : ");
            char ch = sc.next().charAt(0);
            int tkn=ch-'0';
            if(tkn==1){
                sl1.Traverse();
            }
            else if(tkn==2){
                Node node1 = new Node();
                System.out.println("Enter the data for new node : ");
                int data = sc.nextInt();
                node1.setData(data);
                sl1.insertFront(node1);
            }
            else if(tkn==3){
                Node node1 = new Node();
                System.out.println("Enter the data for new node : ");
                int data = sc.nextInt();
                node1.setData(data);
                sl1.insertEnd(node1);
            }
            else if(tkn==4){
                sl1.deleteFront();
            }
            else if(tkn==5){
                System.out.println("Enter the data to be searched for : ");
                int data = sc.nextInt();
                sl1.Search(data);
            }
            else if(tkn==6){
                System.out.println("The size of the list is : "+ sl1.getSize());
            }
            else if(ch=='Q'){
                break;
            }
        }
        sc.close();

    }
}
