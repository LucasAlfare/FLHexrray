# FLHexrray

This project contains the implementation to a personal approach to work with small arrays.

For example, the array `val arr = arrayOf(1,2,3,4)` can be translated to the hexrray `val hexrray = Hexrray(0x1234)`.

Note that the four different values of the array is stored as the single hexadecimal number `0x1234` in the hexrray. This will give the ability to do things such as `println(hexrray[0])` (prints `1`) and `hexrray[0] = 0xA` (the hexrray turns to `0xA234`).

The main propose to this is attempt to increase performance/speed of array access in cases we're working with small arrays.

Also, this should be applied to arrays containing individual values until max hexadecimal value (`0xf`) and at maximum of 16 different items.

# Download

You can grab this project directly from its [GitHub page](https://github.com/LucasAlfare/FLHexrray) with [Source Dependencies](https://blog.gradle.org/introducing-source-dependencies), from Gradle tool. First, add this to your `settings.gradle.kts`:

```kotlin
sourceControl {
  gitRepository(URI("https://github.com/LucasAlfare/FLHexrray")) {
    producesModule("com.lucasalfare.flhexrray:FLHexrray")
  }
}
```

After, add this to your `build.gradle.kts` to target the `master` branch of this repository:

```kotlin
implementation("com.lucasalfare.flhexrray:FLHexrray") {
  version {
    branch = "master"
  }
}
```