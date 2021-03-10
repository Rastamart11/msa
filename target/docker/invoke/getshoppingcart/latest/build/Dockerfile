FROM quay.io/jkube/jkube-java-binary-s2i:0.0.8
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description=getShoppingCart org.label-schema.version=0.0.1-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2021-03-10T16:20:13.394 org.label-schema.name=GetShoppingCart org.label-schema.vcs-ref=1d3fdfaa4bb7886c7a05d91a4aa9521f295258d5 org.label-schema.vcs-url=https://github.com/Rastamart11/msa
EXPOSE 9088 8778 9779
COPY /deployments /deployments/
