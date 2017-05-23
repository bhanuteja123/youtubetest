@Trending
Feature: Trending page

  Background: 
    Given The user is opened into youtube
    Then the user is sign in into youtube
    Then the user opened the trending page

  Scenario: Play video by Clicking on the image
    Then Click image of the video in trending page

  Scenario: Play video by Clicking on the name
    Then Click name of the video in trending page