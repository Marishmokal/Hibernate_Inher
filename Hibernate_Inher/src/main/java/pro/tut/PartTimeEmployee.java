package pro.tut;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PTE")
public class PartTimeEmployee extends Employee {
	
	int hourlyPay;

public int getHourlyPay() {
	return hourlyPay;
}

public void setHourlyPay(int hourlyPay) {
	this.hourlyPay = hourlyPay;
}

@Override
public String toString() {
	return "PartTimeEmployee [hourlyPay=" + hourlyPay + "]";
}


}
