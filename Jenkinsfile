pipeline {
    agent { label 'Built-In Node'}


    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/Teacup-repo/Github-DevSecOps.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'echo "Simulating Build Process on Windows"'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'echo "Simulating Tests Execution on Windows"'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs for details.'
        }
    }
}
