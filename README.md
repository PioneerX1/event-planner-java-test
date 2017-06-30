# _Event Planner_

#### _Plan an Event by Guest Count, Food, Beverages, and Entertainment, June 30, 2017_

#### By _**Mick Sexton**_

## Description

_This application will ask a client questions about what they need for their event. Options include different meals, beverages, and entertainment. Client is also given an option to input coupons for discounts, including one for $50 off, and another for free DJ service if certain conditions like atleast 150 for guest count are met._

## Setup/Installation Requirements

* _Download the event-planner folder_
* _Navigate to /event-planner/build/classes/java/main_
* _run the App (aka "java App" in console)_

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|User is prompted for guest count for their event|User inputs a number of guests|This takes user to next question|
|User is prompted to select a meal option|User inputs 1, 2, or 3 for Steak, Fish, or Veggies|This takes user to next question|
|User is prompted to select a beverage option|User inputs 1, 2, or 3 for Full Cocktail Bar, only Wine & Beer, or just Soft Drinks & Juice|This takes user to next question|
|User is prompted to select an entertainment option|User inputs 1, 2, or 3 for DJ set, Fire Breathers, or Mime Flash Mob|This takes user to next question|
|After options, user is prompted for a coupon code|User can input a six-digit code code for $50 off or just hit enter|IF User has previously selected DJ for entertainment, this will take them to an optional next question, ELSE this will take user to final cost message|
|IF user previously selected DJ for entertainment, they will be prompted for an additional entertainment coupon code|User can input a six-digit code or just hit enter|This takes you user to final cost estimate message|
|User will see a cost estimate based on the guest count specified, meal choice, beverage choice, entertainment choice, and any valid coupons they have inputted|No additional info required|Program ends, they can re-run if needed|

## Known Bugs

_No known issues or bugs at this time_

## Support and contact details

_Please contact Mick Sexton at lacrookedbeat@hotmail.com for any questions, feedback, or concerns._

## Technologies Used

_Technologies used include Java, Atom, Git, Gradle, and GitHub_

### License

*This software operates under the MIT license.*

Copyright (c) 2017 **_Mick Sexton_**
