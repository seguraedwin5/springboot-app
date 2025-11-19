pipeline {
    agent none
    
    stages {
        stage('Test & Build') {
            agent {
                dockerContainer {
                    image 'maven:3.9.11-amazoncorretto-24-alpine'
                    
                }
            }
            steps {
                echo '🚀 Starting build in Docker...'
                sh 'mvn clean package'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}