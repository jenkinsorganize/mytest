env.DISPLAY=":0"
node(label: 'master') {

    currentBuild.result = "SUCCESS"
    try {
        stage('Checkout') {
			sh "/app/test/tool/groovy-2.4.12/bin/groovy ./build.groovy"
        }

    }
    catch (err) {
        currentBuild.result = "FAILURE"
        throw err
    }
    finally{
        if(currentBuild.result=='SUCCESS'){
		
        }
    }

}
