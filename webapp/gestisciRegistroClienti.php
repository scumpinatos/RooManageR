<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.4
Version: 4.0.1
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8"/>
        <title>Metronic | Admin Dashboard Template</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description"/>
        <meta content="" name="author"/>
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN THEME STYLES -->
        <!-- DOC: To use 'material design' style just load 'components-md.css' stylesheet instead of 'components.css' in the below style tag -->
        <link href="../../assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css"/>
        <link href="../../assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/admin/layout6/css/layout.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/admin/layout6/css/custom.css" rel="stylesheet" type="text/css"/>
        <!-- END THEME STYLES -->
        <link rel="shortcut icon" href="favicon.ico"/>
    </head>
    <!-- END HEAD -->
    <!-- BEGIN BODY -->
    <body class="page-md page-quick-sidebar-over-content">

        <!-- BEGIN MAIN LAYOUT -->
        <!-- HEADER BEGIN -->
        <header class="page-header">
            <nav class="navbar" role="navigation">
                <div class="container-fluid">
                    <div class="havbar-header">
                        <!-- BEGIN LOGO -->
                        <?php include("./incs/headerNav.php"); ?>
                        <!-- END LOGO -->

                        <!-- BEGIN TOPBAR ACTIONS -->
                        <div class="topbar-actions">
                            <span style="color: white">Benvenuto, <strong style="font-size: 120%">Malinconico Francesco</strong></span> 

                            <!-- BEGIN USER PROFILE -->
                            <div class="btn-group-img btn-group" style="margin-left: 4px">
                                <button type="button" class="btn btn-sm dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                    <img src="../../assets/admin/layout5/img/avatar1.jpg" alt="">
                                </button>
                                <ul class="dropdown-menu-v2" role="menu">
                                    <li class="active">
                                        <a href="profile.html">Il mio profilo</a>
                                    </li>
                                    <li>
                                        <a href="login.html">Log Out</a>
                                    </li>
                                </ul>
                            </div>
                            <!-- END USER PROFILE -->
                        </div>
                        <!-- END TOPBAR ACTIONS -->
                    </div>
                </div>
                <!--/container-->
            </nav>
        </header>
        <!-- HEADER END -->
    <!-- BEGIN BODY -->
    <body class="page-md page-quick-sidebar-over-content">

        <!-- BEGIN MAIN LAYOUT -->
        <!-- HEADER BEGIN -->
        <header class="page-header">
            <nav class="navbar" role="navigation">
                <div class="container-fluid">
                    <div class="havbar-header">
                        <!-- BEGIN LOGO -->
                        <?php include("./incs/headerNav.php"); ?>
                        <!-- END LOGO -->

                        <!-- BEGIN TOPBAR ACTIONS -->
                        <div class="topbar-actions">
                            <span style="color: white">Benvenuto, <strong style="font-size: 120%">Malinconico Francesco</strong></span> 

                            <!-- BEGIN USER PROFILE -->
                            <div class="btn-group-img btn-group" style="margin-left: 4px">
                                <button type="button" class="btn btn-sm dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                    <img src="assets/admin/layout5/img/avatar1.jpg" alt="">
                                </button>
                                <ul class="dropdown-menu-v2" role="menu">
                                    <li class="active">
                                        <a href="profile.html">Il mio profilo</a>
                                    </li>
                                    <li>
                                        <a href="login.html">Log Out</a>
                                    </li>
                                </ul>
                            </div>
                            <!-- END USER PROFILE -->
                        </div>
                        <!-- END TOPBAR ACTIONS -->
                    </div>
                </div>
                <!--/container-->
            </nav>
        </header>
        <!-- HEADER END -->
        <!-- BEGIN SAMPLE TABLE PORTLET-->
        <!-- BEGIN EXAMPLE TABLE PORTLET-->
        <div class="portlet box grey-cascade">
            <div class="portlet-title">
                <div class="caption">
                    <i class="fa fa-globe"></i>Managed Table
                </div>
                <div class="tools">
                    <a href="javascript:;" class="collapse">
                    </a>
                    <a href="#portlet-config" data-toggle="modal" class="config">
                    </a>
                    <a href="javascript:;" class="reload">
                    </a>
                    <a href="javascript:;" class="remove">
                    </a>
                </div>
            </div>
            <div class="portlet-body">
                <div class="table-toolbar">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="btn-group">
                                <button id="sample_editable_1_new" class="btn green">
                                    Add New <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="btn-group pull-right">
                                <button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right">
                                    <li>
                                        <a href="javascript:;">
                                            Print </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            Save as PDF </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            Export to Excel </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-bordered table-hover" id="sample_1">
                    <thead>
                        <tr>
                            <th class="table-checkbox">
                                <input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes"/>
                            </th>
                            <th>
                                Username
                            </th>
                            <th>
                                Email
                            </th>
                            <th>
                                Points
                            </th>
                            <th>
                                Joined
                            </th>
                            <th>
                                Status
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                shuxer
                            </td>
                            <td>
                                <a href="mailto:shuxer@gmail.com">
                                    shuxer@gmail.com </a>
                            </td>
                            <td>
                                120
                            </td>
                            <td class="center">
                                12 Jan 2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                looper
                            </td>
                            <td>
                                <a href="mailto:looper90@gmail.com">
                                    looper90@gmail.com </a>
                            </td>
                            <td>
                                120
                            </td>
                            <td class="center">
                                12.12.2011
                            </td>
                            <td>
                                <span class="label label-sm label-warning">
                                    Suspended </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                userwow
                            </td>
                            <td>
                                <a href="mailto:userwow@yahoo.com">
                                    userwow@yahoo.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                user1wow
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    userwow@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-default">
                                    Blocked </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                restest
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    test@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                foopl
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                weep
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                coop
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                pppol
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                test
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                userwow
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    userwow@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-default">
                                    Blocked </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                test
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    test@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                goop
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                weep
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                15.11.2011
                            </td>
                            <td>
                                <span class="label label-sm label-default">
                                    Blocked </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                toopl
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                16.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                userwow
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    userwow@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                9.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-default">
                                    Blocked </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                tes21t
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    test@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                14.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                fop
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                13.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-warning">
                                    Suspended </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                kop
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                17.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                vopl
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.11.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                userwow
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    userwow@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-default">
                                    Blocked </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                wap
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    test@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                12.12.2012
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                test
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                19.12.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                toop
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                17.12.2010
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td>
                                <input type="checkbox" class="checkboxes" value="1"/>
                            </td>
                            <td>
                                weep
                            </td>
                            <td>
                                <a href="mailto:userwow@gmail.com">
                                    good@gmail.com </a>
                            </td>
                            <td>
                                20
                            </td>
                            <td class="center">
                                15.11.2011
                            </td>
                            <td>
                                <span class="label label-sm label-success">
                                    Approved </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <!-- END EXAMPLE TABLE PORTLET-->
        <!-- END SAMPLE TABLE PORTLET-->

        <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
        <!-- BEGIN CORE PLUGINS -->
        <!--[if lt IE 9]>
        <script src="assets/global/plugins/respond.min.js"></script>
        <script src="assets/global/plugins/excanvas.min.js"></script> 
        <![endif]-->
        <script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
        <!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
        <script src="assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script type="text/javascript" src="assets/global/plugins/select2/select2.min.js"></script>
        <script type="text/javascript" src="assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="assets/global/scripts/metronic.js" type="text/javascript"></script>
        <script src="assets/admin/scripts/layout.js" type="text/javascript"></script>
        <script src="assets/admin/scripts/demo.js" type="text/javascript"></script>
        <script src="assets/admin/pages/scripts/table-managed.js"></script>
        <script>
            jQuery(document).ready(function () {
                Metronic.init(); // init metronic core components
                Layout.init(); // init current layout
                Demo.init(); // init demo features
                TableManaged.init();
            });
        </script>
    </body>
</html>