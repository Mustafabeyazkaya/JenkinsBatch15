Feature: Login Functionalities
    @login
  Scenario: user should login successfully
      #Given user go to the url
      When user enter the valid username and password
      Then user click on the login button
      Then user check that he is logged in successfully
      #And close the browser


