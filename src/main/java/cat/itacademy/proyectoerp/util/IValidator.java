package cat.itacademy.proyectoerp.util;


import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;

public interface IValidator {

	//Validate if the timeframe is correct. If not, throw ArgumentNotValidException	
	public boolean checkNotValidTimeFrame (TimeFrameDTOImpl dto);
	
}
