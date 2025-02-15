Feature: User API Chaining

  Scenario: Create, Retrieve, Update, and Delete a User
    Given I create a new user
    When I retrieve the created user
    Then I update the user details
    And I delete the user
    Then I verify the user is deleted