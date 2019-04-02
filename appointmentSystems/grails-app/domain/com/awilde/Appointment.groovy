package com.awilde

class Appointment {

 Date appDate
String appTime
String appDuration
String roomNumber
Patient patient

	static hasMany=[surgerys:Surgery, doctors:Doctor]
	static belongsTo=[Surgery, Doctor]

	String toString()
	{
		return appDate
	}



    static constraints = {
    

appDate nullable:false, blank:false
appTime nullable:false, blank:false
appDuration nullable:false, blank:false
roomNumber nullable:false, blank:false
patient nullable:false, blank:false
	}

}
