Feature:Removing Pet

  @api2 @regression
  Scenario Outline: User should be able to remove the pet by id from Test1
    Given When user removes for pet by "<id>"
    Then Delete Response should be 200
    Examples:
      | id  |
      | 100 |