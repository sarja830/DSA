package basics.stack;
import basics.stack.Stack;
public class Driver {

	public static void main(String args[])
	{	Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		System.out.println(st.push(6));
		System.out.println(st.size());
		st.show();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(" \n");
		st.show();
	}

}
