@Login
Feature: ContactList Login

  Background: common steps
    Given go to the home page

  @negativeLoginTest1
  Scenario: InvalidCredentialsTest
    When enter invalid email
    And enter invalid password
    And click submit button
    Then verify incorrect message
    And close browser

  @negativeLoginTest2
  Scenario: SpaceCredentialsTest
    When click submit button
    Then verify incorrect message
    And close browser

  @negativeLoginTest3
  Scenario: InvalidEmailEmptyPasswordCredentialsTest
    When enter invalid email
    And click submit button
    Then verify incorrect message
    And close browser

  @negativeLoginTest4
  Scenario: Empty Email Invalid Password Credentials Test
    When enter invalid password
    And click submit button
    Then verify incorrect message
    And close browser

  @positiveLoginTest1
  Scenario: InvalidCredentialsTest
    When enter valid email
    When enter valid password
    And click submit button
    Then verify correct message
    And close browser


