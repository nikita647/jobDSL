folder('POC') {
    displayName('POC')
}
folder('POC/CI-Checks') {
    displayName('CI-Checks')
}
folder('POC/CI-Checks/Applications') {
    displayName('Applications')
}
folder('POC/CI-Checks/Applications/Scripted') {
    displayName('Scripted')
}
folder('POC/CI-Checks/Applications/Scripted/GoLang') {
    displayName('GoLang')
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Code-compilation') {
    description("Pipeline job for GoLang Code compilationg")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-185') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Static-code-analysis') {
    description("Pipeline job for Static code analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Static code analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Bug Analysis') {
    description("Pipeline job for Bug Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-187') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Bugs analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Unit Testing') {
    description("Pipeline job for Unit Testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang /Unit Testing/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/DAST') {
    description("Pipeline job for DAST")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-189') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/DAST/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Dependency-Scanning') {
    description("Pipeline job for Dependency Scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-190') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Dependency Scanning/Jenkinsfile')
        }
    }
}
