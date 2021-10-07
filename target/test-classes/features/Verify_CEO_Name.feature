@GetCEOName
  Feature: This is the feature file to get CEO Name
    Scenario Outline: This is test to get to verify CEO name
      Given Open URL Application
      When logged in to home page
      And click on menu bar
      And select name "CEO"
      And click on search
      Then user should see the CEO name as "<CEO_Name>"

      Examples:
        | CEO_Name |
        | Anandhan |