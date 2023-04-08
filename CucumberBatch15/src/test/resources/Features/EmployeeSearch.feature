Feature: Searching the employee
  @empSearch
  Scenario: Search employee by id
    Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    When user enters valid employee id
    And click on search button
    And user see employee information is displayed
    And close the browser

  @empSearchJobTitle
    Scenario: Search Employee By Job Title
      Given open the browser and launch HRMS application
      When user enters valid email and valid password
      And click on login button
      When user clicks on PIM option
      When users select Job Title
      And click on search button
      And user see employee information is displayed
      And close the browser