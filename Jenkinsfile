pipeline {
    agent none
    
    stages {
        stage('Test & Build') {
            agent {
                dockerContainer {
                    image 'maven:3.8.3-openjdk-11'
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