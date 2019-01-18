FROM java:openjdk-8-jre-alpine

# Install cURL
RUN echo -e "https://mirror.tuna.tsinghua.edu.cn/alpine/v3.4/main\n\
https://mirror.tuna.tsinghua.edu.cn/alpine/v3.4/community" > /etc/apk/repositories

RUN apk --update add curl bash && \
      rm -rf /var/cache/apk/*

# docker build -t sunso:openjdk-8-jre-alpine .
