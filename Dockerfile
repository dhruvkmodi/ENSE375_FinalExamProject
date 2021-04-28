FROM openjdk:8-jdk
RUN apt-get update
RUN apt-get install -y maven
COPY RiskMeter /usr/src/ENSE375_FinalExamProject/ENSE375 exam/ENSE375 exam
WORKDIR /usr/src/ENSE375_FinalExamProject/ENSE375 exam/ENSE375 exam
RUN mvn package
