package com.awilde

class BootStrap {

    def init = { servletContext ->

/*
//doctor
def doctor1= new Doctor(
fullName: 'David Tennant',
qualification: 'PhD',
position: 'Head',
doctorEmail: 'david@tennant.com',
password: 'Allonsy',
doctorOffice: 'A-1000',
doctorPhone: '01234567899',
bio: 'brilliant'
).save()

def doctor2= new Doctor(
fullName: 'Chris Eccleston',
qualification: 'Dr',
position: 'Duputy',
doctorEmail: 'chris@eccleston.com',
password: 'Storm',
doctorOffice: 'A-2000',
doctorPhone: '01234567896',
bio: 'fantastic'
).save()

//patient

def patient1= new Patient(
patientName: 'Sarah-Jane Smith',
patientAddress: '13 Bannerman Road',
patientResidence: 'Ealing',
patientDob: new Date ('01/02/1946'),
patientID: 123,
dateRegistered: new Date ('18/09/1966'),
patientPhone: '23456789012'
).save()

def patient2= new Patient(
patientName: 'Mickey Smith',
patientAddress: '123 Powell Estate',
patientResidence: 'Peckham',
patientDob: new Date ('025/06/1989'),
patientID: 123,
dateRegistered: new Date ('18/03/1990'),
patientPhone: '23456745234'
).save()

//Appointment
def app1= new Appointment(
appDate: new Date ('10/10/2019'),
appTime: '10:00am',
appDuration: 30,
roomNumber: 'A-1111',
patient: patient1
).save()

def app2= new Appointment(
appDate: new Date ('23/04/2019'),
appTime: '11:30am',
appDuration: 15,
roomNumber: 'A-1112',
patient: patient2
).save()


//Surgery
def surgery1= new Surgery(
name: 'Ealing Pharmacy',
address: 'Pitshanger, London',
postcode: 'W5 1AH',
telephone: '45678901234',
numberOfPatients: 74,
description: 'a pharmacy',
openingTime: '8:30am'
).save()

def surgery2= new Surgery(
name: 'Day Lewis Pharmacy',
address: 'Peckham, London',
postcode: 'S15 5SL',
telephone: '45678901456',
numberOfPatients: 61,
description: 'a pharmacy',
openingTime: '8:30am'
).save()


//receptionist
def recep1= new Receptionist(
recepName: 'Donna Noble',
recepEmail: 'donna@noble.com',
recepUsername: 'donnanoble',
recepPassword: 'leftlibrary',
recepPhone: '34567890123'
).save()

def recep2= new Receptionist(
recepName: 'Rose Tyler',
recepEmail: 'rose@tyler.com',
recepUsername: 'rosetyler',
recepPassword: 'badwolf',
recepPhone: '34567890234'
).save()


//prescription
def prescription1= new Prescription(
pharmacyName: 'Co-op Pharmacy',
pharmacyNumber: 123,
medicine: 'Paracetomol',
totalCost: 6.50,
dateIssued: new Date ('25/06/2018'),
patientPaying: 'Y'
).save()

def prescription2= new Prescription(
pharmacyName: 'Co-op Pharmacy',
pharmacyNumber: 123,
medicine: 'Codiene',
totalCost: 8.60,
dateIssued: new Date ('04/03/2017'),
patientPaying: 'Y'
).save()

//nurse
def nurse1= new Nurse(
nurseName: 'Martha Jones',
qualifications: 'NMC',
nurseEmail: 'martha@jones.com',
nurseOffice: 'B-1000',
nursePhone: '12345678912'
).save()

def nurse2= new Nurse(
nurseName: 'Jack Harkness',
qualifications: 'Nurse',
nurseEmail: 'jack@harkness.com',
nurseOffice: 'B-2000',
nursePhone: '12345678913'
).save()



//relationships

doctor1.addToPrescriptions(prescription1)
doctor2.addToPrescriptions(prescription2)


doctor1.addToAppointments(app1)
doctor2.addToAppointments(app2)

surgery1.addToDoctors(doctor1)
surgery2.addToDoctors(doctor2)


patient1.addToPrescriptions(prescription1)
patient2.addToPrescriptions(prescription2)

surgery1.addToReceptionists(recep1)
surgery2.addToReceptionists(recep2)

surgery1.addToNurses(nurse1)
surgery2.addToNurses(nurse2)


surgery1.addToAppointments(app1)
surgery2.addToAppointments(app2)






*/











    }
    def destroy = {
    }
}
