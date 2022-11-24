/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */

import java.util.*;
public class QueueTest 
{
     int front,rear,MaxSize,q[];
     
     void createQueue(int size)
     {
         front=0;
         rear=-1;
         MaxSize=size;
         q=new int[MaxSize];
     }
      void enqueue(int e)
      {
          rear++;
          q[rear]=e;
          //q[++rear]=e
      }
  
  boolean isFull()
  {
      if(rear==MaxSize-1)
          return true;
      else
          return false;
  }
  int dequeue()
  {
      int temp=q[front];
      front++;
      return(temp);
  }
  boolean isEmpty()
  {
      if(front>rear)
          return true;
      else
          return false;
  }
  
  void printQueue()
  {
      for(int i=front   ;i  <=rear   ; i++)
          System.out.println(q[i]);
  }
  


public static void main(String args[])
{

    int ch,e;
    QueueTest obj=new QueueTest();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter size of queue:");
    int s=in.nextInt();
    obj.createQueue(s);
    do  
    {
         System.out.println("1.Enqueue\n2.Dequeue\n3.print\n0.exit");
         ch=in.nextInt();
         switch(ch)
         {
             case 1:
                 if(!obj.isFull())//is not full
                 {
                      System.out.println("Enter Data:");
                      e=in.nextInt();
                      obj.enqueue(e);
                      System.out.println("Pushed");
                 }
                 else
                      System.out.println("Queue is  Full");
                 break;
                 
              case 2:
                 if(!obj.isEmpty())//is not empty
                 {
                      e=obj.dequeue();
                      System.out.println("dequeue:"+e);
                 }
                 else
                      System.out.println("Queue Empty");
                 break;
                 
                
              
               case 3:
                 if(!obj.isEmpty())//is not empty
                 {
                      System.out.println("queue has:");
                      obj.printQueue();
                 }
                 else
                      System.out.println("queue Empty");
                 break;  
               case 0:
                      System.out.println("Exiting ");
                      break;
               default:
                      System.out.println("Wrong option selected");
                      break;
         }
    }while(ch!=0);

}

}

