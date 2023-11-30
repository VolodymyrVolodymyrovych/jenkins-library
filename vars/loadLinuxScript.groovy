def call(Map config = [:]){
    def scriptcontent = libraryResource "org/foo/scripts/${config.name}"
    writeFile file: "${config.name}" , text: scriptcontent
    sh "chmod a+x ./${config.name}"
}