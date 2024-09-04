package ir.freeland.springboot.persistence.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Item_NAME", length = 50, nullable = false, unique = false)
	private String name;	 // narges fayazbakhsh
	@Enumerated(EnumType.STRING)
	private Catalog catalog;
	@Column(name = "Prise", length = 50, nullable = true, unique = false)
	private double prise;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Catalog getCatalog() {
		return catalog;
	}
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", catalog=" + catalog + ", prise=" + prise + "]";
	}

	

}
