package cat.itacademy.proyectoerp.dto;

import java.util.List;
import java.util.UUID;

public class StatsClientOrderTimeFrameDTO {
	
	private UUID idClient;
	private String timeFrame;
	private List<Integer> listOrdersPeriod;
	
	public UUID getIdClient() {
		return idClient;
	}
	public void setIdClient(UUID idClient) {
		this.idClient = idClient;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	public List<Integer> getListOrdersPeriod() {
		return listOrdersPeriod;
	}
	public void setListOrdersPeriod(List<Integer> listOrdersPeriod) {
		this.listOrdersPeriod = listOrdersPeriod;
	}
	public StatsClientOrderTimeFrameDTO(UUID idClient, String timeFrame, List<Integer> listOrdersPeriod) {
		super();
		this.idClient = idClient;
		this.timeFrame = timeFrame;
		this.listOrdersPeriod = listOrdersPeriod;
	}
	
	

}
