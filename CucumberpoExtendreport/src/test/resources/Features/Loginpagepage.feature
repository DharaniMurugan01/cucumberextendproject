Feature: Login to hrm application
  @validcredentials
  Scenario: Login with valid credentials
    Given user is on hrmloginpage "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When the user enter username and password
    Then the user should able to login successfully and new page opem