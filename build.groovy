node {
stage ('Clone') {
	git url: 'https://github.com/jenkinsorganize/mytest.git'
}
stage('commit') {
	withCredentials([usernamePassword(credentialsId: 'GitHub', passwordVariable: 'GIT_PASS', usernameVariable: 'GIT_USER')]) { 
	sh '''
	echo hello >> README
	git add .
	git commit -m "README"
	git push --set-upstream https://${GIT_USER}:${GIT_PASS}@github.com/jenkinsorganize/mytest.git master
	'''
	}
}
}
