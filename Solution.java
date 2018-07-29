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
	public void fly() {
		System.out.println("Chicken can't fly");
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
	}
}
