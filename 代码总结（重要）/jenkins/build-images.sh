#!/bin/bash
MODULE=$1
echo “module=” ${MODULE}
TIME=`date "+%Y%m%d%H%M"`
echo ${TIME}
GIT_REVISION= `git log -1 --pretty=format:"%h"`
IMAGE_NAME=eureka/${MODULE}:${TIME}_${GIT_REVISON}
cd ${MODULE}

docker build -t ${IMAGE_NAME} .
cd -

docker push ${IMAGE_NAME}
