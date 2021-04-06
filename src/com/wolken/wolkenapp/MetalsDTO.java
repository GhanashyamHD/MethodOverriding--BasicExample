package com.wolken.wolkenapp;

public class MetalsDTO {
	private String name;
	private int atomicNo;
	private String reactivity;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAtomicNo() {
		return atomicNo;
	}
	public void setAtomicNo(int atomicNo) {
		this.atomicNo = atomicNo;
	}
	public String getReactivity() {
		return reactivity;
	}
	public void setReactivity(String reactivity) {
		this.reactivity = reactivity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "MetalsDTO-Name:"+ this.name+"|Atomic:" + this.atomicNo+"|Reactivity:"+ this.reactivity+"|Color:"+ this.color;
		//return super.toString();
				
	}
	@Override 
	public int hashCode() {
		return atomicNo;
	}
	@Override
	
	public boolean equals(Object obj) {
		//down casting
		MetalsDTO dto = (MetalsDTO) obj;
		if(obj == null)
			return false;
		else {
				if(obj instanceof MetalsDTO )
				{
					if(this.hashCode() == obj.hashCode() )
						return true ;
				}
			}
		return false;
	}
	 

}
