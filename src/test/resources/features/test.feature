Feature: DemoQA Tests


#  Scenario: Open DemoQA site and do something
#    Given DemoQA site is open
#    When user select Element category
#    And select Radio Button tab
#    And select radio button yes
#    Then "You have selected Yes" message should be visible


  Scenario: Open DemoQA elements
    Given DemoQA site is open
    When user select Element category
    And select Links tab
    And select created link
    Then "Link has responded with staus 201 and status text Created" message should be visible

  Scenario: Open DemoQA widgets
    Given DemoQA site is open
    When user select Widgets category
    And  select Tabs tab
    And  user click "Origin tab"
    Then "Lorem Ipsum is not simply random text." text should be contain

#  Scenario: Open DemoQA forms
#    Given DemoQA site is open
#    When user select Forms category
#    And select Practice Form tab
#    Then Title "Student Registration Form" is visible