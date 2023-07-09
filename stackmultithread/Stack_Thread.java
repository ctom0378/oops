//WAP to implement Stack using multithreading
class Stack
{
	int s[];
	int top;
	boolean f=false;
	Stack()
	{
		top=-1;
		s=new int[10];
	}
	synchronized void push(int i)
	{
            while(f==true)
            {
		try
		{
                    wait();
		}
		catch(Exception e)
		{
                    System.out.println("InterruptedException caught");
		}
            }
           if(top==(9))
           	System.out.println("Stack overflow");
           else
           {
           	top++;
           	s[top]=i;
           	System.out.println("New element is : "+s[top]);
           }
            f=true;
            notifyAll();
	}
	synchronized void pop()
	{
            while(f==false)
            {
		try
		{
                    wait();
		}
		catch(Exception e)
		{
                    System.out.println("InterruptedException caught");	
		}
            }
            if(top==(-1))
            	System.out.println("Stack underflow");
            else
            {
		System.out.println("Deleted element is : "+s[top]);
		top--;
            }
            f=false;
            notifyAll();
	}
}
class Pop_R extends Thread
{
	Stack st;
	Pop_R(Stack ob)
	{
		st=ob;
	}
	public void run()
	{
            int i=1;
            while(i<=10)
            {
                st.pop();
		try
		{
                    Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		i++;
            }
	}
}
class Push_R extends Thread
{
	Stack st;
	Push_R(Stack ob)
	{
		st=ob;
	}
	public void run()
	{
            int i=1;
            while(i<=10)
            {
		st.push(i);
		try
		{
                    Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		i++;
            }
	}
}
public class Stack_Thread
{
	public static void main(String args[])
	{
		Stack st=new Stack();
		Push_R p1=new Push_R(st);
		Pop_R p2=new Pop_R(st);
		p1.start();
		p2.start();
    }

}
