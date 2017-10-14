Feature: Validate Get service response and member info Using member ID

  Scenario: Validating Get service response member firstName, Phone number and type
    Given Member exists with HSID as "1040285b-203f-4bfd-b7cb-7968e2456c8a"
    When User retrieves member info as Json using endpont
    Then Response contains success message
    And Response contains Name as "Point"

