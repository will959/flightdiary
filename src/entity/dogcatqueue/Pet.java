package entity.dogcatqueue;
/**
 * 宠物父类
 * @author yejiawei
 *
 * 2019年3月4日
 */
public class Pet {
	private String type;
	public Pet(String type){
		this.type = type;
	}
	public String getPetType(){
		return this.type;
	}
}
