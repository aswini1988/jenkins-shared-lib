import com.jenkins.Deploy

def call(){
    Deploy deployObj = new Deploy();
    deployObj.deploy()
}