package cat.itacademy.proyectoerp.dto;

import java.time.LocalDate;

public class TimeFrameDTOImpl implements ITimeFrameDTO {

	private LocalDate periodInit;
	private LocalDate periodFinal;
	private String timeFrame;
	
	public LocalDate getPeriodInit() {
		return periodInit;
	}
	public void setPeriodInit(LocalDate periodInit) {
		this.periodInit = periodInit;
	}
	public LocalDate getPeriodFinal() {
		return periodFinal;
	}
	public void setPeriodFinal(LocalDate periodFinal) {
		this.periodFinal = periodFinal;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	
	
}
