# Alpha_Sense_Pet
## Rest API tests for https://petstore.swagger.io/
This repository contains example tests for sample Petstore server.

Toolbox:

- Test automation framework: Cucumber-JUnit
- Reporting: Cucumber HTML Report
- API client/testing framework: Rest-Assured
- Build tool: Maven
- Java 1.8+

In order to run and to generate the test reports execute:

```mvn verify -D cucumber.option="--tags @regression"```

After execution completes, report will be available in ```target/cucumber-html-reports```

How to find the report in project: howToSeeTheReport.png
