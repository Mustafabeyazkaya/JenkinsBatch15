Feature: searching Employee
  @searchingEmployee
  Scenario Outline: search Employee on Employee List
  When user enter the valid username and password
    Then user click on the login button
    Then user check that he is logged in successfully
    Then user click on the PIM option
    Then user click on the Employee List
    Then user enter "<EmployeeName>" and click on search button
    And select the specific employee "<EmployeeName>"
    Examples:
    |EmployeeName|
    |Jack D|
    |Kevin|

