pipeline {
  agent {
    node {
      label 'master'
    }
  }
  stages {
    stage('Build') {
      steps {
        // Run Maven on a Unix agent.
        withMaven(maven: 'M3')
        sh "mvn -Dmaven.test.failure.ignore=true clean package"
        // To run Maven on a Windows agent, use
        // bat "mvn -Dmaven.test.failure.ignore=true clean package"
      }
    }
  }
}
