Feature: test the login functionality
@testcase1
  Scenario: validate admin login
    Given the user navigates to the url
    When user enters valid email and password
    And clicks on Login Button
    Then the user is logged in
  @testcase2
  Scenario: validate admin login
    Given the user navigates to the url
    When user enters valid email "Admin" and password "Hum@nhrm123"
    And clicks on Login Button
    Then the user is logged in
  @testcase3
  Scenario: validate admin login
    Given the user navigates to the url
    When user enters valid email "admin2" and password "troy"
    And clicks on Login Button
    Then the user is logged in
  @testcase4
  Scenario: validate admin login when username is incorrect
    Given the user navigates to the url
    When user enters a username "XYZA" and password "Hum@nhrm123"
    And clicks on Login Button
    Then the user is not logged in
  @testcase5
  Scenario: validate admin login when password is incorrect
    Given the user navigates to the url
    When user enters a username "Admin" and password "abracadabra"
    And clicks on Login Button
    Then the user is not logged in
  @testcase6
  Scenario: validate admin login when password is empty and username is empty
    Given the user navigates to the url
    When user enters a username "" and password ""
    And clicks on Login Button
    Then the user is not logged in
  @testcase7
  Scenario: validate admin login when password is empty and username is Admin
    Given the user navigates to the url
    When user enters a username "Admin" and password ""
    And clicks on Login Button
    Then the user is not logged in