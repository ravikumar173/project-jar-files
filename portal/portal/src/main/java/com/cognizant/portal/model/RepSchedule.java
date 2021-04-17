package com.cognizant.portal.model;

import java.time.LocalDate;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rep_schedule")
public class RepSchedule {

	private int id;

	private String repName;


	@NotNull(message = "Doctor name is a required field")
	private String doctorName;

	@NotNull(message = "Treating ailment is a required field")
	private String treatingAilment;

	@NotNull(message = "Medicine is a required field")
	private String[] medicines;

	@NotNull(message = "Meeting slot is a required field")
	private String meetingSlot;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@NotNull(message = "Date of meeting is a required field")
	private LocalDate dateOfMeeting;

	@NotEmpty(message = "doctor contact number must be entered")
	private String doctorContactNo;


}