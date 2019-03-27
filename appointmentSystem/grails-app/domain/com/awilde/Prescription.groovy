package com.awilde

class Prescription {

String pharmacyName
int pharmacyNumber
String medicine
int totalCost
Date dateIssued
String patientPaying

static hasMany= [doctors:Doctor, patients:Patient]


    static constraints = {
    

pharmacyName nullable:false, blank:false
pharmacyNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false

}

}
