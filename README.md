# The Revised Project Proposal



## Theme
The theme is a Bank where we will create an App that allows users to create a Bank Account to deposit and withdraw money and to be able to see their transaction log


## Feature List
1. The user will create a username and password from the beginning which will be stored. Once the user logs into the app. Their name will be displayed.

2. There will be two accounts: Checking and Saving. The user will have the option to pick both account and either deposit or withdraw their money. 

3. Once the user has done deposits or withdrawals, they will be able to see their transaction logs based on their activities.

## UML Diagram
This is our revised UML Diagram for our Bank.

<img width="792" alt="Screenshot 2022-12-08 at 10 59 15 PM" src="https://user-images.githubusercontent.com/98849706/206621095-29e53ae5-db27-40ba-b3e4-d641bb80b523.png">





## Screenshots and a short video:
This is our revised sketch of our App.

<img width="147" alt="Screenshot 2022-12-08 at 11 30 53 PM" src="https://user-images.githubusercontent.com/98849706/206624428-d2ca7a21-d744-4bd6-adb3-0b33ff140a72.png">

This is a link to a video on how it works live.
https://drive.google.com/file/d/1mDFPsVa9FbejqI1xrlWB3-UCiaf77I8h/view



## Issues and future work
1. We sadly could not make the transaction log to work due to many bugs and errors that prevented the program to function.
2. We couldn't display the username when the user logs into the program due to the program having issues with displaying values on the screen.
3. We plan to restart from scratch and display the username, and do more research on how to implement the transaction log.


## Self-Assessment of  Satisfying the Project Requirements:
Classes used:
1. We created a class called "DataSingleton.java" which helps to store data globally. With this class we were able to collect money from the user and save it. It also allowed us to display the user's amount through different Scenes created. Within the class we were able to implement methods to set deposit, set withdrawal, and get amount of the user's money.

2. We created a Deposit.java class that helps to deposit money the user puts in.

Sadly we didn't have enough time and couldn't implement these items:
- Abstract class
- Inheritance
- Polymorphic call
- ArrayList

Within the JavaFX FXML GUI, most of our scenes and controllability was held in PrimaryController.java. This allowed us to create ActionEvent methods to click through scenes and perform the most important aspect of our bank which is depositing and withdrawing money and being able to display the balance.

The controls that helped us tremendously were Textfield, Label, Button, and ActionEvent





