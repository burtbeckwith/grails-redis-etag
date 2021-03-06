grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {
        build(":release:3.0.1",
              ":rest-client-builder:2.0.3") {
            export = false
        }

        // redis support
        compile ':redis:1.6.3'

        compile ':joda-time:1.5'
    }
}
