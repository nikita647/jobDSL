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
folder('POC/CI-Checks/Applications/Scripted/React') {
    displayName('React')
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Dependency-Scanning') {
    description("Pipeline job for react Dependency-scanning")
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
            scriptPath('CI/Scripted/React/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/DAST') {
    description("Pipeline job for DAST")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-210') 
                }
            }
            scriptPath('CI/Application/Scripted/React/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Unit-Testing') {
    description("Pipeline job for react Unit Testing")
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
            scriptPath('CI/Application/Scripted/React/Unit Testing/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Scripted/React/Bugs-Analysis') {
    description("Pipeline job for react Bugs analysis")
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
            scriptPath('CI/Application/Scripted/React/Bugs analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Static-Code-Analysis') {
    description("Pipeline job for react Static Code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-207') 
                }
            }
            scriptPath('CI/Scripted/React/Static Code Analysis/JenkinsFile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Code-Compilation ') {
    description("Pipeline job for react Code compilation ")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-206') 
                }
            }
            scriptPath('CI/Application/Scripted/React/Code Compilation/Jenkinsfile')
        }
    }
}
