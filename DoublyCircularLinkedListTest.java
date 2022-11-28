
import java.util.Scanner;

class Dnode
{
    int data;
    Dnode left,right;
    Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class DoublyCircularLinkedListTest
{
   Dnode root,last;    
    void createList()
    {
        root=null;
    }
    void insertLeft(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null){
            root=last=n;
	        last.right=root;
		        root.left=last;
	}
        else
        {
            n.right=root;//1
            n.left=last;
            last.right=n;
            root = n;
        }
    }
    void deleteLeft()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
            Dnode t=root;//1
            root=root.right;//2
            root.left=last;//3
            last.right=root;
            System.out.println("Deleted:"+t.data);
        }
    }
    
    void insertRight(int data)
            
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
                last.right = n;
                last= n;
                last.right = root;
                root.left = last;
        }
    }
 void deleteRight()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         
         Dnode t,t2 ;
	 t=t2=last;
         last.left =t2;
        root.left = t2;
        t2.right = root;
         System.out.println("Deleted:"+t.data);
     }
   }

 void printList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         do
         {
             System.out.println(t.data);
             t=t.right;
         }while(t!=root);
     }
   }

  /*void printRevList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         while(t.right!=null)//stop at last
         {
            t=t.right;
         }
         while(t!=null)//stop when null 
         {
             System.out.println(t.data);
             t=t.left;
         }
     }
   } */
   public static void main(String[] args) {
		
    int ch,e,key;
    DoublyCircularLinkedListTest obj=new  DoublyCircularLinkedListTest();
   Scanner in = new Scanner(System.in);
       obj.createList();
       do
       {
            System.out.println("1.Insert Left  2.Delete Left  3.Insert Right  4.Delete Right 5.Print List  0.Exit ");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                            System.out.println("Enter Data:");
                            e=in.nextInt();
                           obj.insertLeft(e);
                
                            System.out.println("Inserted");
                            break;
                    
                 case 2:
                            obj.deleteLeft();
                            break;
                    
                  case 3:
                            System.out.println("Enter Data:");
                            e=in.nextInt();
                            obj.insertRight( e);
                            System.out.println("Inserted at Right");
                            break;  
                            
                  case 4:
                            obj.deleteRight();
                               break;  
                 
                  case 5:
                            obj.printList();
                            break;

                 

               
          case 0:   System.out.println("Exiting ");
                break;

                  default:
                         System.out.println("Wrong option selected");
                         break;
            }
       }while(ch!=0);
    }
    
}
