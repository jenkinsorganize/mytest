def pipeline
node {
	stage ('Checkout') {
println "starting checkout"
["git", "checkout", "master"].execute()
}
}

