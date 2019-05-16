node {
stage ('Clone') {
	git url: 'https://github.com/jenkinsorganize/mytest.git'
}
stage('commit') {
	withCredentials([usernamePassword(credentialsId: 'bfa8e939-5f84-4232-a623-ce5d0dd36d14', passwordVariable: 'GIT_PASS', usernameVariable: 'GIT_USER')]) { 
	sh '''
	touch README
	git add .
	git commit -m "README"
	git push --set-upstream https://${GIT_USER}:${GIT_PASS}@github.com/jenkinsorganize/mytest.git master
	'''
	}
}
}
