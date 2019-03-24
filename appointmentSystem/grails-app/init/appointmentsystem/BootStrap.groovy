package appointmentsystem

class BootStrap {

    def init = { servletContext ->

//define objects

//Appointment
def app1= new Appointment(
appDate: new Date ('10/10/2019'),
appTime: '10:00am'
appDuration: '30',
roomNumber: 'A-1111'
).save()



//doctor
def doctor1= new Doctor(
fullName: 'David Tennant',
qualification: 'PhD',
position: 'Head',
doctorEmail: 'david@tennant.com',
password: 'Allonsy',
doctorOffice: 'A-1000',
doctorPhone: '01234567891',
bio: 'brilliant'
).save()

//nurse

def nurse1= new Nurse(
nurseName: 'Martha Jones',
qualifications: 'NMC',
nurseEmail: 'martha@jones.com',
nurseOffice: 'B-1000',
nursePhone: '12345678912'
).save()



//patient

def patient1= new Patient(
patientName: 'Sarah-Jane Smith',
patientAddress: '13 Bannerman Road',
patientResidence: 'Ealing',
patientDob: new Date ('01/02/1946'),
patientID: '123',
dateRegistered: new Date ('18/09/1966'),
patientPhone: '23456789012'
).save()

//prescription

def prescription1= new Prescription(
pharmacyName: 'Co-op Pharmacy',
pharmacyNumber: '123',
medicine: 'Paracetomol',
totalCost: '6.50',
dateIssued: new Date ('25/06/2018'),
patientPaying: 'Y'
).save()

//receptionist
def recep1= new Receptionist(
recepName: 'Donna Noble',
recepEmail: 'donna@noble.com',
recepUsername: 'donnanoble',
recepPassword: 'leftlibrary',
recepPhone: '34567890123'
).save()

//Surgery
def surgery1= new Surgery(
name: 'Ealing Pharmacy',
address: 'Pitshanger, London',
postcode: 'W5 1AH',
telephone: '45678901234',
numberOfPatients: '74',
description: 'a pharmacy',
openingTime: '8:30am'
).save()
















    }
    def destroy = {
    }
}
