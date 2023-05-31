Feature: Login Functionalities
  Background:  #Given user go to website
    When user enter valid username and password
    Then user click on the Login button

  Scenario: User should login successfully
    #Given user go to website
    And user logged in successfully

    @scenarioOutline
    Scenario Outline: Adding Memberships
      Given user logged in successfully
      When Admin navigates to Qualifications
      And selects Memberships
      Then Admin user can add any Memberships "<nameOfMembership>"
      Examples:
      |nameOfMembership|
      |Muhammed        |
      |Tatiana         |
      |Mustafa         |
      |Yuliya          |
      |Amruta          |
      |Olena           |
      |Omid            |
      |Saidjion        |
      |Samuel          |
      |William         |
      |Shamil          |
      |Tami            |

      @dataTable
      Scenario: Adding Memberships with Data Table
        Given user logged in successfully
        When Admin navigates to Qualifications
        And selects Memberships
        When Admin user add multiple memberships
          |Shamil          |
          |Tami            |
