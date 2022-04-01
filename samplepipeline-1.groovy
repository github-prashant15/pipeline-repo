pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              echo "Build Successfull"
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