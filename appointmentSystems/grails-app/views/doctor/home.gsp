<!doctype html>
<html>
<head>

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
div {
font-size:16px;
color: navy;
display: block;
}
button{
 color: navy;
 background-color: white;
 font-size: 16px;
 padding: 8px 16px;
 border-radius: 8px;


}
</style>
	<meta name="layout" content="maindoctor"/>

	<title> doctors </title>

</head>
</body>

	<div id="content" role="main">

<div class="first">

	<h3> Search</h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Prescription" action="Search">Search</g:link>

	</button>

</div>

<div class="first">

	<h3> doctors </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Doctor" action="create"> Add Doctor</g:link>

	</button>

</div>

<div class="second">

	<h3> receptionist </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Receptionist" action="create"> Add Receptionist</g:link>

	</button>

</div>

<div class="third">

	<h3> patient </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Patient" action="create"> Add Patient</g:link>

	</button>

</div>

<div class="fourth">

	<h3> prescription </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Prescription" action="create"> Add Prescription</g:link>

	</button>

</div>

<div class="fifth">

	<h3> surgery </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Surgery" action="create"> Add surgery</g:link>

	</button>

</div>

<div class="sixth">

	<h3> nurse </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Nurse" action="create"> Add nurse</g:link>

	</button>

</div>
<div class="seventh">

	<h3> appointment </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Appointment" action="create"> Add appointment</g:link>

	</button>

</div>
<div class="eighth">

	<h3>List nurse </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Nurse" action="index"> List nurse</g:link>

	</button>

</div>
<div class="ninth">

	<h3> List patient </h3>
<p> </p>

	<button type="button" class="btn btn-success">

		<g:link controller="Patient" action="index"> List Patient</g:link>

	</button>

</div>






</div>
</body>
</html>



