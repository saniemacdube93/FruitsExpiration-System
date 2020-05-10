<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from flatable.phoenixcoded.net/default/auth-normal-sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Jan 2019 12:15:52 GMT -->
<head>
<title>Flat Able - Premium Admin Template by Phoenixcoded</title>


<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="Phoenixcoded">
<meta name="keywords" content=", Flat ui, Admin , Responsive, Landing, Bootstrap, App, Template, Mobile, iOS, Android, apple, creative app">
<meta name="author" content="Phoenixcoded">

<link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">

<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">

<link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">

<link rel="stylesheet" type="text/css" href="assets/css/style.css">

<link rel="stylesheet" type="text/css" href="assets/css/color/color-1.css" id="color" />
</head>
<body class="fix-menu">
<section class="login p-fixed d-flex text-center bg-primary common-img-bg">



</section>


<!--[if lt IE 9]>
<div class="ie-warning">
    <h1>Warning!!</h1>
    <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to access this website.</p>
    <div class="iew-container">
        <ul class="iew-download">
            <li>
                <a href="http://www.google.com/chrome/">
                    <img src="assets/images/browser/chrome.png" alt="Chrome">
                    <div>Chrome</div>
                </a>
            </li>
            <li>
                <a href="https://www.mozilla.org/en-US/firefox/new/">
                    <img src="assets/images/browser/firefox.png" alt="Firefox">
                    <div>Firefox</div>
                </a>
            </li>
            <li>
                <a href="http://www.opera.com">
                    <img src="assets/images/browser/opera.png" alt="Opera">
                    <div>Opera</div>
                </a>
            </li>
            <li>
                <a href="https://www.apple.com/safari/">
                    <img src="assets/images/browser/safari.png" alt="Safari">
                    <div>Safari</div>
                </a>
            </li>
            <li>
                <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                    <img src="assets/images/browser/ie.png" alt="">
                    <div>IE (9 & above)</div>
                </a>
            </li>
        </ul>
    </div>
    <p>Sorry for the inconvenience!</p>
</div>
<![endif]-->


<script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-ui/jquery-ui.min.js"></script>
<script type="text/javascript" src="bower_components/tether/dist/js/tether.min.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<script type="text/javascript" src="bower_components/jquery-slimscroll/jquery.slimscroll.js"></script>

<script type="text/javascript" src="bower_components/modernizr/modernizr.js"></script>
<script type="text/javascript" src="bower_components/modernizr/feature-detects/css-scrollbars.js"></script>

<script type="text/javascript" src="bower_components/i18next/i18next.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-xhr-backend/i18nextXHRBackend.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-browser-languagedetector/i18nextBrowserLanguageDetector.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-i18next/jquery-i18next.min.js"></script>

<script type="text/javascript" src="assets/js/script.js"></script>

<script type="text/javascript" src="assets/js/common-pages.js"></script>
</body>

<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" >
       <div class="modal-dialog">
<div class="login-card card-block login-card-modal">
    <form class="md-float-material" action="${pageContext.request.contextPath}/ModalController5">
<div class="text-center">
<img src="assets/images/auth/logo.png" alt="logo.png">
</div>
<div class="auth-box">
<div class="row m-b-20">
<div class="col-md-12 confirm">
<h3 class="text-center txt-primary"><i class="icofont icofont-check-circled text-primary"></i>Successful</h3>
</div>
</div>
<p class="text-inverse text-left m-b-15 f-16"> Successfully submitted !!!</p>
<p class="text-inverse text-left m-b-20">The batch has been successfully added to the inventory .Select the following options to proceed.</p>

<div class="row m-t-15">
<div class="col-md-12">
<button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center">Add Items to Perishables</button>
</div>
</div>    
<div class="row m-t-15">
<div class="col-md-12">
   <input type="submit" value="View Perishable Items" class="btn btn-primary btn-md btn-block waves-effect text-center">
   </input>
</div>
</div>
<div class="row">
<div class="col-md-12">
<p class="text-inverse text-left m-b-0 m-t-10">Thank you and enjoy our website.</p>
<p class="text-inverse text-left"><b>Your Autentification Team</b></p>
</div>
</div>
</div>
</form>

</div>
</div>
      </div>
  <script>
    $(document).ready(function() {
      $("#myModal").modal(
        {
            backdrop: 'static',
            keyboard: false
        }
      );
    });
  </script>
  <script>
      $(function () {
  $('[data-toggle="tooltip"]').tooltip()
})
      </script>
  
<!-- Mirrored from flatable.phoenixcoded.net/default/auth-normal-sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Jan 2019 12:15:56 GMT -->
</html>
