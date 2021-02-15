package cat.itacademy.proyectoerp.dto;

import java.time.LocalDate;

public class TimeFramePageDTOImpl implements IPageDTO, ITimeFrameDTO {

	private LocalDate periodInit;
	private LocalDate periodFinal;
	private String timeFrame;
	private int pageNumber;
	private int pageSize;
	
	
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
	
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
