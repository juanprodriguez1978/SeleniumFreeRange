@Courses
Feature: Simple Navigation
  As a user
  I want to navigate to a URL
  So that I can verify the page loads correctly

  Scenario Outline: User can navigate to a URL and verify it
    Given I navigate to <url>


    Examples:
      | url                      |
      | www.freerangetesters.com |