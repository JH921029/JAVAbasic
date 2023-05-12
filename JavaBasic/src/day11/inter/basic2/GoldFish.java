package day11.inter.basic2;

public class GoldFish extends Fish implements IPet{
	
	public void swim() {
		
	}

	@Override
	public void play() {
		System.out.println("혼자 놀아요");
	}

}
