FROM oracle/graalvm-ce:19.3.3-java11

COPY . /usr/src

RUN yum -y install maven
#RUN mvn -version

RUN cd /usr/src
RUN cd usr/src
RUN pwd
RUN ls
# RUN mvn package -Pgraal

ENTRYPOINT ["tail", "-f", "/dev/null"]
