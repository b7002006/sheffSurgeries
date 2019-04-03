<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        
        <title>sheff surgeries search</title>
</head>
<body>

<div class="row">
<h1>Sreda Patient search System</h1>
<h3>Search Results</h3>

<p>
 Searched ${totalPatients} records
 for items matching <em>${term}</em>.
 Found <strong>${patients.size()}</strong> students.
 </p>

 <ul>
 <g:each var="patient" in="${patients}">
 <li><g:link controller="Patient" action="show"
id="${patient.id}">${patient.patientName}</g:link></li>
 </g:each>
 </ul>

<button type="button" class="btn btn-success">
 <g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>
