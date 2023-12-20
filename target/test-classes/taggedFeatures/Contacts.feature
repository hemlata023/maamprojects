@PhaseOne
Feature: Contacts CRUD Management

Background: User login
Given User is on loginpage
When user enters his credentials
Then Should be navigated to Dashboard page


@SmokeTest 
Scenario: Create a new Contact
When User create a new contact

@RegressionTest
Scenario: View a Contact
When User view contact details

Scenario: Deleta a  Contact
When User delete a contact