package cat.itacademy.proyectoerp.util;

import cat.itacademy.proyectoerp.dto.PageDTOImpl;
import cat.itacademy.proyectoerp.dto.TimeFramePageDTOImpl;

//Class responsible to check if the pageg paramaters embedded in a entry DTO are correct

public class PageValidator {

	// Validate if page parameters are correct.

	public boolean checkParametersDTO(PageDTOImpl dto) {

		if (dto.getPageNumber() >= 0 && dto.getPageSize() >= 0) {

			return true;
		}

		return false;

	}
	
	
	// Validate if page parameters are correct.

	public boolean checkParametersDTO(TimeFramePageDTOImpl dto) {

		if (dto.getPageNumber() >= 0 && dto.getPageSize() >= 0) {

			return true;
		}

		return false;

	}

}
