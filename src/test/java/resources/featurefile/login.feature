@LoginTest
Feature: Login Test
  As user I want to login into nop commerce website
@sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
    And I can see welcome to sign in text
@smoke
  Scenario Outline: User should login with invalid credentials
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
    And I enter emailID "<email>"
    And I enter password "<password>"
    And I click on Login button
    Then I should see the error message "<errorMessage>"
    Examples:
  |  email                   |    password        | errorMessage |
      | abcd123@gmail.com | xyz123 | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
@regression
    Scenario: User should login successfully with valid credentials
      Given I am on homepage
      When I click on login link
      Then I should navigate to login page successfully
      And I enter emailID "username517@gmail.com"
      And I enter password "jos@123"
      And I click on Login button
      Then I should see the logout link
@sanity
  Scenario: User should logout successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
    And I enter emailID "username840@gmail.com"
    And I enter password "jos@123"
    And I click on Login button
    And I click on logout
    Then I should see login link
