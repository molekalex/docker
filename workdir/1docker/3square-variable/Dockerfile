FROM alpine
RUN apk add openjdk8
ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin
WORKDIR /usr/share/udemy
ADD cuadrados.java cuadrados.java
ENTRYPOINT javac cuadrados.java && java cuadrados $NUMBER	
