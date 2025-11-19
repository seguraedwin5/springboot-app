pipeline {
    agent none
    
    stages {
        stage('Test & Build') {
            agent {
                docker {
                    image 'maven:3.9.11-amazoncorretto-24-alpine'
                    args '-v $HOME/.m2:/root/.m2'  // Cache Maven dependencies
                    reuseNode true  // Reuse the workspace on the same node
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