FROM alpine
RUN apk add openjdk8
ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin
WORKDIR /usr/share/udemy
ADD test1.java test1.java
ENTRYPOINT javac test1.java && java test1
