Feature: This feature is about login in to existing account, to make sure it can be accessed and has all the correct data

  Scenario: Successful login
    Given Landing page is opened
      And I select My Account button in Navigation bar
      And I select Sign Up button in Navigation bar
      And Sign Up page is opened
      And I have created new account
      And user account page is opened
      And I select User Account button in Navigation bar
      And I select Logout button in Navigation bar
    When I select My Account button in Navigation bar
      And I select Login button in Navigation bar
      And Login page is opened
      And I enter existing Email address
      And I enter existing Password
      And I select Login button
    Then user account page is opened