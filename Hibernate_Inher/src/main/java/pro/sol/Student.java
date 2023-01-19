package pro.sol;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("std")
public class Student extends Collage {


	int s_id;
	String s_name;
	String s_stream;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_stream() {
		return s_stream;
	}
	public void setS_stream(String s_stream) {
		this.s_stream = s_stream;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_stream=" + s_stream + "]";
	}
	
	
}
