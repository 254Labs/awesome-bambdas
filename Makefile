IMGNAME=awesome-bambdas-jekyll
PORTWEB=4000
PORTRELOAD=4001
USERID=$(shell id -u)
GROUPID=$(shell id -g)
MOUNT=$(shell pwd)

make: local

local: image
	docker run --rm -it -u ${USERID}:${GROUPID} -p "127.0.0.1:${PORTWEB}:4000" -p "127.0.0.1:${PORTRELOAD}:4001" -v ${MOUNT}:/src ${IMGNAME} bash -c "\
		cd /src && \
		bundle install && \
		bundle exec jekyll serve -H "0.0.0.0" -P 4000 --livereload-port 4001 --livereload"

image:
	docker build \
		-t ${IMGNAME} \
		--build-arg USERID=${USERID} .
