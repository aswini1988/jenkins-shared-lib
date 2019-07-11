package com.jenkins
//This is to build the docker image.
def deploy() {
    def IMAGENAME = 'node-web-app'
    def dockerfilePATH = './Dockerfile'
    def REGISTRY_NAME = 'aswini1988'
    println "Preparing docker image..."

    def tag = 'node-web-app'
    
    sh "docker run -p 5000:5000 node-web-app"
}