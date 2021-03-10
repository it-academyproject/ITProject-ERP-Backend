package cat.itacademy.proyectoerp.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

	// Products entity attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String name;
	private int stock;
	private String image;
	private String family;
	private double price;
	private double vat;
	private double wholesale_price;
	private int wholesale_quantity;
	private UUID order_id;


	// Constructors

	/**
	 * Constructor without parameters
	 */
	public Product() {
	}

	public Product(int id, String name, int stock, String image, String family, double price, double vat, double wholesale_price, int wholesale_quantity, UUID order_id) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.image = image;
		this.family = family;
		this.price = price;
		this.vat = vat;
		this.wholesale_price = wholesale_price;
		this.wholesale_quantity = wholesale_quantity;
		this.order_id = order_id;
	}

	public Product(int id, String name, int stock, String image, String family, double price, double vat, double wholesale_price, int wholesale_quantity) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.image = image;
		this.family = family;
		this.price = price;
		this.vat = vat;
		this.wholesale_price = wholesale_price;
		this.wholesale_quantity = wholesale_quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getWholesale_price() {
		return wholesale_price;
	}

	public void setWholesale_price(double wholesale_price) {
		this.wholesale_price = wholesale_price;
	}

	public int getWholesale_quantity() {
		return wholesale_quantity;
	}

	public void setWholesale_quantity(int wholesale_quantity) {
		this.wholesale_quantity = wholesale_quantity;
	}

	public UUID getOrder_id() {
		return order_id;
	}

	public void setOrder_id(UUID order_id) {
		this.order_id = order_id;
	}
}
