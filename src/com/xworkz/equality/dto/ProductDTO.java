package com.xworkz.equality.dto;

public class ProductDTO {

	private Integer id;
	private String name;
	private String type;
	private String price;
	private String quantity;
	
	public ProductDTO(Integer id, String name, String type, String price, String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ProductDTO) {
				ProductDTO dto =(ProductDTO)obj;
				if(this.id.equals(dto.getId())) {
					return true;
				}
			}
		}
		return false;
	}
	
}
