package pro.logic;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@DiscriminatorColumn(name="Showroom_type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Showroom")
public class Showroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String show_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShow_name() {
		return show_name;
	}

	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}

	@Override
	public String toString() {
		return "Showroom [id=" + id + ", show_name=" + show_name + "]";
	}
	
	
	
}
