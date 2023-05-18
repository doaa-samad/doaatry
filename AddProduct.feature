Feature: Customer Add Product to be handled 

Adds a product the Customer wants to clean. the Customer must be logged in before they can add the product. 


Scenario: Add a product to be handled by system
 Given Customer "aya" logged in successfully
 When Customer must enter the info "type of Product" "Type of Material" 
 When customer must add "height" " width" "does it require special treatment"
 Then Product is added to be handled


Scenario: Customer wants to Add product that already exists and is being handled
Given Customer "aya" logged in 
When customer enters " type of product" "type of material"  
And customer adds " height" " width " " does it require special treatment"
When the product was previously added and status in progress
Then customer cannot add product because it already exists
  