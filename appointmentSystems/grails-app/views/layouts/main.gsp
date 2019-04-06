<!doctype html>
<span style="font-family:arial;">

<html lang="en" class="no-js">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

	<link rel="stylesheet" type="text/css" href="styling.css">
    <g:layoutHead/>

<style>

body {
  background-color: powderblue;
}

h1 {
  font-size:44px;
  color: navy;
  
}
p {
font-size:24px;
color: navy;

}

</style>
</head>

<body>
<p> </p>

<div class="row">

	<asset:image src="doctor-banner.png"/>

</div>
<g:layoutBody/>
<g:loginToggle/>
<g:loginToggle1/>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
