package com.awilde

class Surgery {

String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime

static hasMany= [surgerys:Surgery, appointments:Appointment, receptionists: Receptionist, doctors:Doctor, nurses:Nurse]



    static constraints = {
    

name nullable: false, blank: false
address nullable: false, blank: false
postcode nullable: false, blank: false
telephone nullable: false, blank: false, maxSize: 11
numberofPatients nullable: false, blank: false
description nullable: false, blank: false
openingTime nullable: false, blank: false, maxSize:5000, widget: 'textarea'

}

}
