Feature: As a user, I want to enter username, password and click on Login button, so that i will be able to login successfully
  Scenario:
    When Enter Valid username at username Field
      And Enter Valid password at password Field
      And Click on Login button
    Then I will be able to login successfully

  Scenario:
    When Enter inValid username at username Field
      And Enter Valid password at password Field
      And Click on Login button
    Then An error message will be displayed


