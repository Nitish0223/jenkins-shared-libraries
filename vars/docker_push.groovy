def call(){
  withCredentials([usernamePassword(
                'credentialsId': "dockerHub",
                passwordVariable: "dockerpass",
                usernameVariable: "dockeruserName")]){
                echo "Pushing it to docker Hub"
                sh "docker login -u ${env.dockeruserName} -p ${env.dockerpass}"
                sh "docker image tag notes-app:latest ${env.dockeruserName}/notes-app:latest"
                sh "docker push ${env.dockeruserName}/notes-app:latest"
}
