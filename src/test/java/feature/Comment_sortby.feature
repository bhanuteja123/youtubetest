@Sort_By
Feature: Upadte by Sort By

  Background: 
    Given The user is opened into youtube
    Then the user is sign in into youtube
    Then the user click any video
    Then the user scroll down to comments

  Scenario: Sort by Top Comments
    Then Select the Top Comments tag

  Scenario:  Sort by Newest First
    Then Select by  Newest First tag
