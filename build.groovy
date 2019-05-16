#!groovy
["git", "checkout", "master"].execute()
println "checkout"
git url: 'https://github.com/jenkinsorganize/newtest.git'
