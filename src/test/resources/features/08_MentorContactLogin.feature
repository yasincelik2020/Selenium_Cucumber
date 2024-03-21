@contactSignIn
Feature: contact Sign In

  Scenario: contact Sign In Scenario
    Given go to the home page
    And  click sign in button
    When login and click
    Then see new Page and verify

  @Addcontact

  Scenario: add Contact
    Given go to the home page
    And enter email and password and click
    Given click add contact button
    When name and surname entered
    Then see name and verify


