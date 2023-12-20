Feature: User Login

#Scenario: Valid Login Admin
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display success message

#Scenario Outline: Valid Login Admin
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display success message

#Examples:
#	| username | password |
#	| tomsmith | SuperSecretPassword!|
#	| testuser1 | welcome123 | 					
#	| testuser2 | welcome123 |
		

Scenario: Valid Login Admin
Given User is on Login Page
When User enters credentials
	| username | password |
	| tomsmith | SuperSecretPassword! |
	
Then Should display success message	
		
		


#Scenario: PlaceOrder
#Given User login into app with credentials
#| username | password |
#When User confirm an order  
#	|order number |
#Then Order must be confirmed
	
	
#Scenario: Order Discount
#Given User place order
#When User purchase for more than 20000
#Then Should apply 10.0 of discount 