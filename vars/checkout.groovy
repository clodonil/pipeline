#!/usr/bin/env groovy 


def call(){
   echo "Checkout"
   git  branch: "master",
        url: 'https://github.com/clodonil/accountability.git', 
        credentialsId: "GitHub"
}
