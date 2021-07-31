package com.blz.day5problems;
import java.util.Random;
public class Day5Problems {
	public static void main(String[] args) {
		//Coin-Simulation
		int coin = (int)Math.floor(Math.random()*2);
		System.out.println(coin);
		if(coin == 1) {
			System.out.println("Heads");
		}
		else {
			System.out.println("Tails");
		}
	}

}
