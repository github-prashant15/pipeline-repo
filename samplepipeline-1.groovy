pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              git credentialsId: 'gitlab-ssh', url: 'https://github.com/github-prashant15/pipeline-repo.git'
            }
          }
          stage('Test') { 
            steps {
              echo "test is completed"
            }
          }
          stage('Deploy') { 
            steps {
              echo "deploy completed move to production sever"
            }
          }
        }
      }