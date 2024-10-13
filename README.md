# doma-kotlin-migrate

[![](https://jitpack.io/v/momosetkn/doma-kotlin-migrate.svg)](https://jitpack.io/#momosetkn/doma-kotlin-migrate)

A product for migrating to QueryDsl with doma-kotlin.
It provides a method signature similar to Entityql, but it will be marked as @Deprecated.

## Step1 - Install

Add dependency

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.momosetkn.doma-kotlin-migrate-to-querydsl:doma-kotlin-migrate-to-querydsl:0.0.1")
}
```

## Step2 - Add import

Add import to your code.

```kotlin
import momosetkn.doma.migrate.querydsl.*
```

You can add imports in bulk with the following shell.

```bash
find src/main/kotlin/<target_package> -type f -name "*.kt" -exec sed -i 's/^\(package .*\)/\1\n\nimport momosetkn.doma.migrate.querydsl.*/g' {} +
```

## Step3 - Replace with JetBrains IDE

<kbd>Alt + Enter</kbd>(I you use Mac OS, <kbd>Option + Return</kbd>) on target code.
Click `Replace uses of...`.

![Screenshot from 2024-10-13 09-16-32](https://github.com/user-attachments/assets/ef293c48-9578-4ec1-a444-268640e65065)
