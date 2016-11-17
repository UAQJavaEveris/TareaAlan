package com.mx.everis.tallerjava.Test;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Jorge Alan Fuentes Flores";
		Random rd = new Random();
		int rndNum = rd.nextInt((29-4)+1)+4;
		String num = ""+rndNum;
		String nuevo = nombre.replaceAll("\\s", num);
		System.out.println(nuevo);
	}

}
