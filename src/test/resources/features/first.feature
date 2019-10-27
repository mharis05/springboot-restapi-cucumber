Feature: the version can be retrieved

  Scenario: client makes call to GET /version
    Given "employees" endpoint is running
    When employee is created
      | name  | age |
      | Haris | 32  |
#    Then the client receives status code of 200
#    And the client receives server version 1.0
    And this happens