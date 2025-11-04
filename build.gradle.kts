plugins {
    id("org.asciidoctor.jvm.pdf") version "4.0.5"
}

group = "pl.poznachowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.asciidoctorPdf {
    setSourceDir(file("src/cv"))
    setOutputDir(file("cv"))
    setTheme("cv")
}

pdfThemes {
    local("cv") {
        themeDir = file("src/theme")
        themeName = "cv.yml"
    }
}

