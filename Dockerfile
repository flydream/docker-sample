FROM tomcat

MAINTAINER Stephen Harrison <stephen@harrison.org>

ADD target/docker-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
