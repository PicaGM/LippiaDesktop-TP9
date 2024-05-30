@Calculator @Regression
Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  @Smoke @Divide
    Scenario: Divide operation
    When Six Divide Two
    Then Result is Three

  @Smoke @Minus
    Scenario: Minus operation
    When Three Minus One
    Then Result is Two

  @Smoke @Multiply
    Scenario: Multiply operation
    When Two Multiply Four
    Then Result is Eight