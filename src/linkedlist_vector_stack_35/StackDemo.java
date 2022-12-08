package linkedlist_vector_stack_35;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack stack=new Stack();
	stack.push("Ramesh");
	stack.push("Ram");
	stack.push("Rakesh");
	System.out.println(stack);
	System.out.println(stack.search("X"));   //If element not found then return -1
}
}