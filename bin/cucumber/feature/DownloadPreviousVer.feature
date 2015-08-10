Feature: Test the login feature

Scenario: Login to the app
When i enter login credentials
And i login to the app



Given i navigate to previous version settings
When i download a previous version book
And i cancel a book download
Then book download is canceled