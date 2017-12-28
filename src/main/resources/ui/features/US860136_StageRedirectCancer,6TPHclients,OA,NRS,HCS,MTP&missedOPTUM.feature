#Author: Sukhwinder Singh
@stage @test @stagepi4sprint1
Feature: US860136 STG URL Redirects Cancer, 6 TPH clients, OA, NRS, HCS, MTP & missed OPTUM

  Scenario Outline: Asthma URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                          | RedirectURL                                                    | Page title |
      | https://stg-myoptum.phs.com/asthma | https://stg-myoptum.phs.com/content/optum/en/optum/asthma.html | Asthma     |
      | https://stg-myoptum.phs.com/ASTHMA | https://stg-myoptum.phs.com/content/optum/en/optum/asthma.html | Asthma     |

  Scenario Outline: COPD URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                        | RedirectURL                                                  | Page title |
      | https://stg-myoptum.phs.com/copd | https://stg-myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |
      | https://stg-myoptum.phs.com/COPD | https://stg-myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |

  Scenario Outline: Diabetes URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                            | RedirectURL                                                      | Page title |
      | https://stg-myoptum.phs.com/diabetes | https://stg-myoptum.phs.com/content/optum/en/optum/diabetes.html | Diabetes   |
      | https://stg-myoptum.phs.com/DIABETES | https://stg-myoptum.phs.com/content/optum/en/optum/diabetes.html | Diabetes   |

  Scenario Outline: Heart failure URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                         | RedirectURL                                                   | Page title    |
      | https://stg-myoptum.phs.com/heart | https://stg-myoptum.phs.com/content/optum/en/optum/heart.html | Heart Failure |
      | https://stg-myoptum.phs.com/HEART | https://stg-myoptum.phs.com/content/optum/en/optum/heart.html | Heart Failure |

  Scenario Outline: GAIG (TPH Client-5) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                            | Page title |
      | https://stg.phs.com/gaig       | https://stg.phs.com/content/phs/en/tph/gaig.html       |            |
      | https://stg-myuhc.phs.com/gaig | https://stg-myuhc.phs.com/content/phs/en/tph/gaig.html |            |
      | https://stg.phs.com/GAIG       | https://stg.phs.com/content/phs/en/tph/gaig.html       |            |
      | https://stg-myuhc.phs.com/GAIG | https://stg-myuhc.phs.com/content/phs/en/tph/gaig.html |            |

  Scenario Outline: Cancer Programs URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                  | RedirectURL                                                            | Page title |
      | https://stg.phs.com/cancerprograms         | https://stg.phs.com/content/phs/en/phs/cancerprograms.html             |            |
      | https://stg.phs.com/CANCERprograms         | https://stg.phs.com/content/phs/en/phs/cancerprograms.html             |            |
      | https://stg-myoptum.phs.com/cancerprograms | https://stg-myoptum.phs.com/content/optum/en/optum/cancerprograms.html |            |
      | https://stg-myoptum.phs.com/CANCERprograms | https://stg-myoptum.phs.com/content/optum/en/optum/cancerprograms.html |            |
      | https://stg-myuhc.phs.com/cancerprograms   | https://stg-myuhc.phs.com/content/phs/en/phs/cancerprograms.html       |            |
      | https://stg-myuhc.phs.com/CANCERprograms   | https://stg-myuhc.phs.com/content/phs/en/phs/cancerprograms.html       |            |

  Scenario Outline: CSG (TPH Client-9)  URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                           | Page title |
      | https://stg.phs.com/CSG       | https://stg.phs.com/content/phs/en/tph/csg.html       |            |
      | https://stg.phs.com/csg       | https://stg.phs.com/content/phs/en/tph/csg.html       |            |
      | https://stg-myuhc.phs.com/CSG | https://stg-myuhc.phs.com/content/phs/en/tph/csg.html |            |
      | https://stg-myuhc.phs.com/csg | https://stg-myuhc.phs.com/content/phs/en/tph/csg.html |            |

  Scenario Outline: HCS URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                           | Page title |
      | https://stg.phs.com/HCS       | https://stg.phs.com/content/phs/en/phs/hcs.html       |            |
      | https://stg.phs.com/hcs       | https://stg.phs.com/content/phs/en/phs/hcs.html       |            |
      | https://stg-myuhc.phs.com/hcs | https://stg-myuhc.phs.com/content/phs/en/phs/hcs.html |            |
      | https://stg-myuhc.phs.com/HCS | https://stg-myuhc.phs.com/content/phs/en/phs/hcs.html |            |

  Scenario Outline: LSC (TPH Client-8) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                           | Page title |
      | https://stg.phs.com/lsc       | https://stg.phs.com/content/phs/en/tph/lsc.html       |            |
      | https://stg-myuhc.phs.com/lsc | https://stg-myuhc.phs.com/content/phs/en/tph/lsc.html |            |
      | https://stg.phs.com/LSC       | https://stg.phs.com/content/phs/en/tph/lsc.html       |            |
      | https://stg-myuhc.phs.com/LSC | https://stg-myuhc.phs.com/content/phs/en/tph/lsc.html |            |

  Scenario Outline: MTP URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title |
      | https://stg-myoptum.phs.com/mtp | https://stg-myoptum.phs.com/content/optum/en/optum/mtp.html |            |
      | https://stg-myoptum.phs.com/MTP | https://stg-myoptum.phs.com/content/optum/en/optum/mtp.html |            |

  Scenario Outline: NL  URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title |
      | https://stg.phs.com/NURSE       | https://stg.phs.com/content/phs/en/phs/nurse.html       |            |
      | https://stg.phs.com/nurse       | https://stg.phs.com/content/phs/en/phs/nurse.html       |            |
      | https://stg-myuhc.phs.com/NURSE | https://stg-myuhc.phs.com/content/phs/en/phs/nurse.html |            |
      | https://stg-myuhc.phs.com/nurse | https://stg-myuhc.phs.com/content/phs/en/phs/nurse.html |            |

  Scenario Outline: NRS URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title |
      | https://stg.phs.com/NRS         | https://stg.phs.com/content/phs/en/phs/nrs.html             |            |
      | https://stg.phs.com/nrs         | https://stg.phs.com/content/phs/en/phs/nrs.html             |            |
      | https://stg-myuhc.phs.com/nrs   | https://stg-myuhc.phs.com/content/phs/en/phs/nrs.html       |            |
      | https://stg-myuhc.phs.com/NRS   | https://stg-myuhc.phs.com/content/phs/en/phs/nrs.html       |            |
      | https://stg-myoptum.phs.com/nrs | https://stg-myoptum.phs.com/content/optum/en/optum/nrs.html |            |
      | https://stg-myoptum.phs.com/NRS | https://stg-myoptum.phs.com/content/optum/en/optum/nrs.html |            |

  Scenario Outline: Qorvo (TPH Client-7) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title |
      | https://stg.phs.com/qorvo       | https://stg.phs.com/content/phs/en/tph/qorvo.html       |            |
      | https://stg.phs.com/QORVO       | https://stg.phs.com/content/phs/en/tph/qorvo.html       |            |
      | https://stg-myuhc.phs.com/qorvo | https://stg-myuhc.phs.com/content/phs/en/tph/qorvo.html |            |
      | https://stg-myuhc.phs.com/QORVO | https://stg-myuhc.phs.com/content/phs/en/tph/qorvo.html |            |

  Scenario Outline: Schneider (TPH Client-4) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                           | RedirectURL                                                 | Page title |
      | https://stg.phs.com/schneider       | https://stg.phs.com/content/phs/en/tph/schneider.html       |            |
      | https://stg.phs.com/SCHNeider       | https://stg.phs.com/content/phs/en/tph/schneider.html       |            |
      | https://stg-myuhc.phs.com/SCHNeider | https://stg-myuhc.phs.com/content/phs/en/tph/schneider.html |            |
      | https://stg-myuhc.phs.com/schneider | https://stg-myuhc.phs.com/content/phs/en/tph/schneider.html |            |

  Scenario Outline: YMCA - (TPH Client-6) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                            | Page title |
      | https://stg.phs.com/YMCA       | https://stg.phs.com/content/phs/en/tph/ymca.html       |            |
      | https://stg.phs.com/ymca       | https://stg.phs.com/content/phs/en/tph/ymca.html       |            |
      | https://stg-myuhc.phs.com/YMCA | https://stg-myuhc.phs.com/content/phs/en/tph/ymca.html |            |
      | https://stg-myuhc.phs.com/ymca | https://stg-myuhc.phs.com/content/phs/en/tph/ymca.html |            |

  Scenario Outline: OA URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                                | Page title |
      | https://stg.phs.com/OA         | https://stg.phs.com/content/phs/en/phs/oa.html             |            |
      | https://stg.phs.com/oa         | https://stg.phs.com/content/phs/en/phs/oa.html             |            |
      | https://stg-myuhc.phs.com/oa   | https://stg-myuhc.phs.com/content/phs/en/phs/oa.html       |            |
      | https://stg-myuhc.phs.com/OA   | https://stg-myuhc.phs.com/content/phs/en/phs/oa.html       |            |
      | https://stg-myoptum.phs.com/oa | https://stg-myoptum.phs.com/content/optum/en/optum/oa.html |            |
      | https://stg-myoptum.phs.com/OA | https://stg-myoptum.phs.com/content/optum/en/optum/oa.html |            |
