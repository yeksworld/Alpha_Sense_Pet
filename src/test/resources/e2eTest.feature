Feature:End to End Test

  @e2e
  Scenario Outline:User should be able to create a new pet then delete it
    Given User should be able to see main page
    When User should be able to create pet by "<id>" and by "<name>" in the store
    Given When user searches for pet by "<id>"
    Then Response should be 200
    Given When user removes for pet by "<id>"
    Then Delete Response should be 200
    Examples:
      | id | name    |
      | 77 | Test123 |