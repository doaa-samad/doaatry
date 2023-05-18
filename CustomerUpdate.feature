Feature: Customer Updates info

Scenario: Customer Updates address
Given Customer wants to change address which is "Nablus, street 25"
When Customer requests to change it to "Nablus,rafidya main street"
Then Customer could change Address in record

Scenario: Customer Updates Phone Number
Given customer wants to change phone number whih is "0597824791"
When customer requests to changes it to "0594185251"
Then Customer have changed address in record

Scenario: Customer updates password
Given Customer wants to change password which is "password1234"
When customer change it to "password6754"
Then customer have changed it in records
