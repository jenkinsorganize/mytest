env.DISPLAY=":0"
node(label: 'slave') {

    currentBuild.result = "SUCCESS"
    try {
        stage('Checkout') {
			checkout scm
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