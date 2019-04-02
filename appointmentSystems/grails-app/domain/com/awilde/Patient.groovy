package com.awilde

class Patient {

String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone
Appointment appointment

static hasMany= [doctors:Doctor, surgerys:Surgery, prescriptions:Prescription]
static belongsTo=[Surgery, Prescription]

	String toString()
	{
		return patientName
	}


    static constraints = {
    

patientName nullable:false, blank:false
patientAddress nullable:false, blank:false
patientResidence nullable:false, blank:false
patientDob nullable:false, blank:false
patientID nullable:false, blank:false
dateRegistered nullable:false, blank:false
patientPhone nullable:false, blank:false
appointment nullable:true, blank:true


}


}
