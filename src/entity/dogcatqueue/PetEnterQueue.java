package entity.dogcatqueue;
/**
 * 包装Pet类，打上顺序的标记
 * @author yejiawei
 *
 * 2019年3月4日
 */
public class PetEnterQueue {
	private Pet pet;
	private long count;
	
	public PetEnterQueue(Pet pet ,long count){
		this.pet = pet;
		this.count = count;
	}
	public String getEnterPetType(){
		return this.pet.getPetType();
	}
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
}
