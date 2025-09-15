pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk17'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/anandmbgit/CucumberBDD.git'
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }

            stage('Verify Reports') {
            steps {
                // List all files in target/ to confirm report generation
                bat 'dir target /s'
            }
        }
        }
        stage('Publish Reports') {
            steps {
                junit 'target/cucumber.xml'
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/cucumber-html-report',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber HTML Report'
                ])
            }
        }
    }
}
