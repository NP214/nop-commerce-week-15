@ComputerTest
Feature: Computer test
@sanity
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to computer page successfully
    And I should verify computer text
@smoke
  Scenario: User should navigate to desktop page successfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to computer page successfully
    And I click on desktops link
    And I should verify desktops text
@regression
  Scenario Outline: Verify User should build your own computer and add them to cart successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktops link
    Then I should navigate to desktop page successfully
    And I click on Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software"<software>"
    And I click on add to cart button
    Then I should verify the product has been added to your shopping cart
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |