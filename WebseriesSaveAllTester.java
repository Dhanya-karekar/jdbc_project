package com.xworkz.webseries.dao;

import com.xworkz.jdbc.webseries.constant.OTTPlatform;
import com.xworkz.jdbc.webseries.constant.genreType;
import com.xworkz.webseries.dto.WebseriesDTO;

public class WebseriesSaveAllTester {

	public static void main(String[] args) {

		WebseriesDAO dao = new WebseriesDAOimpl();
		WebseriesDTO dto1 = new WebseriesDTO("Boss Baby Back in Business", 10, 3, OTTPlatform.Netflix, genreType.comedy,
				7);
		WebseriesDTO dto2 = new WebseriesDTO("Boss Baby Back in Business", 10, 3, OTTPlatform.Netflix, genreType.comedy,
				7);

	}

}
