FROM tomcat:9.0.85-jdk21
# war 파일을 tomcat의 webapps로 복사
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]

