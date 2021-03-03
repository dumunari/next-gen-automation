# next-gen-automation

Simple automation project to demonstrate E2E Tests and some concepts.

## The Page Object Design Pattern

https://martinfowler.com/bliki/PageObject.html

## Running the project
In the first run, execute the following command:

```mvn install```

This command will install all dependencies and run the tests

In the subsequent runs, you can use:

```mvn test```

## Running by tags
You can run the tests by specifying their tags:

```mvn test -Dcucumber.options="--tags '@crue'"  ```

The above command will only run the tests annotated with the @crue tag

```mvn test -Dcucumber.options="--tags '@crue or @slipknot'"  ```

The above command will only run the tests annotated with the @crue or the @slipknot tag

```mvn test -Dcucumber.options="--tags '@crue and @slipknot'"  ```

The above command will only run the tests annotated with the @crue and the @slipknot tag

```mvn test -Dcucumber.options="--tags 'not @wip'"  ```

The above command will run all the tests, except those annotated with the @wip tag

## Running by features
The following command will run all scenarios inside the given feature file:

```mvn test -Dcucumber.options="src/test/resources/features/google_search.feature"```

## Running by scenarios
The following command will run the scenarios inside the given feature file, but this time only those in the specified lines

```mvn test -Dcucumber.options="src/test/resources/features/google_search.feature:11:17"```