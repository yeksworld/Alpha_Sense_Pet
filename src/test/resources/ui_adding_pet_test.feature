Feature:Adding New Pet

   @regression
  Scenario Outline: User should be able to add new pet
    Given User should be able to see main page
    When User should be able to create pet by "<id>" and by "<name>" in the store
    Examples:
      | id  | name |
      | 100 | Yuno |
