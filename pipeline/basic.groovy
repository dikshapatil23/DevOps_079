pipeline {
    agent any
    environment {
        DB_USER = 'admin'
        DB_PASSWD = 'diksha@123'
        PROD_IP = '3.84.212.146'
        UAT_IP = '172.31.20.1'
    }

    stages {
        stage('codpe pull') {
        environment {
            stage1 =  'first stage'
        }
            steps {
                echo 'Hello World'
                sh 'ls'
                echo "username of my database is ${DB_USER}"
                echo "this is my first stage ${stage1}"
                
        }
    }        
 
         stage('code build') {
            environment {
                 stage2 = 'second stage'
            }
            steps {
                echo 'Hello World'
                sh 'pwd'
                echo "passward of my database is ${DB_PASSWD}"
                echo "this is my second stage ${stage2}"
                      

            }
        }
    }
}
