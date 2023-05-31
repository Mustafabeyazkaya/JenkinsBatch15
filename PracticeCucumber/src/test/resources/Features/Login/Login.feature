Feature: Login facebook
  @test1
  Scenario: Valid credentials
    #Given go to fb.com
    When enter invalid email and invalid password
    And click on login button
    Then check the text
    #Then close the browser
  @test2
  Scenario Outline: login with multiple credantials
    When user enter "<username>" and "<password>"
    And click on login button
    Then check the text "<text>"
    Examples:
    |username|password|text|
    |admin   |Hum@nhrm123|The password you’ve entered is incorrect. Forgot Password?|
    |Admin   |Hum@nhrm123|The password you’ve entered is incorrect. Forgot Password?|
    |Leandrass   |Hum@nhrm123|The password you’ve entered is incorrect. Forgot Password?|