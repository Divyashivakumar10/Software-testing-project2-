pipeline {
  agent any
  stages {
    stage('Build ') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test ') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Delivery ') {
      steps {
        sh 'echo "lon342 Divya Shivakumar"'
      }
    }

  }
}
