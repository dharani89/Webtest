# Webtest Project

Implemented BDD Automation test framework with Cucumber and Selenium using PageObjectModel, Data Driven Testing and reusable Helper classes.

Implemented 2 scenarios 
Scenario 1: Order T-Shirt (and Verify in Order History)
Scenario 2: Update Personal Information (First Name) in My Account

# Configs

Chrome browser driver to be kept under

```bash
/src/test/resources/driver
```

Feature files to be kept under

```bash
/src/test/resources/functionalTest
```

Configs needs to be added under

```bash
/configs
```

Test JSON data files needs to be kept under

```bash
/src/test/resources/testData
```

# Instruction

Place your Web page objects under

```bash
/src/main/test/java/Com/Test/Dharani/PageObjects
```

Place your JSON to Java Objects under

```bash
/src/main/test/java/Com/Test/Dharani/POJO
```

Place your Helper utilities under

```bash
/src/main/test/java/Com/Test/Dharani/utils
```

# Execution

Please use below command to execute the test

```bash
mvn clean install
```

# Reports

Implemented Cucumber Built-In report which could be found under

```bash
/target/cucumber-reports/index.html
```

Sample Reports

* Console Output

![Console Output for Scenario 1](reportImages/scenario1.jpg?raw=true "Scenario 1")

![Console Output for Scenario 2](reportImages/scenario2.jpg?raw=true "Scenario 2")

* HTML Output - Success 

![HTML Output Success](reportImages/htmlOutputSuccess.jpg?raw=true "HTML Output Success")

* HTML Output - Negative/Failure

![HTML Output Failure/Negative](reportImages/htmlOutputFailure.jpg?raw=true "HTML Output Failure/Negative")

# Further Improvements

Reports could be improved leveraging Extent or Allure.
Multi browser support.
Parallel execution (Leveraging TestNG).
More Design Patterns could be included (like Singleton, etc)