package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {

		Animal dog = new Dog(); //뉴 도그는 애니멀타입에 저장
		Animal cat = new Cat(); //뉴 캣은 애니멀타입에 저장
		Animal tiger = new Tiger(); //뉴 타이거는 애니멀타입에 저장

		Animal[] animals = {dog, cat, tiger};// 애니멀 타입의 동물 animals에 저장

		for(Animal ani : animals) {
			ani.eat();//Animal의 기능
		}

		//dog, cat은 인터페이스로 형변환이 된다
		//dog, cat, goldfish를 저장하고 반복문 돌려보세요

		//개 고양이 금붕어
		IPet[] pets = new IPet[3];
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
		for(IPet p : pets) {
			p.play();
		}
		
		System.out.println("===============================");
		
		
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
		PetHouse.carePet(pets[2]);


		//		IPet dog2 = new Dog();
		//		IPet cat2 = new Cat();
		//		IPet goldfish = new GoldFish();


		//		IPet[] pets = {dog2, cat2, goldfish};
		//		
		//		for(IPet ip : pets) {
		//			
		//			ip.paly();
		//		}



	}
}

