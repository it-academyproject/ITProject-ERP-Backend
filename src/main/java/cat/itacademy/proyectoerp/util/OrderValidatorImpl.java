package cat.itacademy.proyectoerp.util;

import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;

//Class responsible to validate the entry DTOs for Order Stats
public class OrderValidatorImpl implements IValidator {

	// Validate if the timeframe is correct.
	@Override
	public boolean checkNotValidTimeFrame(TimeFrameDTOImpl dto) {

		if (!dto.getTimeFrame().equals("W") && !dto.getTimeFrame().equals("M") && !dto.getTimeFrame().equals("Y")) {

			return true;
		}

		return false;

	}

}