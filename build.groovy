def pipeline
node {
	stage ('Checkout') {
println "starting checkout"
git url: 'https://github.com/jfrogdev/project-examples.git'
}
}

