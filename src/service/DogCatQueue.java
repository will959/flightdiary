package service;

import java.util.LinkedList;
import java.util.Queue;

import entity.dogcatqueue.Cat;
import entity.dogcatqueue.Dog;
import entity.dogcatqueue.Pet;
import entity.dogcatqueue.PetEnterQueue;
/**
 * 实现猫狗队列
 * @author yejiawei
 * FIFO pollAll   FIFO pollDog FIFO cat 
 * 2019年3月4日
 */
public class DogCatQueue {
	private Queue<PetEnterQueue> cat;
	private Queue<PetEnterQueue> dog;
	private long count;
	
	public DogCatQueue(){
		this.cat = new LinkedList<PetEnterQueue>();
		this.dog = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}
	private boolean isCat(Pet pet){
		if(pet.getPetType().equals("cat")){
			return true;
		}
		return false;
	}
	private boolean isDog(Pet pet){
		if(pet.getPetType().equals("dog")){
			return true;
		}
		return false;
	}
	public void add(Pet pet){
		if(isCat(pet)){
			this.cat.add(new PetEnterQueue(pet, count++));
		}else if(isDog(pet)){
			this.dog.add(new PetEnterQueue(pet, count++));
		}else{
			throw new RuntimeException("暂只支持猫狗");
		}
	}
	/**
	 * 实现按顺序进队的猫狗顺序出队
	 * @return
	 */
	public Pet poll(){
		if(!this.dog.isEmpty()&&!this.cat.isEmpty()){
			if(this.dog.peek().getCount() <this.cat.peek().getCount()){
				return this.dog.poll().getPet();
			}else{
				return this.cat.poll().getPet();
			}
		}else if(!this.dog.isEmpty()){
			return this.dog.poll().getPet();
		}else if(!this.cat.isEmpty()){
			return this.cat.poll().getPet();
		}else{
			return null;
		}
	}
	public Dog pollDog(){
		if(!this.dog.isEmpty()){
			return (Dog)this.dog.poll().getPet();
		}
		return null;
	}
	public Cat pollCat(){
		if(!this.cat.isEmpty()){
			return (Cat)this.cat.poll().getPet();
		}
		return null;
	}
	public boolean isEmpty(){
		return this.cat.isEmpty()&&this.dog.isEmpty();
	}
	public boolean isCatEmpty(){
		return this.cat.isEmpty();
	}
	public boolean isDogEmpty(){
		return this.dog.isEmpty();
	}
}
