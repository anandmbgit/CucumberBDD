pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk17'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', 
                credentialsId: 'github-creds',
                 url: 'https://github.com/anandmbgit/CucumberBDD.git'
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
            stage('Verify HTML Report') {
            steps {
                // List all files in target/ to confirm report generation
               bat 'dir target\\cucumber-html-report /s'
            }
        }
        
        stage('Publish HTML Report') {
            steps {
                
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
