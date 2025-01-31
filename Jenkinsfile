pipeline {
    agent any
    
    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/Teacup-repo/Github-DevSecOps.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package' // Change to Gradle if needed: 'gradle build'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
