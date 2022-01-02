# Jackson Kotlin Java Modules Issue

This is a bare bones Gradle project which reproduces [the issue](https://github.com/FasterXML/jackson-databind/issues/3319)
in Jackson 2.13.x whereby a _Kotlin_ project which has Java modules enabled encounters the following error:

```bash
> Task :compileKotlin FAILED
e: Module com.fasterxml.jackson.databind cannot be found in the module graph
```

Simply run ` ./gradlew clean classes` to reproduce the error.

This issue seems to with all JDK versions from 9 onwards, including 11, and it seems to be specific to Kotlin.
Converting this to a Java project will cause the issue to go away.
