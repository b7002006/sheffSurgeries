package com.awilde

class PrescriptionController {

    def scaffold= Prescription
def search(){

}

def results() {
def prescripProps = Prescription.metaClass.properties*.name
def prescriptions = Prescription.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (prescripProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
 }
return [ prescriptions : prescriptions ]
}
}
