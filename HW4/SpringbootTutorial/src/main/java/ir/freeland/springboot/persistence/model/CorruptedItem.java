package ir.freeland.springboot.persistence.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="CorruptedItem")
public class CorruptedItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;
    @OneToOne(cascade = CascadeType.ALL) // narges fayazbakhsh
    @JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;	
	@Column(name = "Reason", length = 50, nullable = true, unique = false)
	private String reason;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "CorruptedItem [id=" + id + ", item=" + item + ", reason=" + reason + "]";
	}	

	

	

}
