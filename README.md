# doma-kotlin-migrate

[![](https://jitpack.io/v/momosetkn/doma-kotlin-migrate.svg)](https://jitpack.io/#momosetkn/doma-kotlin-migrate)

A product for migrating to [QueryDsl](https://github.com/domaframework/doma/pull/1203) with doma-kotlin.
It provides Extensions functions like to Entityql, with @Deprecated.
You can migrate to QueryDsl with minimal changes to your existing code.

## Step1 - Install

Add dependency

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.momosetkn:doma-kotlin-migrate:1.0.0")
}
```

## Step2 - Replace your code

Replace to `KQueryDsl` from `KEntityql` by your IDE.

## Step3 - Add import

Add import to your code.

```kotlin
import momosetkn.doma.migrate.querydsl.*

// If you avoid wild import. please use bellow code.
import momosetkn.doma.migrate.querydsl.delete
import momosetkn.doma.migrate.querydsl.update
import momosetkn.doma.migrate.querydsl.insert
```

You can add imports in bulk with the following shell.

```bash
find src/main/kotlin/<target_package> -type f -name "*.kt" -exec sed -i 's/^\(package .*\)/\1\n\nimport momosetkn.doma.migrate.querydsl.*/g' {} +

# If you avoid wild import. please use bellow code.
find src/main/kotlin/<target_package> -type f -name "*.kt" -exec sed -i 's/^\(package .*\)/\1\n\nimport momosetkn.doma.migrate.querydsl.delete\nimport momosetkn.doma.migrate.querydsl.insert\nimport momosetkn.doma.migrate.querydsl.update/g' {} +
```

## Step4 - Replace deprecated with JetBrains IDE

<kbd>Alt + Enter</kbd>(I you use Mac OS, <kbd>Option + Return</kbd>) on target code.
Click `Replace uses of...`.

![Screenshot from 2024-10-13 09-16-32](https://github.com/user-attachments/assets/ef293c48-9578-4ec1-a444-268640e65065)
