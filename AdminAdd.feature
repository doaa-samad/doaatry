Feature: Admin adds service

add services to the system

Background: the follwoing services exist in the system
And list of services is 
|Steam Cleaning|50|
|stain removal|100|
|children safe cleaning|250|



Scenario: can add service while logged in
Given admin is logged in 
And service is not in the system
 And service is "eco cleaning service" and price is "250"
When admin wants to add service 
Then the service is added

Scenario: cannot add service because it exists 
Given admin loged in
And service is in the system
And admin selects to add service 
When admin must enter1 "stain removal" and "100"
Then this service could not be added







