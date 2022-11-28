import java.util.*;

class Dcnode
{
    int data;
    Dcnode left,right;
    Dcnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class DoublyCircularLinkedList {
	
	Dcnode root, last;
	   
    void createList()
    {
        root=last=null;
    }
    
    void insertLeft(int data)
    {
    	Dcnode n=new Dcnode(data);
    	if(root==null)
        {
            root=last=n;
            
            last.right= last.left =root;
        }
    	else
    	{
    		n.right = root;
    		n.left = last;
    		root.left = n;
    		last.right = n;
    		root = n;
    	}
     }
    
    void deleteLeft() 
    {
    	if(root==null)
        {
            System.out.println("List Empty");
        }
    	else
    	{
    		Dcnode t = root;
    		if(root.right==root)
    		{
    			root=last=null;
    		}
    		else
    		{
    			root = root.right;
    			root.left = last;
    			last.right = root;
    		}
    		System.out.println("Deleted:"+t.data);
    	}
    }
    
    void insertRight(int data) 
    {
    	Dcnode n=new Dcnode(data);
        if(root==null)
        {
            root=last=n;
            last.right= last.left =root;
        }
        else
        {
        	last.right = n;
        	n.left = last;
        	n.right = root;
        	last = n;
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
    		Dcnode t,t2;
            t=t2=root;
            if(root.right==root)
            {
                root=last=null;
            }
            else
            {
            	while(t!=last)//2
                {
                    t2=t;
                    t=t.right;
                }
                last=t2;
                last.right = root;
                root.left = last;
            }
            System.out.println("Deleted:"+t.data);
    	}
    }
    
    void printList()
    {
    	if(root==null)
    	{
    		 System.out.println("List Empty");
    	}
    	else
    	{
    		Dcnode t = root;
    		do
            {
                System.out.println(t.data);
                t=t.right;
            } while(t!=root);
    	}
    }
    
    public static void main(String[] args) {
	
        int ch,e;
        DoublyCircularLinkedList obj=new  DoublyCircularLinkedList();
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
                                obj.insertRight(e);
                                System.out.println("Inserted at Right");
                                break;  
                                
                      case 4:
                                obj.deleteRight();
                                   break;  
                     
                      case 5:
                                obj.printList();
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
