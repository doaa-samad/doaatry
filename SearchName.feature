Feature: Worker searches for customer information.


Scenario: Customer exists in the system and has products
Given that customer exists in the system
And customer may or may not have products
When the worker searches for customer name 
Then the worker recieves a list of customer name and thier products



Scenario: customer does not exist in the system
Given that worker searches for customer
And customer does not exist in the system
When worker searches for customer name 
Then a message pops up to infrom the worker no customer exists with that name.