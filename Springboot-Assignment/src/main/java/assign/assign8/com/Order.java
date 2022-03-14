package assign.assign8.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	private String id;
	private String totalOrder;
	private String orderDate;
	
	public Order() {
	
	}
	
	public Order(String id, String totalOrder, String orderDate) {
		super();
		this.id = id;
		this.totalOrder = totalOrder;
		this.orderDate = orderDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(String totalOrder) {
		this.totalOrder = totalOrder;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
