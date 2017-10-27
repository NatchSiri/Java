import model.GenericStack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1.toString());
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1); 
		stack2.push(2);
		stack2.push(3);
		System.out.println(stack2.toString());
		
		//Max.max("Welcome", 23);
		//MaxUsingGenericType.max("Welcome", 23);
	}

}
