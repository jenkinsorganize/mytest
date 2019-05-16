def pipeline
node {
	stage ('Checkout') {
println "starting checkout"
git url: 'https://github.com/jenkinsorganize/newtest.git'
}
}

