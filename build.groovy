node {
stage ('Clone') {
	git url: 'https://github.com/jenkinsorganize/newtest.git'
}
stage('commit') {
def getGitCommit() {
    git_commit = sh (
        script: 'git rev-parse HEAD',
        returnStdout: true
    ).trim()
    return git_commit
}

}
