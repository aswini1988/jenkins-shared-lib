import com.jenkins.Build

def call(){
    Build buildObj = new Build();
    buildObj.build()
}