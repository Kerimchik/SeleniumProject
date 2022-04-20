Feature: Amazon search functionality

  Scenario: Positive scenario for amazon search
    When I navigate to Amazon  homepage
    And I search for iphone 13 case
    Then I SHOULD GET MORE THAN 20 RESULTS
    And I validate the search result number