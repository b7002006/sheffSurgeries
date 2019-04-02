package com.awilde

class Prescription {

String pharmacyName
int prescripNumber
String medicine
String totalCost
Date dateIssued
String patientPaying

static hasMany=[patients:Patient, doctors:Doctor]

String toString()
{
	return prescripNumber
}




    static constraints = {
    

pharmacyName nullable:false, blank:false
prescripNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false

}

}
