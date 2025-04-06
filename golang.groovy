folder('POC') {
    displayName('POC')
}
folder('POC/CI-Checks') {
    displayName('CI-Checks')
}
folder('POC/CI-Checks/Applications') {
    displayName('Applications')
}
folder('POC/CI-Checks/Applications/Shared-Library') {
    displayName('Shared-Library')
}
folder('POC/CI-Checks/Applications/Shared-Library/GoLang') {
    displayName('Golang')
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Dependency-Scanning') {
    description("Pipeline job for Golang dependency scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-196') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Dependency scanning/Jenkinsfile')
        }
    }
}



pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/DAST') {
    description("Pipeline job for Golang DAST scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-195') 
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Code-Compilation') {
    description("Pipeline job for Golang code compilation")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-191') 
                }
            }
            scriptPath('CI/Application/Shared Library/Golang/ Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Unit-Testing') {
     description("Pipeline job for Golang unit testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-194') 
                }
            }
            scriptPath('CI/Application/Shared Library/Go Lang/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Bugs-Analysis') {
    description("Pipeline job for Golang Bugs Scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-193') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Bug Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Static-Code-Analysis') {
    description("Pipeline job for Golang Static code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-192') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Static Code Analysis/Jenkinsfile')
        }
    }
}
