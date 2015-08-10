Feature: Test the search app

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app
When i download book
Then book should be opened

Scenario: Search
Given i navigate to a page
When i search for text
Then result should be displayed