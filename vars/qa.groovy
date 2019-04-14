#!/usr/bin/env groovy 


def call(){
   echo "TestUnit"
   // Coloque aqui os passos para o testUnit Junit
   sh """
       sonar-scanner   -Dsonar.projectKey=accountability   -Dsonar.sources=.   -Dsonar.host.url=http://sonarqube:9000   -Dsonar.login=c10121bed0c29b6f4de54dd1719bfd96c62d72a8
      """
}
