node {
stage ('Clone') {
	git url: 'https://github.com/jenkinsorganize/mytest.git'
}
stage('commit') {
	sh '''
	touch README
	git add .
	git commit -m "README"
	git push
	'''
}
}
