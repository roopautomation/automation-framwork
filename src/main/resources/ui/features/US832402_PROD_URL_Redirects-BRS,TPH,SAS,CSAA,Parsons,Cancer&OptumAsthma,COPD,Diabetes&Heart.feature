#Author: Sukhwinder Singh
@prod @Sprint02PI04
Feature: US832402 PROD URL Redirects - BRS, TPH, SAS, AFG, CSAA, CSG, HCS, LCS, MTP, YMCA, NL,
  Parsons, NRS, OA, Qorvo , SAS, Schneider, TPH, Cancer & Optum: Asthma, COPD, Diabetes & Heart

  Scenario Outline: Asthma URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                       | RedirectURL                                                | Page title |
      | https://myoptum.phs.com/asthma | https://myoptum.phs.com/content/optum/en/optum/asthma.html | Asthma     |
      | https://myoptum.phs.com/ASTHMA | https://myoptum.phs.com/content/optum/en/optum/asthma.html | Asthma     |

  Scenario Outline: COPD URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                     | RedirectURL                                              | Page title |
      | https://myoptum.phs.com/copd | https://myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |
      | https://myoptum.phs.com/COPD | https://myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |

  Scenario Outline: Diabetes URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                         | RedirectURL                                                  | Page title |
      | https://myoptum.phs.com/diabetes | https://myoptum.phs.com/content/optum/en/optum/diabetes.html | Diabetes   |
      | https://myoptum.phs.com/DIABETES | https://myoptum.phs.com/content/optum/en/optum/diabetes.html | Diabetes   |

  Scenario Outline: Heart failure URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                      | RedirectURL                                               | Page title    |
      | https://myoptum.phs.com/heart | https://myoptum.phs.com/content/optum/en/optum/heart.html | Heart Failure |
      | https://myoptum.phs.com/HEART | https://myoptum.phs.com/content/optum/en/optum/heart.html | Heart Failure |

  Scenario Outline: AFG (TPH Client-5) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title |
      | https://phs.com/afg       | https://www.phs.com/content/phs/en/tph/afg.html   |            |
      | https://www.phs.com/afg   | https://www.phs.com/content/phs/en/tph/afg.html   |            |
      | https://www.phs.com/AFG   | https://www.phs.com/content/phs/en/tph/afg.html   |            |
      | https://myuhc.phs.com/afg | https://myuhc.phs.com/content/phs/en/tph/afg.html |            |
      | https://phs.com/AFG       | https://www.phs.com/content/phs/en/tph/afg.html   |            |
      | https://myuhc.phs.com/AFG | https://myuhc.phs.com/content/phs/en/tph/afg.html |            |

  Scenario Outline: Cancer Programs URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                               | RedirectURL                                                        | Page title |
      | https://phs.com/cancerprograms         | https://www.phs.com/content/phs/en/phs/cancerprograms.html         |            |
      | https://phs.com/CANCERprograms         | https://www.phs.com/content/phs/en/phs/cancerprograms.html         |            |
      | https://www.phs.com/cancerprograms     | https://www.phs.com/content/phs/en/phs/cancerprograms.html         |            |
      | https://www.phs.com/CANCERprograms     | https://www.phs.com/content/phs/en/phs/cancerprograms.html         |            |
      | https://myoptum.phs.com/cancerprograms | https://myoptum.phs.com/content/optum/en/optum/cancerprograms.html |            |
      | https://myoptum.phs.com/CANCERprograms | https://myoptum.phs.com/content/optum/en/optum/cancerprograms.html |            |
      | https://myuhc.phs.com/cancerprograms   | https://myuhc.phs.com/content/phs/en/phs/cancerprograms.html       |            |
      | https://myuhc.phs.com/CANCERprograms   | https://myuhc.phs.com/content/phs/en/phs/cancerprograms.html       |            |

  Scenario Outline: CSG (TPH Client-9)  URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title |
      | https://phs.com/CSG       | https://www.phs.com/content/phs/en/tph/csg.html   |            |
      | https://phs.com/csg       | https://www.phs.com/content/phs/en/tph/csg.html   |            |
      | https://www.phs.com/CSG   | https://www.phs.com/content/phs/en/tph/csg.html   |            |
      | https://www.phs.com/csg   | https://www.phs.com/content/phs/en/tph/csg.html   |            |
      | https://myuhc.phs.com/CSG | https://myuhc.phs.com/content/phs/en/tph/csg.html |            |
      | https://myuhc.phs.com/csg | https://myuhc.phs.com/content/phs/en/tph/csg.html |            |

  Scenario Outline: HCS URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title |
      | https://phs.com/HCS       | https://www.phs.com/content/phs/en/phs/hcs.html   |            |
      | https://phs.com/hcs       | https://www.phs.com/content/phs/en/phs/hcs.html   |            |
      | https://www.phs.com/HCS   | https://www.phs.com/content/phs/en/phs/hcs.html   |            |
      | https://www.phs.com/hcs   | https://www.phs.com/content/phs/en/phs/hcs.html   |            |
      | https://myuhc.phs.com/hcs | https://myuhc.phs.com/content/phs/en/phs/hcs.html |            |
      | https://myuhc.phs.com/HCS | https://myuhc.phs.com/content/phs/en/phs/hcs.html |            |

  Scenario Outline: LSC (TPH Client-8) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title |
      | https://phs.com/lsc       | https://www.phs.com/content/phs/en/tph/lsc.html   |            |
      | https://www.phs.com/lsc   | https://www.phs.com/content/phs/en/tph/lsc.html   |            |
      | https://myuhc.phs.com/lsc | https://myuhc.phs.com/content/phs/en/tph/lsc.html |            |
      | https://phs.com/LSC       | https://www.phs.com/content/phs/en/tph/lsc.html   |            |
      | https://www.phs.com/LSC   | https://www.phs.com/content/phs/en/tph/lsc.html   |            |
      | https://myuhc.phs.com/LSC | https://myuhc.phs.com/content/phs/en/tph/lsc.html |            |

  Scenario Outline: MTP URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title |
      | https://myoptum.phs.com/mtp | https://myoptum.phs.com/content/optum/en/optum/mtp.html |            |
      | https://myoptum.phs.com/MTP | https://myoptum.phs.com/content/optum/en/optum/mtp.html |            |

  Scenario Outline: NL  URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                         | Page title |
      | https://phs.com/NURSE       | https://www.phs.com/content/phs/en/phs/nurse.html   |            |
      | https://phs.com/nurse       | https://www.phs.com/content/phs/en/phs/nurse.html   |            |
      | https://www.phs.com/NURSE   | https://www.phs.com/content/phs/en/phs/nurse.html   |            |
      | https://www.phs.com/nurse   | https://www.phs.com/content/phs/en/phs/nurse.html   |            |
      | https://myuhc.phs.com/NURSE | https://myuhc.phs.com/content/phs/en/phs/nurse.html |            |
      | https://myuhc.phs.com/nurse | https://myuhc.phs.com/content/phs/en/phs/nurse.html |            |

  Scenario Outline: NRS URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title |
      | https://phs.com/NRS         | https://www.phs.com/content/phs/en/phs/nrs.html         |            |
      | https://phs.com/nrs         | https://www.phs.com/content/phs/en/phs/nrs.html         |            |
      | https://www.phs.com/NRS     | https://www.phs.com/content/phs/en/phs/nrs.html         |            |
      | https://www.phs.com/nrs     | https://www.phs.com/content/phs/en/phs/nrs.html         |            |
      | https://myuhc.phs.com/nrs   | https://myuhc.phs.com/content/phs/en/phs/nrs.html       |            |
      | https://myuhc.phs.com/NRS   | https://myuhc.phs.com/content/phs/en/phs/nrs.html       |            |
      | https://myoptum.phs.com/nrs | https://myoptum.phs.com/content/optum/en/optum/nrs.html |            |
      | https://myoptum.phs.com/NRS | https://myoptum.phs.com/content/optum/en/optum/nrs.html |            |

  Scenario Outline: Qorvo (TPH Client-7) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                         | Page title |
      | https://phs.com/qorvo       | https://www.phs.com/content/phs/en/tph/qorvo.html   |            |
      | https://phs.com/QORVO       | https://www.phs.com/content/phs/en/tph/qorvo.html   |            |
      | https://www.phs.com/qorvo   | https://www.phs.com/content/phs/en/tph/qorvo.html   |            |
      | https://www.phs.com/QORVO   | https://www.phs.com/content/phs/en/tph/qorvo.html   |            |
      | https://myuhc.phs.com/qorvo | https://myuhc.phs.com/content/phs/en/tph/qorvo.html |            |
      | https://myuhc.phs.com/QORVO | https://myuhc.phs.com/content/phs/en/tph/qorvo.html |            |

  Scenario Outline: Schneider (TPH Client-4) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                        | RedirectURL                                             | Page title |
      | https://phs.com/schneider       | https://www.phs.com/content/phs/en/tph/schneider.html   |            |
      | https://phs.com/SCHNeider       | https://www.phs.com/content/phs/en/tph/schneider.html   |            |
      | https://www.phs.com/schneider   | https://www.phs.com/content/phs/en/tph/schneider.html   |            |
      | https://www.phs.com/SCHNeider   | https://www.phs.com/content/phs/en/tph/schneider.html   |            |
      | https://myuhc.phs.com/SCHNeider | https://myuhc.phs.com/content/phs/en/tph/schneider.html |            |
      | https://myuhc.phs.com/schneider | https://myuhc.phs.com/content/phs/en/tph/schneider.html |            |

  Scenario Outline: YMCA - (TPH Client-6) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                   | RedirectURL                                        | Page title |
      | https://phs.com/YMCA       | https://www.phs.com/content/phs/en/tph/ymca.html   |            |
      | https://phs.com/ymca       | https://www.phs.com/content/phs/en/tph/ymca.html   |            |
      | https://www.phs.com/YMCA   | https://www.phs.com/content/phs/en/tph/ymca.html   |            |
      | https://www.phs.com/ymca   | https://www.phs.com/content/phs/en/tph/ymca.html   |            |
      | https://myuhc.phs.com/YMCA | https://myuhc.phs.com/content/phs/en/tph/ymca.html |            |
      | https://myuhc.phs.com/ymca | https://myuhc.phs.com/content/phs/en/tph/ymca.html |            |

  Scenario Outline: OA URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                   | RedirectURL                                            | Page title |
      | https://phs.com/OA         | https://www.phs.com/content/phs/en/phs/oa.html         |            |
      | https://phs.com/oa         | https://www.phs.com/content/phs/en/phs/oa.html         |            |
      | https://www.phs.com/OA     | https://www.phs.com/content/phs/en/phs/oa.html         |            |
      | https://www.phs.com/oa     | https://www.phs.com/content/phs/en/phs/oa.html         |            |
      | https://myuhc.phs.com/oa   | https://myuhc.phs.com/content/phs/en/phs/oa.html       |            |
      | https://myuhc.phs.com/OA   | https://myuhc.phs.com/content/phs/en/phs/oa.html       |            |
      | https://myoptum.phs.com/oa | https://myoptum.phs.com/content/optum/en/optum/oa.html |            |
      | https://myoptum.phs.com/OA | https://myoptum.phs.com/content/optum/en/optum/oa.html |            |

  Scenario Outline: Bariatric Resource Services (BRS) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title                  |
      | https://phs.com/brs         | https://www.phs.com/content/phs/en/phs/brs.html         | Bariatric Resource Services |
      | https://phs.com/BRS         | https://www.phs.com/content/phs/en/phs/brs.html         | Bariatric Resource Services |
      | https://myuhc.phs.com/brs   | https://myuhc.phs.com/content/phs/en/phs/brs.html       | Bariatric Resource Services |
      | https://myoptum.phs.com/brs | https://myoptum.phs.com/content/optum/en/optum/brs.html | Bariatric Resource Services |
      | https://www.phs.com/BRS     | https://www.phs.com/content/phs/en/phs/brs.html         | Bariatric Resource Services |
      | https://www.phs.com/brs     | https://www.phs.com/content/phs/en/phs/brs.html         | Bariatric Resource Services |
      | https://myuhc.phs.com/BRS   | https://myuhc.phs.com/content/phs/en/phs/brs.html       | Bariatric Resource Services |
      | https://myoptum.phs.com/BRS | https://myoptum.phs.com/content/optum/en/optum/brs.html | Bariatric Resource Services |

  Scenario Outline: Total Population Health Value URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                   | Page title |
      | https://phs.com/tph       | https://www.phs.com/content/phs/en/tph.html   | TPH        |
      | https://phs.com/TPH       | https://www.phs.com/content/phs/en/tph.html   | TPH        |
      | https://myuhc.phs.com/tph | https://myuhc.phs.com/content/phs/en/tph.html | TPH        |
      | https://www.phs.com/TPH   | https://www.phs.com/content/phs/en/tph.html   | TPH        |
      | https://www.phs.com/tph   | https://www.phs.com/content/phs/en/tph.html   | TPH        |
      | https://myuhc.phs.com/TPH | https://myuhc.phs.com/content/phs/en/tph.html | TPH        |

  Scenario Outline: Client 1 (Samsung Austin Semiconductor) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title |
      | https://phs.com/sas       | https://www.phs.com/content/phs/en/tph/sas.html   |            |
      | https://phs.com/SAS       | https://www.phs.com/content/phs/en/tph/sas.html   |            |
      | https://myuhc.phs.com/sas | https://myuhc.phs.com/content/phs/en/tph/sas.html |            |
      | https://www.phs.com/SAS   | https://www.phs.com/content/phs/en/tph/sas.html   |            |
      | https://www.phs.com/sas   | https://www.phs.com/content/phs/en/tph/sas.html   |            |
      | https://myuhc.phs.com/SAS | https://myuhc.phs.com/content/phs/en/tph/sas.html |            |

  Scenario Outline: Client 2 (CSAA) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                   | RedirectURL                                        | Page title       |
      | https://phs.com/csaa       | https://www.phs.com/content/phs/en/tph/csaa.html   | Health Advantage |
      | https://phs.com/CSAA       | https://www.phs.com/content/phs/en/tph/csaa.html   | Health Advantage |
      | https://myuhc.phs.com/csaa | https://myuhc.phs.com/content/phs/en/tph/csaa.html | Health Advantage |
      | https://www.phs.com/CSAA   | https://www.phs.com/content/phs/en/tph/csaa.html   | Health Advantage |
      | https://www.phs.com/csaa   | https://www.phs.com/content/phs/en/tph/csaa.html   | Health Advantage |
      | https://myuhc.phs.com/CSAA | https://myuhc.phs.com/content/phs/en/tph/csaa.html | Health Advantage |

  Scenario Outline: Client 3 (Parsons Corporation) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                      | RedirectURL                                           | Page title |
      | https://phs.com/parsons       | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://phs.com/PARSONS       | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://myuhc.phs.com/parsons | https://myuhc.phs.com/content/phs/en/tph/parsons.html |            |
      | https://www.phs.com/PARSONS   | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://www.phs.com/parsons   | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://myuhc.phs.COM/parsons | https://myuhc.phs.com/content/phs/en/tph/parsons.html |            |
