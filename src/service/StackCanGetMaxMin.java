package service;
import java.util.Stack;
/**
 * 实现可以拿到最小Min,最大Max值 的栈
 * @author yejiawei
 * 
 * 2019年3月1日
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
	 * 压入数据  当压入的数据比min小的时候亚茹stackMin
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
	 * 拿出数据并移除
	 * @return
	 */
	public int Pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("你创建的栈为空");
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
	 * 查看最小数据不移除
	 */
	public int getMin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("你创建的栈为空");
		}
		return this.stackMin.peek();
		
	}
	/**
	 * 查看最大数据不移除
	 * @return
	 */
	public int getMax(){
		if(this.stackMax.isEmpty()){
			throw new RuntimeException("你创建的栈为空");
		}
		return this.stackMax.peek();
	}
}
