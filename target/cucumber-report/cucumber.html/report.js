$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "User should login with invalid credentials",
  "description": "",
  "id": "login-test;user-should-login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter emailID \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the error message \"\u003cerrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-test;user-should-login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "errorMessage"
      ],
      "line": 20,
      "id": "login-test;user-should-login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "abcd123@gmail.com",
        "xyz123",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 21,
      "id": "login-test;user-should-login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5102675700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User should login with invalid credentials",
  "description": "",
  "id": "login-test;user-should-login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter emailID \"abcd123@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter password \"xyz123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 124783800,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 491884700,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 25700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd123@gmail.com",
      "offset": 17
    }
  ],
  "location": "LogInSteps.iEnterEmailID(String)"
});
formatter.result({
  "duration": 141373400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123",
      "offset": 18
    }
  ],
  "location": "LogInSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 89722800,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 426232600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LogInSteps.iShouldSeeTheErroeMessage(String)"
});
formatter.result({
  "duration": 56661900,
  "status": "passed"
});
formatter.after({
  "duration": 980806600,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Test",
  "description": "As user I want to register into nop commerce website",
  "id": "register-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegisterTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "User should create account successfullly",
  "description": "",
  "id": "register-test;user-should-create-account-successfullly",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should navigate to register page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I select gender radio button \"\u003cgender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter first name\"\u003cFirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter last name\"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter day\"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter month\"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter year\"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter email on register page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter password on register page\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter confirm password on register page\"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on register button on register page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can see the registration message \"\u003cregistrationMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "register-test;user-should-create-account-successfullly;",
  "rows": [
    {
      "cells": [
        "gender",
        "FirstName",
        "LastName",
        "date",
        "month",
        "year",
        "password",
        "confirmpassword",
        "registrationMessage"
      ],
      "line": 26,
      "id": "register-test;user-should-create-account-successfullly;;1"
    },
    {
      "cells": [
        "Female",
        "joseph",
        "andrew",
        "25",
        "May",
        "1991",
        "jos@123",
        "jos@123",
        "Your registration completed"
      ],
      "line": 27,
      "id": "register-test;user-should-create-account-successfullly;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2636987500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User should create account successfullly",
  "description": "",
  "id": "register-test;user-should-create-account-successfullly;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@RegisterTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should navigate to register page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I select gender radio button \"Female\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter first name\"joseph\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter last name\"andrew\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter day\"25\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter month\"May\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter year\"1991\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter email on register page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter password on register page\"jos@123\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter confirm password on register page\"jos@123\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on register button on register page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can see the registration message \"Your registration completed\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 504184300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iShouldNavigateToRegisterPageSuccessfully()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Female",
      "offset": 30
    }
  ],
  "location": "RegisterSteps.iSelectGenderRadioButton(String)"
});
formatter.result({
  "duration": 83260800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joseph",
      "offset": 19
    }
  ],
  "location": "RegisterSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 117106600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "andrew",
      "offset": 18
    }
  ],
  "location": "RegisterSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 87968200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 12
    }
  ],
  "location": "RegisterSteps.iEnterDay(String)"
});
formatter.result({
  "duration": 101697900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "May",
      "offset": 14
    }
  ],
  "location": "RegisterSteps.iEnterMonth(String)"
});
formatter.result({
  "duration": 86171700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1991",
      "offset": 13
    }
  ],
  "location": "RegisterSteps.iEnterYear(String)"
});
formatter.result({
  "duration": 84989300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iEnterEmailOnRegisterPage()"
});
formatter.result({
  "duration": 115100600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jos@123",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.iEnterPasswordOnRegisterPage(String)"
});
formatter.result({
  "duration": 106477700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jos@123",
      "offset": 42
    }
  ],
  "location": "RegisterSteps.iEnterConfirmPasswordOnRegisterPage(String)"
});
formatter.result({
  "duration": 88551600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterButtonOnRegisterPage()"
});
formatter.result({
  "duration": 678727600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 36
    }
  ],
  "location": "RegisterSteps.iCanSeeTheRegistrationMessage(String)"
});
formatter.result({
  "duration": 41753400,
  "status": "passed"
});
formatter.after({
  "duration": 1109016700,
  "status": "passed"
});
});