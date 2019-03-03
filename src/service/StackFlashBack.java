package service;

import java.util.Stack;
/**
 * ����һ��ջ�ķ���ʵ�� --�ݹ�
 * @author yejiawei
 *
 * 2019��3��3��
 */
public class StackFlashBack {
	
	/**
	 * ����һ��ջʵ�֣��õ����һ��ֵ����remove�ĵݹ鷽��
	 * @param stack 3 2 1  ѹ�� 2 3 ������1
	 * @return
	 */
	public int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.isEmpty()){
			return result;
		}else{
			//��������һ��ֵ
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	public void flashBack(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}else{
			int num = getAndRemoveLastElement(stack);//����ֻ�򵥵Ŀ����õ�ջ��Ԫ�أ��Լ��Ƴ� ����
			flashBack(stack);
			stack.push(num);
		}
	}
}
