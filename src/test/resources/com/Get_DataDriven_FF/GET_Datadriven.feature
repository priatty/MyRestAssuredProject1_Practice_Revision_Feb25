Feature: Validation for book store data Using Data Driven

Scenario Outline: 1Validate data in jsonpath with datadriven
Given Hit the bookstore api
Then validate status code
Then Validate data <ExpValue> from <jsonPath> response
Examples:
      |  ExpValue                          |    jsonPath                |
   	  | 'Git Pocket Guide'             |   'books[0].title'         |
      | 'A Working Introduction'    |   'books[0].subTitle'  |
      | 'Richard E. Silverman'       |   'books[0].author'    |
     
      
      
     