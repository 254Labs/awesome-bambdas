# ubuntu rather than ruby to leave other build options open for later
FROM ubuntu:jammy-20231004

# not a root image
ARG USERID=1000

# to fix SCSS build errors
ENV LC_ALL C.UTF-8
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US.UTF-8

# dependencies
ENV DEBIAN_FRONTEND noninteractive
RUN apt update && apt upgrade -y --no-install-recommends
RUN apt install -y --no-install-recommends \
	git \
	ca-certificates \
	ruby-full \
	build-essential \
	zlib1g-dev 

# not a root image
RUN adduser jekyll -uid "$USERID"
RUN mkdir /src
RUN chown -R jekyll:jekyll /src
USER jekyll

# install jekyll
ENV GEM_HOME /home/jekyll/gems
ENV PATH /home/jekyll/gems/bin:$PATH
RUN gem install jekyll bundler

# web server
EXPOSE 4000
# auto reload
EXPOSE 4001

WORKDIR /src

CMD jekyll
