Feature: Test the pagenote feature

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app
When i download book
Then book should be opened

Scenario: Add Page Note 
Given student opens pagenote
When student adds note
Then page note should be saved
And page note is saved in TOC pagenote list


When student deletes note
Then page note should be deleted
And page note is removed in TOC pagenote list