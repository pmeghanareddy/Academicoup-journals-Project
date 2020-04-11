$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "AcademicOupJournals Registration",
  "description": "This feature verifies the functionality on AcademicOupJpurnals Registration",
  "id": "academicoupjournals-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Successful Registration with valid credentials",
  "description": "",
  "id": "academicoupjournals-registration;successful-registration-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_registration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Navigates to Registration Page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters email id password and confirm password \"\u003cusername\u003e\"and \"\u003cpassword\u003e\" \"\u003cconfirm password\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Message displayed Registration Successfull",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "confirm password"
      ],
      "line": 14,
      "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;;1"
    },
    {
      "cells": [
        "rmeghana20@gmail.com",
        "Classmate8",
        "Classmate8"
      ],
      "line": 15,
      "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;;2"
    },
    {
      "cells": [
        "honey123@gmail.com",
        "Dairymilk8",
        "Dairymilk8"
      ],
      "line": 16,
      "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Successful Registration with valid credentials",
  "description": "",
  "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_registration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Navigates to Registration Page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters email id password and confirm password \"rmeghana20@gmail.com\"and \"Classmate8\" \"Classmate8\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Message displayed Registration Successfull",
  "keyword": "And "
});
formatter.match({
  "location": "registrationstep.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 16078721200,
  "status": "passed"
});
formatter.match({
  "location": "registrationstep.user_Navigates_to_Registration_Page()"
});
formatter.result({
  "duration": 5790882700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rmeghana20@gmail.com",
      "offset": 52
    },
    {
      "val": "Classmate8",
      "offset": 78
    },
    {
      "val": "Classmate8",
      "offset": 91
    }
  ],
  "location": "registrationstep.user_enters_email_id_password_and_confirm_password_and(String,String,String)"
});
formatter.result({
  "duration": 13437700400,
  "status": "passed"
});
formatter.match({
  "location": "registrationstep.message_displayed_Registration_Successfull()"
});
formatter.result({
  "duration": 404873900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Successful Registration with valid credentials",
  "description": "",
  "id": "academicoupjournals-registration;successful-registration-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_registration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Navigates to Registration Page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters email id password and confirm password \"honey123@gmail.com\"and \"Dairymilk8\" \"Dairymilk8\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Message displayed Registration Successfull",
  "keyword": "And "
});
formatter.match({
  "location": "registrationstep.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 1349008600,
  "status": "passed"
});
formatter.match({
  "location": "registrationstep.user_Navigates_to_Registration_Page()"
});
formatter.result({
  "duration": 5599900600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "honey123@gmail.com",
      "offset": 52
    },
    {
      "val": "Dairymilk8",
      "offset": 76
    },
    {
      "val": "Dairymilk8",
      "offset": 89
    }
  ],
  "location": "registrationstep.user_enters_email_id_password_and_confirm_password_and(String,String,String)"
});
formatter.result({
  "duration": 13396443200,
  "status": "passed"
});
formatter.match({
  "location": "registrationstep.message_displayed_Registration_Successfull()"
});
formatter.result({
  "duration": 353109900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Successful Signin with valid credentials",
  "description": "",
  "id": "academicoupjournals-registration;successful-signin-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc_02_signin"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I launch Chrome in signin",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I open Academic oup page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I verify that user enter",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I clicks the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "signinstep.i_launch_Chrome()"
});
formatter.result({
  "duration": 1219100,
  "status": "passed"
});
formatter.match({
  "location": "signinstep.i_open_academic_oup_page()"
});
formatter.result({
  "duration": 1040020000,
  "status": "passed"
});
formatter.match({
  "location": "signinstep.i_verify_that_user_enter_and()"
});
formatter.result({
  "duration": 6274101800,
  "status": "passed"
});
formatter.match({
  "location": "signinstep.i_clicks_the_signin_button()"
});
formatter.result({
  "duration": 805770200,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Journals A to Z",
  "description": "",
  "id": "academicoupjournals-registration;journals-a-to-z",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tc_03_journals"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User has the home page with signin in journals AtoZ",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "click on Journals A to Z item and select Alphabet M",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "verify the perticular Alphabet data is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "journalsstep.user_has_the_home_page_with_signin_in_journals_AtoZ()"
});
formatter.result({
  "duration": 2568956700,
  "status": "passed"
});
formatter.match({
  "location": "journalsstep.click_on_Journals_A_to_Z_item()"
});
formatter.result({
  "duration": 4222409800,
  "status": "passed"
});
formatter.match({
  "location": "journalsstep.verify_the_perticular_Alphabet_data_is_displayed()"
});
formatter.result({
  "duration": 863374000,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Click resource menu",
  "description": "",
  "id": "academicoupjournals-registration;click-resource-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc_04_resources"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I launch Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "Resources Page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "clicks the Resources",
  "keyword": "Then "
});
formatter.match({
  "location": "resourcesstep.i_launch_Chrome()"
});
formatter.result({
  "duration": 885500,
  "status": "passed"
});
formatter.match({
  "location": "resourcesstep.resources_Page_is_opened()"
});
formatter.result({
  "duration": 6368163200,
  "status": "passed"
});
formatter.match({
  "location": "resourcesstep.clicks_the_Resources()"
});
formatter.result({
  "duration": 1376688600,
  "status": "passed"
});
});