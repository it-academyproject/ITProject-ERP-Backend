package cat.itacademy.proyectoerp.dto;

import java.sql.Date;


public class TimeFramePageDTOImpl implements IPageDTO, ITimeFrameDTO {

	private Date periodInit;
	private Date periodFinal;
	private String timeFrame;
	private int pageNumber;
	private int pageSize;
	
	
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
