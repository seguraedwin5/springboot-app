pipeline {
    agent none
    
    stages {
        stage('Test & Build') {
            agent {
                docker {
                    image 'maven:3.9.11-amazoncorretto-24-alpine'
                    label 'pc'  // Tu PC Windows con Docker
                    args '-v C:/Users/tu_usuario/.m2:/root/.m2'  // Ruta Windows
                    reuseNode true
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