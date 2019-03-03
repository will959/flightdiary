package service;

import java.util.Stack;

/**
 * 两个栈实现队列
 * @author yejiawei
 *
 * 2019年3月1日
 */
public class TwoStackQueue {
	private Stack<Integer> stackPush ;
	private Stack<Integer> stackPop ;
	
	public TwoStackQueue(){
		this.stackPop= new Stack<Integer>();
		this.stackPush = new Stack<Integer>();
	}
	
	/**
	 *  添加一个元素
	 */
	public void add(int num){
		this.stackPush.push(num);
	}
	/**
	 *  移除并返问队列头部的元素    如果队列为空，则返回null
	 * @return
	 */
	public int poll(){
		if(this.stackPop.isEmpty()&&stackPush.isEmpty()){
			throw new RuntimeException("你的栈为空");
		}
		if(this.stackPop.isEmpty()){
			while(!this.stackPush.isEmpty()){
				this.stackPop.push(stackPush.pop());
			}
		}
		return this.stackPop.pop();
	}
	/**
	 * 返回队列头部的元素             如果队列为空，则返回null
	 * @return
	 */
	public int peek(){
		if(this.stackPop.isEmpty()&&stackPush.isEmpty()){
			throw new RuntimeException("你的栈为空");
		}
		if(this.stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				this.stackPop.push(stackPush.pop());
			}
		}
		return this.stackPop.peek();
	}
	/**
	 * 是否是空的  当两个栈都为空时队列才为空
	 * @return
	 */
	public boolean isEmpty(){
		if(this.stackPop.isEmpty()&&this.stackPush.isEmpty()){
			return true;
		}
		return false;
	}
}
