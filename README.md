# evilolive

A simple Java application that demonstrates how to use the [`tacocat`](https://github.com/rahmasir/tacocat) library.

## What is this?

`evilolive` is a basic command-line application whose primary purpose is to serve as an example of how to import and use the `tacocat` Maven module from JitPack.

It uses the `PalindromeChecker` from the `tacocat` library to check if "evilolive" (and other strings) are palindromes.

## How to Run

To run this project, you will need Java and Maven installed.

**1. Clone the repository:**

```
git clone https://github.com/rahmasir/evilOlive.git
```

**2. Navigate into the project directory:**

```
cd evilOlive
```

**3. Compile and run the application using Maven:**

```
# This command will download dependencies, compile the code, and run the main class
mvn clean compile exec:java -Dexec.mainClass="com.myname.consumer.App"
```

_(Note: You may need to change `com.myname.consumer.App` to match the main class in your project if it's different.)_

You should see output in your terminal showing the results of the palindrome check.

## Project Dependencies

This project relies on the `tacocat` library, which is fetched from JitPack. The `pom.xml` is configured with the necessary repository and dependency information.

**JitPack Repository in `pom.xml`:**

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

**`tacocat` Dependency in `pom.xml`:**

```
<dependency>
    <groupId>com.github.rahmasir</groupId>
    <artifactId>tacocat</artifactId>
    <version>v1.0.0</version>
</dependency>
```