Feature: Report Project
  @testcase2
  Scenario: make a project report
    Given go to website
    When Enter valid username and password
    Then click on Login Button
    When Click on Time option
    Then click on Reports option
    When enter project name
    Then add your beggining and ending date
    And click on View button