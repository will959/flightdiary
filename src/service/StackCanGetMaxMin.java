package service;
import java.util.Stack;
/**
 * ʵ�ֿ����õ���СMin,���Maxֵ ��ջ
 * @author yejiawei
 * 
 * 2019��3��1��
 */
public class StackCanGetMaxMin{
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	private Stack<Integer> stackMax;
	public StackCanGetMaxMin(){
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
		this.stackMax = new Stack<Integer>();
	}
	/**
	 * ѹ������  ��ѹ������ݱ�minС��ʱ������stackMin
	 * @param num
	 */
	public void push(int num){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(num);
		}
		if(this.stackMax.isEmpty()){
			this.stackMax.push(num);
		}
		if(num <= this.getMin()){
			this.stackMin.push(num);
		}
		if(num >=this.getMax()){
			this.stackMax.push(num);
		}
		this.stackData.push(num);
	}
	/**
	 * �ó����ݲ��Ƴ�
	 * @return
	 */
	public int Pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("�㴴����ջΪ��");
		}
		int value = this.stackData.pop();
		if(value == this.getMin()){
			this.stackMin.pop();
		}
		if(value == this.getMax()){
			this.stackMax.pop();
		}
		return value;
	}
	/**
	 * �鿴��С���ݲ��Ƴ�
	 */
	public int getMin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("�㴴����ջΪ��");
		}
		return this.stackMin.peek();
		
	}
	/**
	 * �鿴������ݲ��Ƴ�
	 * @return
	 */
	public int getMax(){
		if(this.stackMax.isEmpty()){
			throw new RuntimeException("�㴴����ջΪ��");
		}
		return this.stackMax.peek();
	}
}
