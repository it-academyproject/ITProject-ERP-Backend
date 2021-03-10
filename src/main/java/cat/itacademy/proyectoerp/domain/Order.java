package cat.itacademy.proyectoerp.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import cat.itacademy.proyectoerp.util.StringToListConverter;

@Entity
@Table(name = "orders")
public class Order {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "id", columnDefinition = "BINARY(16)")
	private UUID id;
	@Column
	private String employeeId;
	@Column
	private String clientId;
	@Column
	private Date date;
	@Column
	@Enumerated(EnumType.STRING)
	private OrderStatus status;

	//@Convert(converter = StringToListConverter.class)
	//private List<String> productsId;
	@OneToMany(mappedBy = "order_id", cascade = {
					CascadeType.ALL
	})
	private List<Product> products;

	/** @ManyToOne
	@JsonIgnore
	@JoinColumn(name="employee_id")
	private Employee employee; */

	public Order() {
	}

	
	public Order(String employeeId, String clientId, Date date, OrderStatus status, List<Product> products) {
		this.employeeId = employeeId;
		this.clientId = clientId;
		this.date = date;
		this.status = status;
		this.products = products;
	}


	public Order(UUID id, String employeeId, String clientId, Date date, OrderStatus status, List<Product> products) {
		this.id = id;
		this.employeeId = employeeId;
		this.clientId = clientId;
		this.date = date;
		this.status = status;
		this.products = products;
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
