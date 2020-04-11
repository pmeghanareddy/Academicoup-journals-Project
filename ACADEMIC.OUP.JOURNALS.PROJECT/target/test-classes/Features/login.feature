Feature: AcademicOupJournals Registration
This feature verifies the functionality on AcademicOupJpurnals Registration

@tc_01_registration
Scenario Outline: Successful Registration with valid credentials


      Given User is on Home Page
      When User Navigates to Registration Page
      Then User enters email id password and confirm password "<username>"and "<password>" "<confirm password>"
      And Message displayed Registration Successfull

Examples:
|username|password|confirm password|
|rmeghana20@gmail.com|Classmate8|Classmate8|
|honey123@gmail.com|Dairymilk8|Dairymilk8|


@tc_02_signin
Scenario: Successful Signin with valid credentials


Given I launch Chrome in signin
When I open Academic oup page
Then I verify that user enter 
And I clicks the signin button

@tc_03_journals 
Scenario: Journals A to Z
Given User has the home page with signin in journals AtoZ
When click on Journals A to Z item and select Alphabet M
Then verify the perticular Alphabet data is displayed


@tc_04_resources 
Scenario: Click resource menu
Given I launch Chrome
When Resources Page is opened
Then clicks the Resources