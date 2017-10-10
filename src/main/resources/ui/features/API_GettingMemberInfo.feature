Feature: Validate Get service response and member info Using member ID

  Scenario Outline: Validating Get service response member firstName, Phone number and type
    Given Member exists with HSID as "<hsid>"
    When User retrieves member info as Json using endpont
    Then Response contains success message
    And Response contains Name as "<memberName>"

    # And Response contains Phone number
    # And Response contains contains phone Type
    Examples: 
      | hsid                                 | memberName |
      | 1040285b-203f-4bfd-b7cb-7968e2456c8a | Point      |
