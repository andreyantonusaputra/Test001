package com.test;

class Animal {
	public void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	protected String sound;
	protected boolean canSwim;
	
	public Bird() {
	}
	public void fly() {
		System.out.println("I am flying");
	}
	public void sing(String song) {
		System.out.println(song);
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
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
	public void fly() {
		System.out.println("Chicken can't fly");
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
	}
}
