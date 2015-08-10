Feature: Test the bookmark feature

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app
When i download book
Then book should be opened

Scenario: Add Highlight note
Given i navigate to a page
When i add a bookmark
Then bookmark should be added