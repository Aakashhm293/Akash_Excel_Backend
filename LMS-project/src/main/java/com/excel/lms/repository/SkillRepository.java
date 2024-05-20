package com.excel.lms.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeTechnicalSkillsInfo;

public interface SkillRepository extends JpaRepository<EmployeeTechnicalSkillsInfo, Integer>{

	Optional<EmployeeTechnicalSkillsInfo> findBySkillTypeAndSkillRatingAndYearOfExperience(String skillType,
			String skillRating, LocalDate yearOfExperience);

}
