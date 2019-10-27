Feature: the version can be retrieved

  Scenario: client makes call to GET /version
    Given "employees" endpoint
    When employee is created
    Then the client receives status code of 201