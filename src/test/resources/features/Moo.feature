@regression
Feature: search functionality working correctly

  Background:
    Given I open the Moo website

  @SearchProducts
  Scenario Outline: searching for a product
    When I search for a "<Product>"
    Then I should see correct products for "<Product>"

    Examples:
      | Product        |
      | business cards |
      | sdjfnjsdfj     |

  @Product_links
  Scenario Outline: searching for a product links
    When I see product link are displayed
    Then I check each "<Product>" link is working

    Examples:
      | Product               |
      | Business Cards        |
      | Postcards             |
      | Square Business Cards |
      | NFC Business Cards+   |
      | Luxe Business Cards   |
      | Stickers              |

  @ServicesType
  Scenario: Check for service type
    When I see service type is displayed
    Then I check service type is correct
      | Next day Business Cards!    |
      | The MOO promise             |
      | Printfinity                 |
      | Square Business Cards       |
      | Cotton Business Cards       |
      | It’s Flyer time!            |
      | Stickers                    |
      | Sample packs for all        |
      | Have 10+ employees?         |


