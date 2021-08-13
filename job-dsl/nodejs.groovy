job('NodeJS example') {
    scm {
        git('git://github.com/ginny100/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Ginny Dang')
            node / gitConfigEmail('ginnydang0728@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
