folder('POC') {
    displayName('POC')
}
folder('POC/CI-Checks') {
    displayName('CI-Checks')
}

folder('POC/CI-Checks/Applications') {
    displayName('Applications')
}

folder('POC/CI-Checks/Applications/Declarative') {
    displayName('Declarative')
}
folder('POC/CI-Checks/Applications/Declarative/React') {
    displayName('React')
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Dependency-Scanning') {
    description("Pipeline job for react declarative Dependency-scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-205') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/DAST') {
    description("Pipeline job for DAST")
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
            scriptPath('CI/Application/Applications/Declarative/React/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Code-Compilation') {
    description("Pipeline job for react Code Compilation")
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
            scriptPath('CI/Application/Declarative/React/Code Compilation/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/React/Unit-Testing') {
    description("Pipeline job for react Unit Testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-203') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Bug-Analysis') {
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
            scriptPath('CI/Declarative/React/Bugs analysis/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/React/Static-Code-Analysis') {
    description("Pipeline job for react Static Code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-201') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Static code analysis/JenkinsFile')
        }
    }
}
