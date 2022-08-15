pipeline {
    agent any

    stages {
        stage('Testing docker compose') {
            steps{
                sh 'docker --version'
                sh 'docker-compose --version'
                sh 'curl --version'
            }
        }

        stage('Prune Docker data') {
            steps{
                sh 'docker system prune -a --volumes -f'
            }
        }
        stage('Start container') {
            steps{
                sh 'docker-compose up -d'
                sh 'docker-compose ps'
            }
        }
    }
    post {
        always {
          sh 'docker-compose down --remove-orphans -v'
          sh 'docker-compose ps'
        }
      }

 }
