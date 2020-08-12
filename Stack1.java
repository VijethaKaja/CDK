import java.lang.*;
class Stack1 {
	int max=100;
	String st[]=new String[max];
    int top=-1;
    public void push(String s)
    {
    	if (top==max-1) {
    		System.out.println("Stack overflow");
    		return;
    	}
    	top+=1;
    	st[top]=s;
    }
    public String pop()
    {
    	if (top==-1)
    	{
    		return "Stack is empty";
    	}
    	
    	String s1=st[top];
    	top-=1;
    	return s1;
    }
    String topelement()
    {
    	return st[top];
    }
    boolean isEmpty()
    {
    	if( top==-1)
    			return true;
    	return false;
    }
}
public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack1 sta=new Stack1();
		sta.push("vijetha");
		sta.push("Thry");
		sta.pop();
		sta.topelement();
		sta.pop();
		sta.isEmpty();
	}

}
