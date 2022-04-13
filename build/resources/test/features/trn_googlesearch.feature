Feature: Google search
  As a user I want to search the word automation in the platform google

  Scenario Outline: Successfully search
    Given User visit the Google platform
    When User tries to search the next information
      | word   |
      | <word> |
    And wwwww
    Then User verifies is success for the search
    And erereriou

    Examples:
      | word       |
      | Automation |
   
