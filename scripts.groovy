def checkoutSCM(branch) {
	node {
		stage('SCM Checkout') {
			git url: gitUrl,
			branch: $branch
		}
	}
	
}
