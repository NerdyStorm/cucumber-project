Feature: Test Techfios test101 page.

    This feature will test the techfios test page.

    @BlueScenario
    Scenario: Change background color to blue
        Given Set "SkyBlue" Background button exists
        When The "SkyBlue" button is clicked
        Then The background color will turn "sky blue"

    @WhiteScenario
    Scenario: Change background color to white
        Given Set "SkyWhite" Background button exists
        When The "SkyWhite" button is clicked
        Then The background color will turn "sky white"
