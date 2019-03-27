package com.awilde

class Appointment {

Date appDate
String appTime
String appDuration
String roomNumber
Patient patient

static hasMany =[doctors:Doctor, surgerys:Surgery]



    static constraints = {
    

appDate nullable:false, blank:false
appTime nullable:false, blank:false
appDuration nullable:false, blank:false
roomNumber nullable:false, blank:false
patient nullable:false, blank:false
	}

}
