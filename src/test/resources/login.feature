Feature: facebook page testing

  Scenario: 
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then Login should fail
