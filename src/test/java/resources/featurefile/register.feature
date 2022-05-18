@RegisterTest
Feature: Register Test
  As user I want to register into nop commerce website
  @sanity
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register button
    Then I should see Register text
@smoke
  Scenario Outline: User should create account successfullly
    Given I am on homepage
    When I click on register button
    Then I should navigate to register page successfully
    And I select gender radio button "<gender>"
    And I enter first name"<FirstName>"
    And I enter last name"<LastName>"
    And I enter day"<date>"
    And I enter month"<month>"
    And I enter year"<year>"
    And I enter email on register page
    And I enter password on register page"<password>"
    And I enter confirm password on register page"<confirmpassword>"
    And I click on register button on register page
    Then I can see the registration message "<registrationMessage>"
    Examples:
     |gender | FirstName | LastName | date | month | year | password | confirmpassword | registrationMessage         |
     |Female | joseph    | andrew   | 25   | May   | 1991 | jos@123  | jos@123         | Your registration completed |
#   put this email for login username956@gmail.com
@regression
  Scenario: User should verify all fields are mandatory in register form
    Given I am on homepage
    When I click on register button
    And I should navigate to register page successfully
    And I click on register button on register page
    Then I should verify first name is required "First name is required."
    And I should verify last name is required "Last name is required."
    And I should verify email is required "Email is required."
    And I should verify password is required
    And I should verify confirmpassword is required "Password is required."
