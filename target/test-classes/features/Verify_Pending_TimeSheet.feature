@TimeSheet
Feature: This is enter name

  Scenario: This is enter name and verify
    Given user is in home page
    When click option on menu
    And enter option name "Anandhan"
    Then click on enter button
    Then the user should see the message as "This is message"
