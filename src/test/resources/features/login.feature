Feature: This feature is about login in to existing account, to make sure it can be accessed and has all the correct data

  Scenario: Successful login
    Given I have opened homepage
      And I am in Signup form
      And I have created new account
      And I logout
    When I select My account menu
      And I select Login button in Landing page
      And I enter existing Email address
      And I enter existing Password
      And I select Login button in Login form
    Then user account page is opened