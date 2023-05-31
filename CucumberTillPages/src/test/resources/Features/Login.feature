Feature: Login Functionalities
Background:
  Then user enters valid username "admin" and valid password "Hum@nhrm123"
  Then user click on login button

  Scenario: Valid Admin Login
    #Given user go to website
    #Then user enters valid username "admin" and valid password "Hum@nhrm123"
    #Then user click on login button
    #And user logged in successfully
    #And close the browser
  @scenarioOutline
  Scenario Outline: login with multiple credentials using scenario out line
    Then user enters valid username "<username>" and valid password "<password>"
    Then user click on login button
    And user logged in successfully

    Examples:
    |username|password|
    |admin   |Hum@nhrm123|
    |Jason   |Hum@nhrm123|
    |Admin   |Hum@nhrm123|

    @dataTable
    Scenario: login with multiple credentials using data table
      When user enters username and password and verifies logins
        |username|password|
        |admin   |Hum@nhrm123|
        |Jason   |Hum@nhrm123|
        |Admin   |Hum@nhrm123|

      @testcase1
      Scenario Outline: Adding Project
        Then users click on the Time option
        Then users click on the Project Info option
        When users enter "<CustomerName>" and "<ProjectName>"
        Then users enter "<ProjectAdmin>"
        And click on the Add button
        Examples:
        |CustomerName|ProjectName|ProjectAdmin|
        |Asghar      |JAVA       |Asel        |
        |Ashish      |CUCUMBER   |Sumair      |
        |Moazzam     |Selenium   |Asel        |