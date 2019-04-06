<!DOCTYPE html>
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
label {
font-size:24px;
color: navy;
}
input[type="submit"] {
 color: white;
 background-color: navy;
font-size: 16px;
 padding: 8px 16px;
 border-radius: 8px;
 opacity: 0.7;
 transition: 0.4s;
 cursor: pointer;

}
input[type="submit"]:hover{opacity: 1;
}

a:link, a:visited {
  background-color: navy;
  color: white;
  display: block;
  padding: 12px 16px;
  border-radius: 8px;
 border: 2px solid lightgray;
}
a:hover, a:active {
  background-color: blue;
  display: block;
  opacity: 0.7;
  transition: 0.4s;
  opacity: 1;
  cursor: pointer;
}

</style>

        <meta name="layout" content="main" />
        
        <title>doctors</title>
    </head>
    <body>

<h1> Doctor Login </h1>

	<g:if test="${flash.message}">

<div class="message">${flash.message}</div>

</g:if>

<g:form action="validate">

<input type="hidden" name="cName" value="${cName}">
<input type="hidden" name="aName" value="${aName}">

<table>
        <tr class="prop">
          <td class="name">
            <label for="doctorEmail">Email:</label>
          </td>
          <td class="value">
            <input type="text" id="doctorEmail" name="doctorEmail" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="password">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="password" name="password" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="Login"/>
          </td></tr>
      </table>
    </g:form>
  </body>
</html>
