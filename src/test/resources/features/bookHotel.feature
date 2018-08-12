Feature: This feature is about testing booking of hotels functionality

  Scenario: Book existing hotel successfully
    Given I have opened homepage
      And I select My Account button in Navigation bar
      And I select Sign Up button in Navigation bar
      And I have created new account
    When I select Home button in Navigation bar
      And I select book Hotels button
      And I enter Rendezvous Hotels hotel
      And I select hotel that is located in Singapore
      And I select 01.09.2018 as Check in date
      And I select 07.09.2018 as Check out date
      And I select 2 Adult and 2 Child
      And I select Search button
      And I select Junior Suites room
      And I select CONFIRM THIS BOOKING button
    Then Unpaid invoice page is opened