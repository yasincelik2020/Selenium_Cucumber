@positiveLoginTest11
Feature: negative login

  Scenario Outline: positive login with valid credentials
    Given go to the home page
    When enter valid a <email>
    And enter valid an <password>
    And click submit button
    Then verify correct message
    And close browser

    Examples: customer credentials
      | email | password |
      | asya@clarus.com | asya123    |
      | test2@fake.com  | myPassword |
      |rasit@gmail.com  |rasit123    |