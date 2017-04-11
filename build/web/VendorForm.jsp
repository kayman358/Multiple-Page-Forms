<%-- 
    Document   : VendorForm
    Created on : Apr 6, 2017, 8:35:00 PM
    Author     : Kolade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src ="script.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendor Portal</title>
    </head>
    <body>
        <div class="container">
    <center><h3 class="top">Vendor Portal</h3></center>
        
       <form>
           <fieldset id="f1">         
  <div class="form-group">
    <label for="exampleCompany Name">Company Name</label>
    <input type="text" class="form-control short" id="company" name = "company" placeholder="Company Name">
  </div>
  <div class="form-group">
    <label for="taxRegistration">Tax registration Number</label>
    <input type="text" class="form-control short" id="taxRegistration" name = "taxRegistration" placeholder="Tax Registration Number">
  </div>
<div class="form-group short">
                <label for="Business">Business Class</label>  
                <select class="form-control" name="business" id="business">
   <option>--choose--</option>
  <option>PLC</option>
  <option>UlTd</option>
  <option>LTD</option>
  <option>Sole Proprietorship</option>
  <option>Public Limited Association</option>
</select>
</div>
 <div class="form-group short">
<label for="Business">Departments</label>  
<select class="form-control" name="depts" id="depts">
    <option>--choose--</option>
  <option>Corp Trans</option>
  <option>Risk</option>
  <option>IT</option>
  <option>Works</option>
  <option>Engineering</option>
</select>
 </div>
           </fieldset>        
           
           
           
           
   <fieldset id="f1">         
  <div class="form-group">
    <label for="exampleOffice Location">Office Location</label>
    <input type="text" class="form-control short" id="location" name = "location" placeholder="Office Location">
  </div>
  <div class="form-group">
    <label for="contactPerson">Name of Contact Person</label>
    <input type="text" class="form-control short" id="contactPerson" name = "contactPerson" placeholder="Name of Contact Person">
  </div>
<div class="form-group short">
                <label for="state">state</label>  
                <select class="form-control" name="business" id="business">
   <option>--choose--</option>
  <option>Lagos</option>
  <option>Oyo</option>
  <option>Osun</option>
  <option>Abia</option>
  <option>Kano</option>
</select>
</div>
 <div class="form-group short">
<label for="local">local Governments</label>  
<select class="form-control" name="local" id="local">
  <option>--choose--</option>
  <option>Eti Osa</option>
  <option>Ajeromi Ifelodun</option>
  <option>Oshodi/Isolo</option>
  <option>Mushin</option>
  <option>Epe</option>
</select>
 </div>
           </fieldset>        
           <br />
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
        </div>
    </body>
</html>

