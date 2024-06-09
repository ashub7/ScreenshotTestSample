# ScreenshotTestSample

This sample demonstrates the basic use of Compose preview screenshot testing. 

# Requirements

To use Compose Preview Screenshot Testing, you need the following:

    Android Gradle 8.5.0-beta01 or higher.
    Kotlin 1.9.20 or higher.

# Generate reference images

    Linux and macOS: ./gradlew updateDebugScreenshotTest (./gradlew {:module:}update{Variant}ScreenshotTest)
    Windows: gradlew updateDebugScreenshotTest (gradlew {:module:}update{Variant}ScreenshotTest)

After the task completes, find the reference images in app/src/debug/screenshotTest/reference ({module}/src/{variant}/screenshotTest/reference).


# Generate a test report

After reference images generated, run the validate task to take a new screenshot and compare it with the reference image:

    Linux and macOS: ./gradlew validateDebugScreenshotTest (./gradlew {:module:}validate{Variant}ScreenshotTest)
    Windows: gradlew validateDebugScreenshotTest (gradlew {:module:}validate{Variant}ScreenshotTest)

The verification task creates an HTML report at {module}/build/reports/screenshotTest/preview/{variant}/index.html.
