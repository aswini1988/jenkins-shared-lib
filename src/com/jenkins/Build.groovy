package com.jenkins
//This is to build the docker image.
def build() {
    def IMAGENAME = 'node-web-app'
    def dockerfilePATH = './Dockerfile'
    def REGISTRY_NAME = 'aswini1988'
    println "Preparing docker image..."

    def tag = 'node-web-app'
    
    sh "docker build --no-cache -f ${dockerfilePATH} -t ${REGISTRY_NAME}/${IMAGENAME} ."
}