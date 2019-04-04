<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        
        <title>Sheffield Surgeries Search</title>
</head>
<body>

<div class="row">
<h1>Medicine Search System</h1>

<h3>Search Results</h3>

<p>
 Searched ${totalPrescriptions} records
 for items matching <em>${term}</em>.
 Found <strong>${prescriptions.size()}</strong> prescription.
 </p>

 <ul>
 <g:each var="prescription" in="${prescriptions}">
 <li><g:link controller="Prescription" action="show"
id="${prescription.id}">${prescription.medicine}</g:link></li>
 </g:each>
 </ul>

<button type="button" class="btn btn-success">
<p> </p>
 <g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>
