pipeline {
    agent none
    
    stages {
        stage('Test & Build') {
            agent {
                docker {
                    image 'maven:3.8-openjdk-11'
                    args '--rm'
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