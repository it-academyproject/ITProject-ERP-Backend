package cat.itacademy.proyectoerp.dto;

import java.util.UUID;

public class StatsClientOrderAccumDTO {
	
	
	private UUID idClient;
	private Integer ordersAccum;
	
	public StatsClientOrderAccumDTO(UUID idClient, Integer ordersAccum) {
		super();
		this.idClient = idClient;
		this.ordersAccum = ordersAccum;
	}
	
	public UUID getIdClient() {
		return idClient;
	}
	public void setIdClient(UUID idClient) {
		this.idClient = idClient;
	}
	public Integer getOrdersAccum() {
		return ordersAccum;
	}
	public void setOrdersAccum(Integer ordersAccum) {
		this.ordersAccum = ordersAccum;
	}
	
	
}
