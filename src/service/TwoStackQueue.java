package service;

import java.util.Stack;

/**
 * ����ջʵ�ֶ���
 * @author yejiawei
 *
 * 2019��3��1��
 */
public class TwoStackQueue {
	private Stack<Integer> stackPush ;
	private Stack<Integer> stackPop ;
	
	public TwoStackQueue(){
		this.stackPop= new Stack<Integer>();
		this.stackPush = new Stack<Integer>();
	}
	
	/**
	 *  ���һ��Ԫ��
	 */
	public void add(int num){
		this.stackPush.push(num);
	}
	/**
	 *  �Ƴ������ʶ���ͷ����Ԫ��    �������Ϊ�գ��򷵻�null
	 * @return
	 */
	public int poll(){
		if(this.stackPop.isEmpty()&&stackPush.isEmpty()){
			throw new RuntimeException("���ջΪ��");
		}
		if(this.stackPop.isEmpty()){
			while(!this.stackPush.isEmpty()){
				this.stackPop.push(stackPush.pop());
			}
		}
		return this.stackPop.pop();
	}
	/**
	 * ���ض���ͷ����Ԫ��             �������Ϊ�գ��򷵻�null
	 * @return
	 */
	public int peek(){
		if(this.stackPop.isEmpty()&&stackPush.isEmpty()){
			throw new RuntimeException("���ջΪ��");
		}
		if(this.stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				this.stackPop.push(stackPush.pop());
			}
		}
		return this.stackPop.peek();
	}
	/**
	 * �Ƿ��ǿյ�  ������ջ��Ϊ��ʱ���в�Ϊ��
	 * @return
	 */
	public boolean isEmpty(){
		if(this.stackPop.isEmpty()&&this.stackPush.isEmpty()){
			return true;
		}
		return false;
	}
}
