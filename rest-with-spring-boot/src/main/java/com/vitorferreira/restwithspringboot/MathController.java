package com.vitorferreira.restwithspringboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception();
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String strNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isNumeric(String numberOne) {
		// TODO Auto-generated method stub
		return false;
	}

}
