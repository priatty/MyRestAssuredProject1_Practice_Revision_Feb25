Feature: Validation for book store data Using Data Table

Scenario: 1test Git Pocket Guide is present in response json
Given Hit the bookstore api
Then validate status code
Then Validate data from respose
   	  | Git Pocket Guide             |   books[0].title       |
      | A Working Introduction    |  books[0].subTitle  |
      | Richard E. Silverman       |  books[0].author   |
      | No Starch Press              |  books[7].publisher |
      
      
     