package testmain;

import service.StackCanGetMaxMin;
import service.TwoStackQueue;

/**
 * 栈操作main方法类
 */
public class StackTestMain {
	public static void main(String[] args) {
		//用于测试 获得最大最小值的栈
		StackCanGetMaxMin stack1 = new StackCanGetMaxMin();
		stack1.push(5);
		stack1.push(3);
		stack1.push(2);
		stack1.push(4);
		stack1.push(1);
		stack1.push(3);
		System.out.println(stack1.getMax());
		System.out.println(stack1.getMin());
		//用于测试 两个栈实现队列
		TwoStackQueue queue = new TwoStackQueue();
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		queue.add(0);
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}
