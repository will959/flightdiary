package testmain;

import java.util.Stack;

import service.SortStackByStack;
import service.StackCanGetMaxMin;
import service.TwoStackQueue;

/**
 * ջ����main������
 * yjw
 */
public class StackTestMain {
	public static void main(String[] args) {
		//���ڲ��� ��������Сֵ��ջ
		StackCanGetMaxMin stack1 = new StackCanGetMaxMin();
		stack1.push(5);
		stack1.push(3);
		stack1.push(2);
		stack1.push(4);
		stack1.push(1);
		stack1.push(3);
		System.out.println(stack1.getMax());
		System.out.println(stack1.getMin());
		//���ڲ��� ����ջʵ�ֶ���
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
		
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(5);
		stack2.push(4);
		stack2.push(3);
		stack2.push(2);
		stack2.push(1);
		System.out.println("�ݹ鵹��ʼ");
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
		System.out.println("�ݹ鵹�����");
		stack2.push(5);
		stack2.push(3);
		stack2.push(2);
		stack2.push(1);
		stack2.push(4);
		stack2 = SortStackByStack.sortStack(stack2);
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
	}
}
