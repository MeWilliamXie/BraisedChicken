## Basic exercise: Braised chicken
Please realise below demands using Java language. You should also enable the console to accept the parameters a user has input.
## Demands description
A fast food brand launched its own take-away app where users can directly order a meal on mobile phones. The app will make accumulations based on the selected "item", "count" and "promotion" and inform users the charge to be paid.
Promotions takes various forms. If a user can only use one promotion at one time, he may find it troublesome to determine the promotion which saves the most. Therefore for users' convenience, the app is designed to automatically select the most reasonable promotion and accumulate the final charges for user verification.
We need a function named `bestCharge`, which can receive the items and counts (displayed in certain format) a user choose and use these data as input to return the accumulated information.
We have known that:
+ Eacg dish item in this restaurant has a unique ID
+ We now have various promotions:
- Deduct 6 yuan when the order reaches 30 yuan
- Half price for certain dishes
+ No other charges except dish items (such as delivery and package charges)
+ If two promotion approaches save the same amount of money, the first promotion will be used