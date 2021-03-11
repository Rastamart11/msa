FROM registry.access.redhat.com/fuse7/fuse-java-openshift
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="Microservicio del Open API Product Catalog" org.label-schema.version=0.0.1-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2021-01-18T00:33:59.170 org.label-schema.name=PrsProductCatalogMS org.label-schema.vcs-ref=17ffe05e8cf6c56262c92408c0b28e96364f8cba org.label-schema.vcs-url=https://github.com/lmejia-erpsol/PrsProductCatalog.git
EXPOSE 9088 8778 9779
COPY /deployments /deployments/
