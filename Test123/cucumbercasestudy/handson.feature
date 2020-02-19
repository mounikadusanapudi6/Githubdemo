Feature: demo webshop validations

  Background: launch of Demowebshop url
    Given Application is launched by the guest user

  Scenario: Registration page validations
    When user enters data for every mandatory field
    And submits the application
    Then verifies registration status

  Scenario Outline: login validaions
    When user enters valid username "<un>"
    And user enters valid password "<ps>"
    Then user submits the application
    And verifies the login status

    Examples: 
      | un    | ps   |
      | mouni | 6666 |
      | ishu  | 3333 |
