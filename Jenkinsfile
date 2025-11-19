pipeline {
    agent {
        label 'java24'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                bat 'mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                echo 'Deployment complete.'
                
            }
        }
    }
}