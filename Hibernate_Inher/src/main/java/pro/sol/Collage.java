package pro.sol;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name="coll",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("col")
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int c_id;
	String c_name;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Collage [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
	  
}
