$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp-pc/workspace/cucumberBDDPOM/src/main/java/com/qa/features/ClassicCRM.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user verify header",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enters username and password and clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Home Page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User switch to main frame",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user go to contacts and clicks on new contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user add contacts details",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user save contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 19277446901,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 392730400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_verify_header()"
});
formatter.result({
  "duration": 516043700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password_and_clicks_on_login_button()"
});
formatter.result({
  "duration": 8759156500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_Page_is_Displayed()"
});
formatter.result({
  "duration": 30792800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_switch_to_main_frame()"
});
formatter.result({
  "duration": 201574100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_go_to_contacts_and_clicks_on_new_contacts()"
});
formatter.result({
  "duration": 4172979401,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_add_contacts_details()"
});
formatter.result({
  "duration": 1103967300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_save_contact_details()"
});
formatter.result({
  "duration": 2730240099,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_close_browser()"
});
formatter.result({
  "duration": 1457773700,
  "status": "passed"
});
});