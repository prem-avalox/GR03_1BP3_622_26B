pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'Maven 3'
    }

    stages {
        stage('Compilar y probar') {
            steps {
                sh 'mvn -B clean test'
            }
        }
        stage('Empaquetar JAR') {
            steps {
                sh 'mvn -B package -DskipTests'
                sh 'java -jar target/GR03_1BP3_622_26B-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
