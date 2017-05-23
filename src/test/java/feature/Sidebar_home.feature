@Home
Feature: Home page

  Background: 
    Given The user is opened into youtube
    Then the user is sign in into youtube

  Scenario: Play video by Clicking on the image
    Then Click image of the video in home page

  Scenario: Play video by Clicking on the name
    Then Click name of the video in home page
