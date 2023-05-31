Feature: DropDown Selection
  @testcase1
  Scenario: Login the website and select dropdowns
    Given go to website
    When Enter valid username and password
    Then click on Login Button
    Then Hover your mouse on PIM section
    Then Click on it
    And Select all the dropdowns which contains name of Samir
    Then close the browser
