Feature: Automation Practice registration feature
  User Story:
  As a user, I should be able to register and create new account

  Scenario: Registering a new account
    Given user is on the web page and sees "Automation Exercise" title
    When user clicks SignupLogin button
    Then user sees "New User Signup!" signup message
    And user enters "Linda Holmes" name and "lindaholmes@gmail.com" email
    Then user clicks Signup button

    And user sees "ENTER ACCOUNT INFORMATION" account message
    Then user clicks "Mrs" Title
    And user sees "Linda Holmes" in the name input
    And user sees "lindaholmes@gmail.com" in the email input
    And user enters "youAreHired2023" password
    And user selects date of birth "10/24/1982"
    And user selects "Sign up for our newsletter!" checkbox
    And user selects "Receive special offers from our partners!" checkbox
    Then user enters "Linda" first name
    Then user enters "Holmes" last name
    Then user enters "Google" company
    Then user enters "123 Hollywood blvd" address
    Then user enters "123 Sequoya dr" address2
    Then user selects "Canada" country
    Then user enters "VC" state
    Then user enters "Toronto" city
    Then user enters "23627" zipcode
    Then user enters "984-231-4313" Mobile Number
    And user clicks Create Account button

    Then user sees "ACCOUNT CREATED!" message
    And user clicks Continue button
    Then user sees Logged in as "Linda Holmes" account information
    Then user clicks Delete Account button
    And user sees "ACCOUNT DELETED!" confirmation message
    Then user clicks Continue
    And user is back on the main page

