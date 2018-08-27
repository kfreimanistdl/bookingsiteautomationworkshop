Feature: This feature is about creating new account in the system

  Scenario: Successful sign-up
    Given I have opened homepage
    When I select My Account button in Navigation bar
      And I select Sign Up button in Navigation bar
      And Sign Up page is opened
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I select Sign Up button
    Then user account page is opened

  Scenario: Unsuccessful sign-up
    Given I have opened homepage
    When I select My Account button in Navigation bar
      And I select Sign Up button in Navigation bar
      And Sign Up page is opened
      And I select Sign Up button
    Then error messages are displayed
      And Sign Up page is opened