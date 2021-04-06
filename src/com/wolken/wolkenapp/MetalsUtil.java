package com.wolken.wolkenapp;

public class MetalsUtil {

	public static void main(String[] args) {
		MetalsDTO dto = new MetalsDTO();
		dto.setName("lead");
		dto.setAtomicNo(82);
		dto.setReactivity("non");
		dto.setColor("black");
		MetalsDTO dto1 = new MetalsDTO();
		dto1.setName("copper");
		dto1.setAtomicNo(29);
		dto1.setReactivity("high");
		dto1.setColor("red");

		System.out.println(dto.hashCode());
		System.out.println(dto1.hashCode());
		System.out.println(dto.equals(dto1));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
