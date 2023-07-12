Feature: Automation Practice registration feature
  User Story:
  As a user, I should be able to register and create new account

  Scenario: Registering a new account
    Given user goes to the web page and sees Automation Exercise title
    When user clicks SignupLogin button user sees New User Signup! text
    And user enters name and email
    Then user clicks Signup button and user sees ENTER ACCOUNT INFORMATION text
    Then user fills out Title, Name, Email, Password, Date of birth
    And user selects Sign up for our newsletter! checkbox
    And user also selects Receive special offers from our partners! checkbox
    Then user fills out First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And user clicks Create Account button and sees ACCOUNT CREATED! text
    Then user clicks Continue button and sees Logged in as username is visible
    Then user clicks Delete Account button and sees ACCOUNT DELETED! text is displayed
    Then user clicks Continue

