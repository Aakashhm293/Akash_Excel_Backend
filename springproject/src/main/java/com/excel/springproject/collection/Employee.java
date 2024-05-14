package com.excel.springproject.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> skills;
	private Map<String, String> nominees;
	private Address address;
}
