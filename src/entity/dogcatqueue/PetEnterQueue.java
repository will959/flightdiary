package entity.dogcatqueue;
/**
 * ��װPet�࣬����˳��ı��
 * @author yejiawei
 *
 * 2019��3��4��
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
