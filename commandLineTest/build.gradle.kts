plugins {
    id("taxi.java-application-conventions")
}

dependencies {
    implementation(project(":common"))
}

application {
    mainClass.set("eichinger.peter.taxi.commandLineTest.Test")
}