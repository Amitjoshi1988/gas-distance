package com.example.corejava.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Perfect Attendance ,only those who attend all weekdays
 */
public class perfectAttendance {
	static public void main(String... wkdays) {
		Map<String, List<LocalDate>> attendance = Map.of(
			    "E1", List.of(LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 2), LocalDate.of(2024, 5, 3)),
//			    "E1", List.of(LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 2), LocalDate.of(2024, 5, 3), LocalDate.of(2024, 5, 4), LocalDate.of(2024, 5, 5), LocalDate.of(2024, 5, 6)),
			    "E2", List.of(LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 2)) 
			);
		
		var mayWeekDays = LocalDate.of(2024, 5, 1).datesUntil(LocalDate.of(2024, 5, 6))
				           .filter(d -> d.getDayOfWeek().getValue()<=5)
				           .collect(Collectors.toList());
		
		var perfectAttendance = attendance.entrySet().stream()
				                                   .filter(e -> e.getValue().containsAll(mayWeekDays))
				                                   .map(Map.Entry::getKey)
				                                   .toList();
		System.out.println(perfectAttendance);
	}
}
