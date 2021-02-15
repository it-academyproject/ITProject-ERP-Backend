package cat.itacademy.proyectoerp.dto;

import java.util.List;

public class StatsClientOrderTimeFrameDTO {
	
	private Long idClient;
	private String timeFrame;
	private List<Integer> listOrdersPeriod;
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
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
	
	

}
