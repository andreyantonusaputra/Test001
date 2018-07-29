package com.test;

class Animal {
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	void sing(String song) {
		System.out.println(song);
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing("I am singing");
	}
}