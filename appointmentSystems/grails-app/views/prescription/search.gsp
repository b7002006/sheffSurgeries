<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>sheff surgeries search</title>
</head>

<div class="row">

<formset>
<legend>Search for Prescriptions</legend>
<g:form action="results">


<tr>
 <td>Medicine</td>
 <td><g:textField name="medicine" /></td>
 </tr>
<tr>
 <td>Days of Supply</td>
 <td><g:textField name="daysofSupply" /></td>
 </tr>
<tr>
 <td>Total Cost</td>
 <td><g:textField name="totalCost" /></td>
 </tr>
<tr>
 <td>Query Type:</td>
 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 </g:radioGroup>
 </td>
 </tr>
<tr>
 <td/>
 <td>
 <g:submitButton name="search" value="Search"/></td>
 </tr>
 </g:form>
 </table>
 </formset>
</div>
 </body>
</html>









