@History
Feature: History page

  Background: 
    Given The user is opened into youtube
    Then the user is sign in into youtube
    Then Click on history page

  Scenario: Verify the video user saw in home page
    Then Verify the video user saw in home page when clicking on image

  Scenario: Verify the video user saw in home page
    Then Verify the video user saw in home page when clicking on name

  Scenario: Verify the video user saw in trending page
    Then Verify the video user saw in trending page when clicking on image

  Scenario: Verify the video user saw in trending page
    Then Verify the video user saw in trending page when clicking on name
