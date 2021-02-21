pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }

        stage("Unit test"){
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code coverage"){
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                        reportDir: 'build/reports/jacoco/test/html',
                        reportFile: 'index.html',
                        reportName: "Jacoco Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Static code analysis"){
            steps{
                sh "./gradlew checkstyleMain"
            }
        }
    }
}