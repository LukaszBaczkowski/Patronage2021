Feature: Example how to write tests


  Scenario: Open DemoQA site and do something
    Given DemoQA site is open
    When user select Element category
    And select Radio Button tab
    And select radio button yes
    Then "You have selected Yes" message should be visible