pipeline {
  agent any
  tools {
    // Install the Maven version configured as "M3" and add it to the path.
    maven "Maven 3.8.4"
    jdk "11"
  }
  stages {
    stage('Preparation') {
      steps {
        sh '''
          echo "PATH = ${PATH}"
          echo "M2_HOME = ${M2_HOME}"
        '''        
        // Get some code from a GitHub repository
        git 'https://github.com/svailer/spring2.git'
      }
    }
    stage('Build') {
      steps {
        // Run Maven on a Unix agent.
        sh "mvn -Dmaven.test.failure.ignore=true clean package"
        // To run Maven on a Windows agent, use
        // bat "mvn -Dmaven.test.failure.ignore=true clean package"
      }
    }
  }
}
