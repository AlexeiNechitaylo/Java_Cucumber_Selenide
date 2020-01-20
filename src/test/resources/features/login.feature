Feature: Login User

  Scenario: Login user
    Then Click "Sign in" button
    Then Input login
    Then Input password
    Then Click "Sign in" button span
    Then Content with "The world’s largest selection of courses" visible

