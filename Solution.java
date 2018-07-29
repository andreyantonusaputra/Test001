package com.test;

class Animal {
	protected String sound;
	protected boolean canFly;
	protected boolean canWalk;
	protected boolean canSwim;
	protected boolean canSing;
	protected String size;
	protected String color;
	protected String food;
	protected String remark;
	
	public Animal() {
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public void fly(){
		if (canFly) {
			System.out.println("I am flying");
		} else {
			System.out.println("I can't fly");
		}
	}
	public boolean isCanWalk() {
		return canWalk;
	}
	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	public boolean isCanSing() {
		return canSing;
	}
	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}
	public void walk(){
		if (canWalk) {
			System.out.println("I am walking");
		} else {
			System.out.println("I can't walk");
		}
	}
	public String isSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String isColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String isFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String isRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

class Bird extends Animal {
	public Bird() {
		this.canSing = true;
		this.canWalk = true;
	}
	public void sing(String song) {
		System.out.println(song);
	}
}

class Duck extends Bird {
	public Duck() {
		this.sound = "Quack, quack";
		this.canSwim = true;
	}
}

class Chicken extends Bird {
	public Chicken() {
		this.sound = "Cluck, cluck";
	}
	public Chicken(String sound) {
		this.sound = sound;
	}
}

class Parrot extends Bird {
	private String areaOfLiving;
	
	public Parrot() {
	}
	public Parrot(String areaOfLiving, String sound) {
		this.areaOfLiving = areaOfLiving;
		this.sound = sound;
	}
	public String getAreaOfLiving() {
		return areaOfLiving;
	}
	public void setAreaOfLiving(String areaOfLiving) {
		this.areaOfLiving = areaOfLiving;
	}
}

class Fish extends Animal {
	public Fish() {
		this.canSwim = true;
		this.canWalk = false;
	}
}

class Shark extends Fish {
	public Shark() {
		this.size = "Large";
		this.color = "Grey";
		this.food = "Other fish";
	}
	public void printInfo() {
		System.out.println(this.size + "-" + this.color + "-" + this.food);
	}
}

class Clownfish extends Fish {
	public Clownfish() {
		this.size = "Small";
		this.color = "Colorful/Orange";
		this.remark = "like to makes joke";
	}
	public void printInfo() {
		System.out.println(this.size + "-" + this.color + "-" + this.remark);
	}
}

class Dolphin extends Animal {
	public Dolphin() {
		this.canSwim = true;
		this.canWalk = false;
	}
}

class Butterfly extends Animal {
	public Butterfly() {
		this.canFly = true;
	}
	public Butterfly(boolean canFly, boolean canWalk) {
		this.canFly = canFly;
		this.canWalk = canWalk;
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing("I am singing");
		
		Duck duck = new Duck();
		System.out.println(duck.getSound());
		System.out.println(duck.isCanSwim());
		
		Chicken chicken = new Chicken();
		System.out.println(chicken.getSound());
		chicken.fly();
		
		Chicken rooster = new Chicken("Cock-a-doodle-doo");
		System.out.println(rooster.getSound());
		
		Parrot parrot1 = new Parrot("living with dogs","Woof, woof");
		Parrot parrot2 = new Parrot("living with cats","Meow");
		Parrot parrot3 = new Parrot("living near the rooster","Cock-a-doodle-doo");
		Parrot parrot4 = new Parrot("living near the duck","Quack, quack");
		System.out.println(parrot1.getSound());
		System.out.println(parrot2.getSound());
		System.out.println(parrot3.getSound());
		System.out.println(parrot4.getSound());
		
		Fish fish = new Fish();
		fish.walk();
		System.out.println(fish.isCanSwim());
		
		Shark shark = new Shark();
		shark.printInfo();
		Clownfish clownfish = new Clownfish();
		clownfish.printInfo();
		
		Dolphin dolphin = new Dolphin();
		System.out.println(dolphin.isCanSwim());
		
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		
		Butterfly caterpillar = new Butterfly(false, true);
		caterpillar.fly();
		caterpillar.walk();
		
		Animal[] animals = new Animal[]{
								new Bird(),
								new Duck(),
								new Chicken(),
								new Chicken("Cock-a-doodle-doo"),
								new Parrot(),
								new Fish(),
								new Shark(),
								new Clownfish(),
								new Dolphin(),
								new Butterfly(),
								};
		int countCanFly = 0;
		int countCanWalk = 0;
		int countCanSwim = 0;
		int countCanSing = 0;
		for (Animal tmpAnimal : animals) {
			if (tmpAnimal.canFly) {
				countCanFly++;
			}
			if (tmpAnimal.canWalk) {
				countCanWalk++;
			}
			if (tmpAnimal.canSwim) {
				countCanSwim++;
			}
			if (tmpAnimal.canSing) {
				countCanSing++;
			}
		}
		System.out.println("canFly: " + countCanFly
						+ "; canWalk: " + countCanWalk
						+ "; canSwim: " + countCanSwim
						+ "; canSing: " + countCanSing);
	}
}
