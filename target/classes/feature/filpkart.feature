Feature: Flipkart login

  Scenario Outline: Flipkart Url launching
    Given Driver launch for Chrome
    And User enter Url address "<URL>"
   # Then search and list flights

    Examples: 
      | URL                    |
      | http://newtours.demoaut.com/ |
