Feature:
  Scenario Outline:
    When user Enter "<username>"
    And user Enter password
    And user click on Login button
    Then i will be able to login successfully
  Examples:
    | username                |
    | standard_user           |
    | locked_out_user         |
    | problem_user            |

  Scenario Outline:
    When user Enter "<username>"
    And user Enter password
    And user click on Login button
    Then i will not be able to login successfully
    Examples:
      | username                |
      | performance_glitch_user |
