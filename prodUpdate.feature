Feature: update product information.

Scenario: Customer wants to update Product information and product is found.
Given Customer "aya" has product "carpet" in their cart
And the customer "aya" wants to update product "Furr "information to "wool"
When the product "carpet" is found in the system
Then the product information are updated to "wool" .


Scenario: Customer wants to update Product information when product is not found
Given Customer "aya" doesnt have the product "carpet" in thier cart
And customer "aya" tries to update product "carpet" information "furr"
When the product "carpet" isnt in the system
Then the information "furr" are not updated. 
