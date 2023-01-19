package pro.logic;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("bk")
public class Bike extends Showroom {
	
	
	int chasisNo;
	
	String name;
	
	String colour;
	public int getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Bike [chasisNo=" + chasisNo + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
}
