val domaVersion = rootProject.properties["domaVersion"] as String

dependencies {
    // doma2
    implementation("org.seasar.doma:doma-core:$domaVersion")
    implementation("org.seasar.doma:doma-kotlin:$domaVersion")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
