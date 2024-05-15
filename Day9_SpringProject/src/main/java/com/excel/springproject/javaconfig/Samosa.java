package com.excel.springproject.javaconfig;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Samosa {
	private String samosa = "Samosa's price is too high";
}
