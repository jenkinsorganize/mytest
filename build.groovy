def pipeline
node {
println "starting checkout"
["git", "checkout", "master"].execute()
}

