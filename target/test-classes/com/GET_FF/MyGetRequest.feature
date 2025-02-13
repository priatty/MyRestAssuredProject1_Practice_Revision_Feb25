Feature: Validation for book store data

Scenario: 1test Git Pocket Guide is present in response json
Given Hit the bookstore api
Then validate status code
Then validate Git Pocket Guide title present    
Then validate A Working Introduction subtilte is present

#multiple title validation
Then validate "Git Pocket Guide" at  jsonpath "books[0].title" title present 
Then validate "Learning JavaScript Design Patterns" at  jsonpath "books[1].title" title present 
Then validate "Designing Evolvable Web APIs with ASP.NET" at  jsonpath "books[2].title" title present 
Then validate "Speaking JavaScript" at  jsonpath "books[3].title" title present 

#multiple subtitle validation
Then validate "A Working Introduction" is present  at json path "books[0].subTitle"
Then validate "A JavaScript and jQuery Developer's Guide" is present  at json path "books[1].subTitle"
Then validate "Harnessing the Power of the Web" is present  at json path "books[2].subTitle"
Then validate "An In-Depth Guide for Programmers" is present  at json path "books[3].subTitle"

#Validate author
Then validate Richard E. Silverman author is present 

#similar to title and sub title we can also validate multiple author 


#validate page number
Scenario: 2test page number is present
Given Hit the bookstore api
Then validate as status code
Then validate "234" at jsonpath "books[0].pages" pageNumber present
Then validate "254" at jsonpath "books[1].pages" pageNumber present
