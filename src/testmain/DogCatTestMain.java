package testmain;

import entity.dogcatqueue.Cat;
import entity.dogcatqueue.Dog;
import service.DogCatQueue;

public class DogCatTestMain {
	public static void main(String[] args) {
		DogCatQueue queue = new DogCatQueue();
		queue.add(new Dog());
		queue.add(new Cat());
		queue.add(new Dog());
		queue.add(new Dog());
		queue.add(new Dog());
		queue.add(new Cat());
		queue.add(new Cat());
		queue.add(new Cat());
		queue.add(new Cat());
		queue.add(new Cat());
		while(!queue.isEmpty()){
			System.out.println(queue.poll().getPetType());
		}
	}
}
