Feature: Post Request Testing

Scenario: Post Request validation
Given Create User With Data
Then  Validate user created
Then validate user ID is non null value
Then validate all headers

