# Welcome to springboot-graphql-kotlin 🚀
![Version](https://img.shields.io/badge/version-0.1.0-blue.svg?cacheSeconds=2592000)
[![Documentation](https://img.shields.io/badge/documentation-yes-brightgreen.svg)](https://github.com/kefranabg/readme-md-generator#readme)
[![License: MIT](https://img.shields.io/github/license/eduardo-rdguez/springboot-graphql-kotlin)](./LICENSE)
[![Twitter: \_eduardguez](https://img.shields.io/twitter/follow/_eduardguez.svg?style=social)](https://twitter.com/_eduardguez)

> This project has been developed to demonstrate how to build a simple GraphQL API server with Spring Boot, Spring Data JPA, Gradle, Kotlin, Liquibase and PostgreSQL.

## Tech specs 🔖

- Java `8`
- Gradle `7.0.2`
- Spring Boot `2.5.0`
- Spring Data JPA `1.5.10`
- Kotlin `1.5.10`
- Liquibase `4.4.0`
- PostgreSQL `42.2.0`

## Database

Create `graphql_kotlin` database in PostgreSQL:

```sql
CREATE DATABASE graphql_kotlin;
```

Create `graphql_kotlin` schema in PostgreSQL:

```sql
CREATE SCHEMA IF NOT EXISTS graphql_kotlin;
```

## Run
### Environment variable

Activate `dev` profile using environment variable:

```sh
export SPRING_ENV=dev
```

Runs this project as a Spring Boot application:

```sh
gradle bootRun
```

## Build

Assembles this project:

```sh
gradle build -x test
```

## Tests

Run tests this project:

```sh
gradle test
```

## Clean

Deletes the build directory:

```sh
gradle clean
```

## Learn more

* GraphQL: https://graphql.org/learn/

## Author

* Website: https://eduardo-rdguez.github.io/
* Twitter: [@\_eduardguez](https://twitter.com/\_eduardguez)
* Github: [@eduardo-rdguez](https://github.com/eduardo-rdguez)

## License

Copyright © 2021 [Eduardo Rodríguez](https://github.com/eduardo-rdguez).

This project is [MIT](https://github.com/eduardo-rdguez/springboot-graphql-kotlin/blob/main/LICENSE) licensed.