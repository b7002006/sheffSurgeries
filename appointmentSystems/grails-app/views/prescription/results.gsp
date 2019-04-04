<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        
        <title>Sheffield Surgeries Search</title>
</head>
<body>

<div class="row">
<h1>Prescription Search System</h1>

<h3>Search Results</h3>

 <p>Searched
 for Prescriptions matching <em>${term}</em>.
 Found <strong>${prescriptions.size()}</strong> prescriptions.
 </p>

 <ul>
 <g:each var="prescription" in="${prescriptions}">
 <li><g:link controller="prescription" action="show"
id="${prescription.id}">${prescription.medicine}</g:link></li>
 </g:each>
 </ul>

<g:link action='search'>Search Again</g:link>
</div>
</body>
</html>

