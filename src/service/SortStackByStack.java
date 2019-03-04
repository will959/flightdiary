package service;

import java.util.Stack;
/**
 * 用一个栈实现另一个栈的排序
 * @author yejiawei
 * 利用栈的原理反复循环导入
 * 2019年3月4日
 */
public class SortStackByStack {
	public static Stack<Integer> sortStack(Stack<Integer> stack){
		Stack<Integer> cacheStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			while(!cacheStack.isEmpty()&&cacheStack.peek()<cur){
				stack.push(cacheStack.pop());
			}
			cacheStack.push(cur);
		}
		while (!cacheStack.isEmpty()){
			stack.push(cacheStack.pop());
		}
		return stack;
	}
}
