package com.rit.hibernate.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
	private Long productId;

	@SequenceGenerator(name = "product_seq", initialValue = 1000, // starting value (4 digits)
			allocationSize = 1)

	private String name;
	private String description;
	private Double price;
	private Double discount;
	private Integer quantity;
	private String brand;
	private String imageUrl;
	private Boolean active;
	private Category catagory = Category.DEFAULT;
	private Color color = Color.DEFAULT;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public enum Category {
		ELECTRONICS, CLOTHING, HOME_APPLIANCES, BOOKS, BEAUTY, SPORTS, FURNITURE, DEFAULT
	}

	public enum Color {
		RED, BLUE, GREEN, PINK, BLACK, WHITE, DEFAULT
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Category getCatagory() {
		return catagory;
	}

	public void setCatagory(Category catagory) {
		this.catagory = catagory;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", discount=" + discount + ", quantity=" + quantity + ", brand=" + brand + ", imageUrl="
				+ imageUrl + ", active=" + active + ", catagory=" + catagory + ", color=" + color + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
