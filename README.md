# doma-kotlin-migrate

A product for migrating to QueryDsl with doma-kotlin

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
