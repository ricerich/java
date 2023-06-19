package ex05.problem;

public class StringStack implements Stack {

	private String stack1[];
	private int top;
	
	public StringStack(int size)
	{
		stack1 = new String[size];
		top = -1;
	}
	
	@Override
	public int length() {
		return top+1;
	}

	@Override
	public int capacity() {
		return stack1.length;
	}
	
	@Override
	public boolean push(String val) {
		if(stack1.length == top+1)
			return false;
		else {
//			top = top +1;
//			stack1[top]=val;
			stack1[++top]=val;
			return true;
		}
	}

	@Override
	public String pop() {
		if(top == -1)
			return null;
		
//		String val = stack1[top];
//		top--;
		
		return stack1[top--];
	}
}










