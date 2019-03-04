package service;

import java.util.Stack;
/**
 * ��һ��ջʵ����һ��ջ������
 * @author yejiawei
 * ����ջ��ԭ����ѭ������
 * 2019��3��4��
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
