package cat.itacademy.proyectoerp.util;


import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;
import cat.itacademy.proyectoerp.dto.TimeFramePageDTOImpl;

//Class responsible to validate the entry DTOs for Order Stats
public class TimeFrameValidatorImpl implements ITimeFrameValidator  {

	// Validate if the timeframe is correct.
	@Override
	public boolean checkParamatersDTO (TimeFrameDTOImpl dto) {

		if (dto.getTimeFrame().equals("W") || dto.getTimeFrame().equals("M") || dto.getTimeFrame().equals("Y")) {

			return true;
		}

		return false;

	}

	// Validate if the timeframe is correct.
		@Override
		public boolean checkParamatersDTO (TimeFramePageDTOImpl dto) {

			if (dto.getTimeFrame().equals("W") || dto.getTimeFrame().equals("M") || dto.getTimeFrame().equals("Y")) {

				return true;
			}

			return false;

		}

	
	
	

}

