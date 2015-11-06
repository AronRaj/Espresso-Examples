# Espresso-Examples
A reference project for all of those things you forgot how to do in [Espresso](https://code.google.com/p/android-test-kit/wiki/Espresso)!

## About
This repository contains an example Android application and a number of helpful Espresso UI tests to act as a helpful reference. The Espresso [Package Reference](https://android-test-kit.googlecode.com/git/docs/javadocs/espresso/espresso-core-2.0-javadoc/reference/android/support/test/espresso/package-summary.html) can be found here.

## How to use

To use test execute the tests you will can execute using the gradle command: `./gradlew app:createDebugCoverageReport` or by building the tests with a test configuration in Android Studio.


## Dependencies

* Android Testing Library

    ```gradle
        dependencies {
            //Provides AndroidJUnitRunner
            androidTestCompile 'com.android.support.test:runner:0.4'

            // Provides JUnit 4 rules
            androidTestCompile 'com.android.support.test:rules:0.4'

            // Espresso Core
            androidTestCompile 'com.android.support.test.espresso:espresso-core:2.2.1'

            // Espresso Contrib
            androidTestCompile 'com.android.support.test.espresso:espresso-contrib:2.2.1'
        }
    ```

## Wiki
Checkout the project Wiki to see what Espresso methods are tested within the project with an explanation of what they do and where to find them in the official documentation.

## JaCoCo Coverage

To add code coverage add this to your gradle file.

```gradle
    debug {
        testCoverageEnabled true
    }
```

The [JaCoCo](http://www.eclemma.org/jacoco/) Coverage plugin has been included to demonstrate coverage reporting. The Code Coverage can be found in the following directory structure within the module you are testing `build/outputs/reports/coverage/debug/index.html`


## Contact me
[+JordanTerry](https://plus.google.com/+JordanTerry/posts)

[@Jordan_Terry](https://twitter.com/Jordan_Terry)
