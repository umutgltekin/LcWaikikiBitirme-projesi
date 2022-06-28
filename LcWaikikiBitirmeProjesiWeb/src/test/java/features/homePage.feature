
Feature: LcWaikiki

  Scenario Outline:end-to-end payment step
    Given user navigates to LC Waikiki
    When click Login button
    Then should see login page
    When enter Email "<Email>"
    When enter password "<Password>"
    When click Login page login button
    Then should see home page
    When hover mouse hover "KADIN"
    When click Product "<Products>"
    Then should see products page
    When click colour "<Colour>"
    When click name "<ProductName>"
    Then should see product detail page
    When click product size "<ProductSize>"
    When click add cart
    When click cart button
    Then check cart page
    Then check product size "<ProductSize>"
    Then check product name "<Products>"
    Then check product number of 1.
    When click go payment page button
    Then check payment page
    Examples:
    |Email              |Password|Products|Colour|ProductName            |ProductSize|
    |gltkn116@gmail.com|Gltkn.23|Bluz|Siyah |V Yaka Düz Askılı Kadın Bluz|S|







