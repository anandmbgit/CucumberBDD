pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk17'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',url: 'https://github.com/anandmbgit/CucumberBDD.git'
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }     
        
        post{
           always{ 
                                  
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target',
                    reportFiles: 'index.html',
                    reportName: "Cucumber HTML Report"
                ])
            }
        }
    }
}
