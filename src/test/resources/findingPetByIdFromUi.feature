Feature:Finding Pet

  @api @regression
  Scenario Outline:User should be able to find the pet by id from Test1
    Given When user searches for pet by "<id>"
    Then Response should be 200
    Examples:
      | id  |
      | 100 |
     # | 5  |