pipeline {
    agent {
        label 'pc'
    }
    
    stages {
        stage('Test & Build') {
            agent {
                docker {
                    image 'maven:3.9.11-amazoncorretto-24-alpine'
                    label 'pc'
                    args '--network=host'
                    reuseNode true
                }
            }
            steps {
                echo '🚀 Starting build in Docker...'
                sh 'mvn clean package -Dmaven.repo.local=/tmp/.m2/repository'
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