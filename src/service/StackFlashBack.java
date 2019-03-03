package service;

import java.util.Stack;
/**
 * 倒叙一个栈的方法实现 --递归
 * @author yejiawei
 *
 * 2019年3月3日
 */
public class StackFlashBack {
	
	/**
	 * 传入一个栈实现，得到最后一个值并且remove的递归方法
	 * @param stack 3 2 1  压入 2 3 返回了1
	 * @return
	 */
	public int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.isEmpty()){
			return result;
		}else{
			//继续拿下一个值
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	public void flashBack(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}else{
			int num = getAndRemoveLastElement(stack);//这里只简单的看做得到栈底元素，以及移除 函数
			flashBack(stack);
			stack.push(num);
		}
	}
}
