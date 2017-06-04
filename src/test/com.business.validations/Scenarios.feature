Feature: This feature file consists of business validation


  Scenario: To validate our test
    Given The configuration are loaded
    When I print the value
    Then I see the output
    And User quits the webDriver
    And User closes the webDriver

  @RunTest
  Scenario Outline: To validate our test2
    Given The configuration are loaded
    When User navigate to the website
    Then User should see the title
    And User input the text in <searchText>
    And User clicks the <actionOnButton> button
    And User closes the webDriver
    Examples:
      | searchText |actionOnButton|
      | Selenium   |   search     |