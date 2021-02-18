package cat.itacademy.proyectoerp.dto;

import java.sql.Date;

public class TimeFrameDTOImpl implements ITimeFrameDTO {

	private Date periodInit;
	private Date periodFinal;
	private String timeFrame;
	
	public Date getPeriodInit() {
		return periodInit;
	}
	public void setPeriodInit(Date periodInit) {
		this.periodInit = periodInit;
	}
	public Date getPeriodFinal() {
		return periodFinal;
	}
	public void setPeriodFinal(Date periodFinal) {
		this.periodFinal = periodFinal;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	
	
}
