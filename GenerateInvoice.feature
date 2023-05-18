Feature: Customer requests Invoice.

Scenario: Customer can request an invoice successfully.
Given that the customer "aya" is logged in
And "aya" requests to generate an invoice 
When "aya" has at least one product added in her cart
And address is "Nablus,aldwar"
And delivery is available to that area at price "20"
Then the invoice is generated

Scenario: Customer can not successfully recieve an invoice .
Given customer "aya" has logged in
And "aya" wants generate an invoice 
When "aya" has one or more product added in cart
And and the address is "Nablus,sufyan street"
And delivery is not available to that area
Then the invoice is not generated

