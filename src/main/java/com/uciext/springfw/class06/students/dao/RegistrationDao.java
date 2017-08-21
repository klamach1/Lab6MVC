package com.uciext.springfw.class06.students.dao;

import java.util.List;

import com.uciext.springfw.class06.courses.model.Schedule;
import com.uciext.springfw.class06.students.model.Registration;
import com.uciext.springfw.class06.students.model.Student;

public interface RegistrationDao {

	public void insertRegistration(Registration registration);
	public Registration findRegistrationById(int registrationId);
	public List<Registration> findRegistrations();
	public List<Registration> findRegistrationsByStudent(Student student);
	public List<Registration> findRegistrationsBySchedule(Schedule schedule);

}
