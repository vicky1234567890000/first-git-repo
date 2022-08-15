pipeline {
    agent any

    stages {
        stage('Testing docker tooling') {
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

 }
