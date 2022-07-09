Feature: Authentication SauceLab site
  As a user I want to login in the web SauceLab

  Scenario Outline: Successfully authenticate SauceLag
    Given User visit the SauceLab web
    When User tries to login with the next information
      | user   | password   |
      | <user> | <password> |
    Then User verifies is success authentication was successful

    Examples:
      | user          | password     |
      | standard_user | secret_sauce |

