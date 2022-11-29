podTemplate(containers: [containerTemplate(name: 'maven', image: 'maven', command: 'sleep', args: 'infinity')]) {
  node("master") {
    checkout scm
    container('maven') {
      sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
    }
    junit '**/target/surefire-reports/TEST-*.xml'
  }
}
