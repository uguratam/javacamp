package Kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity

@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	
	// @Column(name = "category_id")
	// private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerInit;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	
	public Product() {
	}

	public Product(int id, String productName, double unitPrice, int unitsInStock, String quantityPerInit,
			Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerInit = quantityPerInit;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerInit() {
		return quantityPerInit;
	}

	public void setQuantityPerInit(String quantityPerInit) {
		this.quantityPerInit = quantityPerInit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
	

}
