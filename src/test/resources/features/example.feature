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
    And  select Tool Tips tab
    And  user hover over "Hover me to see button"
    Then "Button Tool tip" should contain "You hovered over the Button"
    When user hover over "Hover me to see field"
    Then "Text Field Tool tip" should contain "You hovered over the text field"
    When user hover over "Contrary"
    Then "Contrary Tool tip" should contain "You hovered over the Contrary"
    When user hover over "Section 1.10.32"
    Then "Section Tool tip" should contain "You hovered over the 1.10.32"