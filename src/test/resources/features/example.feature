Feature: Example how to write tests


#  Scenario: Open DemoQA site and do something
#    Given DemoQA site is open
#    When user select Element category
#    And select Radio Button tab
#    And select radio button yes
#    Then "You have selected Yes" message should be visible


  Scenario: Open DemoQA forms
    Given DemoQA site is open
    When user select Element category
    And select Links tab
    And select created link
    Then "Link has responded with staus 201 and status text Created" message should be visible