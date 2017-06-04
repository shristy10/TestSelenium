$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/com.business.validations/Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file consists of business validation",
  "description": "",
  "id": "this-feature-file-consists-of-business-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "To validate our test2",
  "description": "",
  "id": "this-feature-file-consists-of-business-validation;to-validate-our-test2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@RunTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "The configuration are loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User navigate to the website",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should see the title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User input the text in \u003csearchText\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks the \u003cactionOnButton\u003e button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User closes the webDriver",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "this-feature-file-consists-of-business-validation;to-validate-our-test2;",
  "rows": [
    {
      "cells": [
        "searchText",
        "actionOnButton"
      ],
      "line": 20,
      "id": "this-feature-file-consists-of-business-validation;to-validate-our-test2;;1"
    },
    {
      "cells": [
        "Selenium",
        "search"
      ],
      "line": 21,
      "id": "this-feature-file-consists-of-business-validation;to-validate-our-test2;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "To validate our test2",
  "description": "",
  "id": "this-feature-file-consists-of-business-validation;to-validate-our-test2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@RunTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "The configuration are loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User navigate to the website",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should see the title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User input the text in Selenium",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks the search button",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User closes the webDriver",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.theConfigurationAreLoaded()"
});
formatter.result({
  "duration": 6609229134,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userNavigateToTheWebsite()"
});
formatter.result({
  "duration": 3991346781,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldSeeTheTitle()"
});
formatter.result({
  "duration": 95103919,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.userInputTheTextInSearchbox(String)"
});
formatter.result({
  "duration": 751282132,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    }
  ],
  "location": "MyStepdefs.userClicksTheSearchButton(String)"
});
formatter.result({
  "duration": 1113960863,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClosesTheWebDriver()"
});
formatter.result({
  "duration": 245502510,
  "status": "passed"
});
});