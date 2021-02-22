package cat.itacademy.proyectoerp.util;



import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;
import cat.itacademy.proyectoerp.dto.TimeFramePageDTOImpl;


public interface ITimeFrameValidator  {

	//Validate if the timeframe is correct. If not, throw ArgumentNotValidException	
	public boolean checkParamatersDTO (TimeFrameDTOImpl dto);
	public boolean checkParamatersDTO (TimeFramePageDTOImpl dto);
	
	
}
