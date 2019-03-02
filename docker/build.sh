rootPath=/Users/sunso520/code/IdeaProjects/demo/spring-cloud-demo/
targetPath=$rootPath"docker/"
buildProject="eureka-server,config-server,gateway,service-core,service-sms,service-client"
jarSuffix="-1.0.0-SNAPSHOT.jar"

if [ -n "$1" ];then
    buildProject=$1
fi

cd $rootPath
# mvn install -DskipTests

buildProject=${buildProject//,/  }

for project in $buildProject
do
    pid=$(docker ps |grep $project | awk '{print $1}' | sort -r)

    echo "-----------------do project "$project"------------------pid "$pid
    rm -f $targetPath$project$jarSuffix
    cp $rootPath$project"/target/"$project$jarSuffix $targetPath$project".jar"

    if [ -n "$pid" ];then
        docker stop $pid
        docker rm $pid
        # docker stop $(docker ps |grep eureka | awk '{print $1}' | sort -r)
    fi
done

cd $targetPath
# docker-compose -f docker-compose-test.yml up -d