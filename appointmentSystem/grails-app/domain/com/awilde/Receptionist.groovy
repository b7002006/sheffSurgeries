package com.awilde

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword
int recepPhone

    static constraints = {
    

recepName nullable: false, blank:false
recepEmail nullable: false, blank:false, email:true
recepUsername nullable: false, blank:false
recepPassword nullable: false, blank:false
recepPhone nullable: false, blank:false, maxSize: 11



}


}
